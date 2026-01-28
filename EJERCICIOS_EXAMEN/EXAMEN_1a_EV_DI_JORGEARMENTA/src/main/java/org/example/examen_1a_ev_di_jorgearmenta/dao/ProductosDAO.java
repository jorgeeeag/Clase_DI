package org.example.examen_1a_ev_di_jorgearmenta.dao;

import org.example.examen_1a_ev_di_jorgearmenta.model.Productos;

import java.sql.SQLException;
import java.util.List;

public interface ProductosDAO {
    void insertarProductos() throws SQLException;
    List<Productos>obtenerProductos();
    List<Productos>obtenerProductos(int id);
    int eliminarProducto(int id);
}
