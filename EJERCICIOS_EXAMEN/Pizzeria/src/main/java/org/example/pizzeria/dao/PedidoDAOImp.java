package org.example.pizzeria.dao;

import org.example.pizzeria.database.DBConnection;
import org.example.pizzeria.database.SchemeDB;
import org.example.pizzeria.model.Pedidos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAOImp implements PedidoDAO {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public PedidoDAOImp(){
        connection= DBConnection.getConnection();
    }

    @Override
    public void insertarPedido(Pedidos pedidos) throws SQLException {
        String query=String.format("INSERT INTO %s (%s,%s,%s) VALUES (?,?,?)",
                SchemeDB.TAB_NAME,
                SchemeDB.COL_ID,
                SchemeDB.COL_NAME,
                SchemeDB.COL_TELEFONO);

        preparedStatement=connection.prepareStatement(query);
        preparedStatement.setInt(1, pedidos.getId());
        preparedStatement.setString(2,pedidos.getNombre());
        preparedStatement.setInt(4,pedidos.getTelefono());
        preparedStatement.execute();
    }

    @Override
    public List<Pedidos> obtenerPedidos() {
        List<Pedidos>list=new ArrayList<>();

        try{
            preparedStatement= connection.prepareStatement("SELECT * FROM"+SchemeDB.TAB_NAME);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt(SchemeDB.COL_ID);
                String nombre = resultSet.getString(SchemeDB.COL_NAME);
                int telefono = resultSet.getInt(SchemeDB.COL_TELEFONO);
            }
        } catch (SQLException e) {
            System.out.println("error en la query");
        }
        return list;
    }

    @Override
    public List<Pedidos> obtenerPedidos(int id) {
        return List.of();
    }

    @Override
    public int borrarPedido(int id) {
        return 0;
    }
}