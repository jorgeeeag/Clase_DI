package org.example.examen_1a_ev_di_jorgearmenta.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.example.examen_1a_ev_di_jorgearmenta.dao.UsuarioDAOImp;
import org.example.examen_1a_ev_di_jorgearmenta.model.Usuarios;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerUsuarios implements Initializable {
    @FXML
    private Button buttonLogin;

    @FXML
    private TextField textFieldCorreo;

    @FXML
    private TextField textFieldPass;

    private UsuarioDAOImp usuarioDAOImp;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    buttonLogin.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {

        }
    });
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource() == buttonLogin) {
                if (textFieldCorreo.getText().isEmpty() && textFieldPass.getText().isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Usuario");
                    alert.setHeaderText("Rellene los campos");
                    alert.setContentText("Falta uno de los dos campos por rellenar");
                    alert.showAndWait();
                }
            }
        }
    }
}
