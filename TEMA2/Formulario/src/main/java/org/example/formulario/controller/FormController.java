package org.example.formulario.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import org.example.formulario.model.Usuario;

import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable {
    @FXML
    private Button botonAgregar;

    @FXML
    private Button botonEliminar;

    @FXML
    private CheckBox checkDisponibilidad;

    @FXML
    private ComboBox<Integer> comboboxEdad;

    @FXML
    private FlowPane parteDerecha;

    @FXML
    private BorderPane parteGeneral;

    @FXML
    private RadioButton radioFemenino;

    @FXML
    private RadioButton radioMasculino;

    @FXML
    private TextField textfieldCorreo;

    @FXML
    private TextField textfieldLocalizacion;

    @FXML
    private TextField textfieldNombre;

    @FXML
    private ToggleButton toggleLista;


    private ToggleGroup grupoGenero;
    private ObservableList <Integer> listaEdades;
    private ObservableList<Usuario>listaUsuarios;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instancias();
        initGUI();
        acciones();
    }

    private void acciones() {
        botonAgregar.setOnAction(new ManejoAcciones());
        botonEliminar.setOnAction(new ManejoAcciones());
        checkDisponibilidad.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue,
                                Boolean oldValue,
                                Boolean newValue) {
                //forma larga
                /*if (newValue){
                    botonAgregar.setDisable(false);
                }else {
                    botonAgregar.setDisable(true);
                }*/
                //forma corta
                botonAgregar.setDisable(!newValue);
            }
        });
        toggleLista.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue,
                                Boolean aBoolean,
                                Boolean t1) {
                if (t1){
                    parteGeneral.setRight(null);
                }else{
                    parteGeneral.setRight(parteDerecha);
                }
            }
        });
    }



    private void instancias() {
        grupoGenero=new ToggleGroup();
        grupoGenero.getToggles().addAll(radioMasculino,radioFemenino);
        listaUsuarios=FXCollections.observableArrayList();
        listaEdades= FXCollections.observableArrayList();
        for (int i = 18; i < 91; i++) {
            listaEdades.add(i);
        }
    }

    private void initGUI() {
        comboboxEdad.setItems(listaEdades);
        botonAgregar.setDisable(!checkDisponibilidad.isSelected());
        if (toggleLista.isSelected()){
            parteGeneral.setRight(parteDerecha);
        }else{
            parteGeneral.setRight(null);
        }
    }
    class ManejoAcciones implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource()==botonAgregar){
                // procesar datos a posteriori
                if (textfieldNombre.getText().length()>0 &&
                textfieldCorreo.getText().length()>0 &&
                textfieldLocalizacion.getText().length()>0 &&
                grupoGenero.getSelectedToggle() != null &&
                comboboxEdad.getSelectionModel().getSelectedItem()>=0){
                    String nombre = textfieldNombre.getText();
                    String correo = textfieldCorreo.getText();
                    String localizacion = textfieldLocalizacion.getText();
                    String genero=((RadioButton)grupoGenero.getSelectedToggle()).getText();
                    boolean disponibilidad = checkDisponibilidad.isSelected();
                    int edad = comboboxEdad.getSelectionModel().getSelectedItem();
                    Usuario usuario=new Usuario(nombre,correo,localizacion,genero,edad,disponibilidad);
                    listaUsuarios.add(usuario);

                    //limpiar todos los datos
                }else {
                    System.out.println("Error faltan datos");
                }
            } else if (actionEvent.getSource() == botonEliminar) {

            }else if (actionEvent.getSource()==checkDisponibilidad){
                checkDisponibilidad.setDisable(true);
                System.out.println();
            }
        }
    }

}
