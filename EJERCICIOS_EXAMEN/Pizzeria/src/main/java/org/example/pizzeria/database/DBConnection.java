package org.example.pizzeria.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static java.sql.Connection connection;

    public static Connection getConnection(){
        if (connection==null){
            createConection();
        }
        return connection;
    }

    private static void createConection() {
        String user = "root";
        String pass = "";
        try {
            connection = DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/%s",
                    SchemeDB.URL, SchemeDB.PORT, SchemeDB.DB_NAME), user, pass);
        } catch (SQLException e) {
            System.out.println("Error en la conexion con la base de datos");
            System.out.println(e.getMessage());
        }
    }
}
