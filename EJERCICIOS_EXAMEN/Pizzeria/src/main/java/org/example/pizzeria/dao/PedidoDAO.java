package org.example.pizzeria.dao;

import org.example.pizzeria.model.Pedidos;

import java.sql.SQLException;
import java.util.List;

public interface PedidoDAO {
    void insertarPedido(Pedidos pedidos) throws SQLException;
    List<Pedidos>obtenerPedidos();
    List<Pedidos>obtenerPedidos(int id);
    int borrarPedido(int id);
}
