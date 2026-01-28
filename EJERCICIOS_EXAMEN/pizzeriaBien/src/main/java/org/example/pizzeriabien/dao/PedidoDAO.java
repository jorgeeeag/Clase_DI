package org.example.pizzeriabien.dao;

import org.example.pizzeriabien.model.Pedido;

import java.sql.SQLException;
import java.util.List;

public interface PedidoDAO {
    void insertarPedido(Pedido pedido) throws SQLException;
    List<Pedido>obtenerPedido();
    List<Pedido>obtenerPedido(String id);
    int borrarPedido(String id);
}
