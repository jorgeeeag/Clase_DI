package org.example.examen_1a_ev_di_jorgearmenta.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.example.examen_1a_ev_di_jorgearmenta.dao.ProductosDAOImp;
import org.example.examen_1a_ev_di_jorgearmenta.model.Productos;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerProductos implements Initializable {

    @FXML
    private Button buttonFiltrar;

    @FXML
    private Button buttonVerDetalle;

    @FXML
    private ComboBox<String> comboBoxCategoria;

    @FXML
    private ListView<Productos> listViewProductos;

    private ProductosDAOImp productosDAOImp;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        acciones();
        instancias();
        initGUI();
    }
    private void acciones() {
        buttonFiltrar.setOnAction(new ManejoActions());
        buttonVerDetalle.setOnAction(new ManejoActions());
    }
    private void instancias() {
        productosDAOImp=new ProductosDAOImp();

    }

    private void initGUI() {

    }
    private void verDetalle(Productos productos){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ver detalles");
        alert.setHeaderText("Detalles del producto");
        alert.setContentText(productos.toString());
        alert.showAndWait();
    }

    class ManejoActions implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource()==buttonFiltrar){

            } else if (actionEvent.getSource()==buttonVerDetalle) {
                Productos productoSeleccionado=listViewProductos.getSelectionModel().getSelectedItem();
                if (productoSeleccionado!=null){
                    verDetalle(productoSeleccionado);
                }
            }
        }
    }
}

