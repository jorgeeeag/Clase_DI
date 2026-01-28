package org.example.examen_1a_ev_di_jorgearmenta.dao;

import org.example.examen_1a_ev_di_jorgearmenta.model.Productos;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {
    void insertarUsuarios() throws SQLException;
    List<Productos> obtenerUsuarios();
    List<Productos>obtenerUsuarios(int id);
    int eliminarUsuarios(int id);
}
