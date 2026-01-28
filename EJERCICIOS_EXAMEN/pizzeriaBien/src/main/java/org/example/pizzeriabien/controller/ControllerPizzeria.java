package org.example.pizzeriabien.controller;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.example.pizzeriabien.dao.PedidoDAOImp;
import org.example.pizzeriabien.model.Pedido;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPizzeria implements Initializable {

    @FXML
    private Button buttonEliminarPedido;

    @FXML
    private Button buttonRealizarPedido;

    @FXML
    private Button buttonVerDetalles;

    @FXML
    private ComboBox<String> comboboxTipoPizza;

    @FXML
    private RadioButton radioButtonFamiliar;

    @FXML
    private RadioButton radioButtonMediana;

    @FXML
    private RadioButton radioButtonPequeño;

    @FXML
    private TextField textFielNombre;

    @FXML
    private TextField textFieldTelefono;

    @FXML
    private ListView<Pedido> listViewPedidos;

    private PedidoDAOImp pedidoDAOImp;
    private ToggleGroup grupoTamañoPizza;
    private ObservableList<Pedido>listaPedidos;
    private ObservableList<String>listaTiposDePizza;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        acciones();
        instancias();
        initGUI();
    }
    private void acciones() {
        buttonEliminarPedido.setOnAction(new ManejoActions());
        buttonVerDetalles.setOnAction(new ManejoActions());
        buttonRealizarPedido.setOnAction(new ManejoActions());
    }
    private void instancias() {
    }

    private void initGUI() {
    }
    class ManejoActions implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent actionEvent) {

        }
    }
}
