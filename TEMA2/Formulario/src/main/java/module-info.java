module org.example.formulario {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    requires lombok;

    opens org.example.formulario to javafx.fxml;
    exports org.example.formulario;
    exports org.example.formulario.controller;
    opens org.example.formulario.controller to javafx.fxml;

    exports org.example.formulario.model;
    opens org.example.formulario.model to lombok;
}