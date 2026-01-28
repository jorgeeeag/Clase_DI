package org.example.examen_1a_ev_di_jorgearmenta.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionProductos {
    private static Connection connection;
    public static Connection getConnection(){
        if (connection==null){
            createConection();
        }
        return connection;
    }

    private static void createConection() {
        String user="root";
        String pass="";
        try {
            connection= DriverManager.getConnection(String.format("jdbc:mysql://%s,%s,%s",
                    SchemeDBProductos.URL,SchemeDBProductos.PORT,SchemeDBProductos.DB_NAME),user,pass);
        } catch (SQLException e) {
            System.out.println("No se ha podido crear la conexion de productos");

        }
    }
}
