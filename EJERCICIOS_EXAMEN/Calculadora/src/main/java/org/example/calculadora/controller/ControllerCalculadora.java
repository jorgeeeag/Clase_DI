package org.example.calculadora.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerCalculadora implements Initializable {

    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonClean;

    @FXML
    private Button buttonComma;

    @FXML
    private Button buttonDelete;

    @FXML
    private Button buttonDivision;

    @FXML
    private Button buttonEquals;

    @FXML
    private Button buttonMinus;

    @FXML
    private Button buttonMultiplication;

    @FXML
    private Button buttonNegative;

    @FXML
    private Button buttonPercentage;

    @FXML
    private Button buttonPlus;

    @FXML
    private TextField textFieldOperaciones;

    @FXML
    private TextArea textAreaHistorial;


    private List<Button> botonesNumericos;
    private List<Button> botonesOperadores;
    private List<Button> botonesEspeciales;
    private List<String>historialDeOperaciones;

    private String primerNumero = "";
    private String segundoNumero = "";
    private String operacion = "";
    private boolean nuevaOperacion = true;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instancias();
        initGUI();
        acciones();
    }



    private void acciones() {
        for (Button item:botonesNumericos){
            item.setOnAction(new ManejoActions());
        }
        for (Button item:botonesOperadores){
            item.setOnAction(new ManejoActions());
        }
        for (Button item:botonesEspeciales){
            item.setOnAction(new ManejoActions());
        }
    }

    private void instancias() {
        botonesNumericos= new  ArrayList<>();
        botonesNumericos.add(button0);
        botonesNumericos.add(button1);
        botonesNumericos.add(button2);
        botonesNumericos.add(button3);
        botonesNumericos.add(button4);
        botonesNumericos.add(button5);
        botonesNumericos.add(button6);
        botonesNumericos.add(button7);
        botonesNumericos.add(button8);
        botonesNumericos.add(button9);

        botonesOperadores = new ArrayList<>();
        botonesOperadores.add(buttonPlus);
        botonesOperadores.add(buttonMinus);
        botonesOperadores.add(buttonMultiplication);
        botonesOperadores.add(buttonDivision);

        botonesEspeciales = new ArrayList<>();
        botonesEspeciales.add(buttonEquals);
        botonesEspeciales.add(buttonClean);
        botonesEspeciales.add(buttonDelete);
        botonesEspeciales.add(buttonNegative);
        botonesEspeciales.add(buttonPercentage);
        botonesEspeciales.add(buttonComma);

        historialDeOperaciones=new ArrayList<>();
    }
    private void initGUI() {
        textFieldOperaciones.setText("0");
        textAreaHistorial.setText("");
    }
    public void crearAlertas(String titulo, String header, String contenido){
        Alert alert= new Alert(Alert.AlertType.WARNING);
        alert.setTitle(titulo);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    public void addValue(String value){
        String textoActual=textFieldOperaciones.getText();
        if (nuevaOperacion){
            textFieldOperaciones.setText(value);
            nuevaOperacion=false;
        } else if (textoActual.equals("0")) {
            textFieldOperaciones.setText("0");
        }else {
            textFieldOperaciones.setText(textoActual+value);
        }
    }

    public void addOperation(String operador){
        if (!primerNumero.isEmpty()&&!operacion.isEmpty()){
            makeOperations();
        }
        primerNumero=textFieldOperaciones.getText();
        operacion=operador;
        textFieldOperaciones.setText(primerNumero+operador);
        nuevaOperacion=true;

        System.out.println(primerNumero+operacion);
    }
    public void makeOperations(){
        if (primerNumero.isEmpty()||operacion.isEmpty()){
            return;
        }
        segundoNumero=textFieldOperaciones.getText();
        System.out.println(segundoNumero);
        double num1=Double.parseDouble(primerNumero);
        double num2=Double.parseDouble(segundoNumero);
        double resultador=calculos(num1,num2,operacion);

        String operacionEntera=primerNumero+" "+operacion+" "+segundoNumero+" = "+resultador;
        agregarAlHistorial(operacionEntera);
        textFieldOperaciones.setText(String.valueOf(resultador));

        primerNumero="";
        segundoNumero="";
        operacion="";
        nuevaOperacion=true;
    }

    private void agregarAlHistorial(String operacion) {
        historialDeOperaciones.add(operacion);
    }

    private double calculos(double num1, double num2, String operacion) {
        switch (operacion){
            case "+":return num1+num2;
            case "-":return num1-num2;
            case "X":return num1*num2;
            case "/":
                if (num2==0){
                    crearAlertas("Error",
                            "Imposible dividirr",
                            "No se puede divir entre 0");
                }
                return num1/num2;
        }
        return 0;
    }

    public void cleanScreen(){
        textFieldOperaciones.setText("0");
        primerNumero = "";
        segundoNumero = "";
        operacion = "";
        nuevaOperacion = true;
    }
    public void deleteValue(){
        String numeros=textFieldOperaciones.getText();
        if (numeros.length()>1){
            textFieldOperaciones.setText(numeros.substring(0,numeros.length()-1));
        }else {
            textFieldOperaciones.setText("0");
        }
    }



    class ManejoActions implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent actionEvent) {
            Button button= (Button) actionEvent.getSource();
            if (botonesNumericos.contains(button)){
                String numero=button.getText();
                addValue(numero);
            } else if (botonesOperadores.contains(button)) {
                String operador=button.getText();
                addOperation(operador);


            } else if (botonesEspeciales.contains(button)) {
                if (button==buttonClean){
                    cleanScreen();
                } else if (button==buttonDelete) {
                    deleteValue();
                } else if (button==buttonEquals) {
                    makeOperations();
                }
            }
        }
    }
}