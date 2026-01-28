module org.example.examen_1a_ev_di_jorgearmenta {
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

    opens org.example.examen_1a_ev_di_jorgearmenta to javafx.fxml,java.sql;
    exports org.example.examen_1a_ev_di_jorgearmenta;

    opens org.example.examen_1a_ev_di_jorgearmenta.controller to javafx.fxml,java.sql;
    exports org.example.examen_1a_ev_di_jorgearmenta.controller;

    opens org.example.examen_1a_ev_di_jorgearmenta.model to javafx.fxml ,java.sql;
    exports org.example.examen_1a_ev_di_jorgearmenta.model;

    opens org.example.examen_1a_ev_di_jorgearmenta.dao to javafx.fxml ,java.sql;
    exports org.example.examen_1a_ev_di_jorgearmenta.dao;

    opens org.example.examen_1a_ev_di_jorgearmenta.database to javafx.fxml ,java.sql;
    exports org.example.examen_1a_ev_di_jorgearmenta.database;
}