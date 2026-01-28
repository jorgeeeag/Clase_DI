module org.example.pizzeria {
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
    requires java.sql;

    opens org.example.pizzeria.controller to javafx.fxml,java.sql;
    exports org.example.pizzeria.controller;

    opens org.example.pizzeria.dao to javafx.fxml,java.sql;
    exports org.example.pizzeria.dao;

    opens org.example.pizzeria.database to javafx.fxml,java.sql;
    exports org.example.pizzeria.database;

    opens org.example.pizzeria.model to javafx.fxml,java.sql;
    exports org.example.pizzeria.model;

    opens org.example.pizzeria to javafx.fxml,java.sql;
    exports org.example.pizzeria;
}