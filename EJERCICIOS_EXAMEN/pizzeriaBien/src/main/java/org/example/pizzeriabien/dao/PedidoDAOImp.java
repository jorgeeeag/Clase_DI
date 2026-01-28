package org.example.pizzeriabien.dao;

import org.example.pizzeriabien.database.DBConnection;
import org.example.pizzeriabien.database.SchemeDB;
import org.example.pizzeriabien.model.Pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PedidoDAOImp implements PedidoDAO{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public PedidoDAOImp(){
        connection= DBConnection.getConnection();
    }

    @Override
    public void insertarPedido(Pedido pedido) throws SQLException {
        String query=String.format("INSERT INTO %s (%s,%s,%s) VALUES (?,?,?)",
                SchemeDB.TAB_NAME,SchemeDB.COL_ID,SchemeDB.COL_NOMBRE,SchemeDB.COL_PIZZA,SchemeDB.COL_TELEFONO);
        preparedStatement=connection.prepareStatement(query);
        preparedStatement.setInt(1,pedido.getId());
        preparedStatement.setString(2, pedido.getNombre());
        preparedStatement.setString(3,pedido.getPizza().toString());
        preparedStatement.setInt(4,pedido.getTelefono());
        preparedStatement.execute();
    }

    @Override
    public List<Pedido> obtenerPedido() {
        return List.of();
    }

    @Override
    public List<Pedido> obtenerPedido(String id) {
        return List.of();
    }

    @Override
    public int borrarPedido(String id) {
        return 0;
    }
}
