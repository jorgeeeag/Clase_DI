package org.example.pizzeria.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.example.pizzeria.dao.PedidoDAOImp;
import org.example.pizzeria.model.Pedidos;
import org.example.pizzeria.model.Pizzas;

import java.net.URL;
import java.util.ResourceBundle;

public class PizzeriaController implements Initializable {
    @FXML
    private TextField textFieldNombre;
    @FXML
    private TextField textFieldNumero;
    @FXML
    private ComboBox<String> comboBoxSeleccionar;
    @FXML
    private RadioButton radioButtonFamiliar;

    @FXML
    private RadioButton radioButtonMediano;

    @FXML
    private RadioButton radioButtonPequeña;

    @FXML
    private Button buttonRealizarPedido;

    @FXML
    private Button buttonVerDetalles;

    @FXML
    private Button buttonQuitarPedidos;

    @FXML
    private ListView<Pedidos> listViewPedidos;

    private PedidoDAOImp usuarioDAOImp;

    private ToggleGroup grupoTamañoPizza;
    private ObservableList<Pedidos>listaPedidos;
    private ObservableList<String>listaTiposPizzas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        acciones();
        instancias();
        initGUI();
    }
    private void acciones() {
        buttonRealizarPedido.setOnAction(new ManejoActions());
        buttonVerDetalles.setOnAction(new ManejoActions());
        buttonQuitarPedidos.setOnAction(new ManejoActions());

    }
    private void instancias() {
        usuarioDAOImp=new PedidoDAOImp();
        listaPedidos = FXCollections.observableArrayList();
        listaTiposPizzas = FXCollections.observableArrayList("Barbacoa","Hawaiana","Jamon y queso","Cuatro quesos");
        grupoTamañoPizza=new ToggleGroup();
        grupoTamañoPizza.getToggles().addAll(radioButtonPequeña,radioButtonMediano,radioButtonFamiliar);
        listaPedidos=FXCollections.observableArrayList(usuarioDAOImp.obtenerPedidos());
    }
    private void initGUI() {
        comboBoxSeleccionar.setItems(listaTiposPizzas);
        listViewPedidos.setItems(listaPedidos);
    }
    private double calcularPrecio(String nombre, String tamaño){
        switch (nombre){
            case "Barbacoa":
                if ("Pequeña".equalsIgnoreCase(tamaño))return 7.0;
                if ("Mediana".equalsIgnoreCase(tamaño))return 12.0;
                if ("Familiar".equalsIgnoreCase(tamaño))return 15.0;
                break;
            case "Hawaiana":
                if ("Pequeña".equalsIgnoreCase(tamaño))return 5.0;
                if ("Mediana".equalsIgnoreCase(tamaño))return 10.0;
                if ("Familiar".equalsIgnoreCase(tamaño))return 13.0;
                break;
            case "Jamon y queso":
                if ("Pequeña".equalsIgnoreCase(tamaño))return 4.0;
                if ("Mediana".equalsIgnoreCase(tamaño))return 8.0;
                if ("Familiar".equalsIgnoreCase(tamaño))return 10.0;
                break;
            case "Cuatro quesos":
                if ("Pequeña".equalsIgnoreCase(tamaño))return 8.0;
                if ("Mediana".equalsIgnoreCase(tamaño))return 13.0;
                if ("Familiar".equalsIgnoreCase(tamaño))return 17.0;
                break;
        }
        return 0.0;
    }
    private Pizzas crearPizza(String nombre, String tamaño){
        double precio=calcularPrecio(nombre,tamaño);
        return new Pizzas(nombre,tamaño,precio);
    }
    private void limpiarCampos(){
        textFieldNombre.clear();
        textFieldNumero.clear();
        comboBoxSeleccionar.getSelectionModel().clearSelection();
        grupoTamañoPizza.selectToggle(null);
    }
    private void mostrarDetallesPedido(Pedidos pedido){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Detalles del pedido");
        alert.setHeaderText("Pedido numero "+pedido.getId());
        alert.setContentText("Nombre "+pedido.getNombre()+"\n"+
                "Teléfono: "+pedido.getTelefono()+"\n"+
                "Pizza: "+pedido.getPizza().getNombre()+"\n"+
                "Tamaño "+pedido.getPizza().getTamanio()+"\n"+
                "Precio "+pedido.getPizza().getPrecio()+"€"
                );
        alert.showAndWait();

    }

    class ManejoActions implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource()==buttonRealizarPedido){
                if (!textFieldNombre.getText().isEmpty()&&
                !textFieldNumero.getText().isEmpty()&&
                !comboBoxSeleccionar.getSelectionModel().isEmpty()&&
                grupoTamañoPizza.getSelectedToggle().isSelected()){
                    String nombre=textFieldNombre.getText();
                    int telefono= Integer.parseInt(textFieldNumero.getText());
                    String tipoPizza=comboBoxSeleccionar.getSelectionModel().getSelectedItem();
                    String tamaño=((RadioButton)grupoTamañoPizza.getSelectedToggle()).getText();

                    Pizzas pizza=crearPizza(tipoPizza,tamaño);

                    Pedidos pedidos=new Pedidos(nombre,pizza,telefono);
                    listaPedidos.add(pedidos);

                    limpiarCampos();

                    System.out.println("pedido agregado "+pedidos);
                }else {
                    Alert alert=new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Campos incompletos");
                    alert.setContentText("Completar todos los campos");
                    alert.showAndWait();
                }


            } else if (actionEvent.getSource()==buttonVerDetalles) {
                Pedidos pedidoSeleccionado=listViewPedidos.getSelectionModel().getSelectedItem();
                if (pedidoSeleccionado!=null) {
                    System.out.println(pedidoSeleccionado);
                    mostrarDetallesPedido(pedidoSeleccionado);
                }else {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Seleccione pizza");
                    alert.setContentText("Seleccione una pizza de la lista");
                    alert.showAndWait();
                }
            } else if (actionEvent.getSource()==buttonQuitarPedidos) {
                if (listViewPedidos.getSelectionModel().getSelectedIndex()!=-1){
                    listaPedidos.remove(listViewPedidos.getSelectionModel().getSelectedIndex());
                }else{
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Borrar pedido");
                    alert.setContentText("Seleccione una pizza de la lista");
                    alert.showAndWait();
                }

            }
        }
    }
}
