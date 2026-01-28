package org.example.examen_1a_ev_di_jorgearmenta.dao;

import org.example.examen_1a_ev_di_jorgearmenta.database.DBConnectionProductos;
import org.example.examen_1a_ev_di_jorgearmenta.database.SchemeDBProductos;
import org.example.examen_1a_ev_di_jorgearmenta.model.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductosDAOImp implements ProductosDAO {
    private final Connection connection;
    Productos productos=new Productos();
    public ProductosDAOImp() {
        connection = DBConnectionProductos.getConnection();
    }

    @Override
    public void insertarProductos() throws SQLException {
        String query = String.format("INSERT INTO %s (%s,%s,%s,%s) VALUES (?,?,?,?)",
                SchemeDBProductos.TAB_NAME,
                SchemeDBProductos.COL_ID,
                SchemeDBProductos.COL_NOMBRE,
                SchemeDBProductos.COL_CATEGORIA,
                SchemeDBProductos.COL_PRECIO);
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,productos.getId());
        preparedStatement.setString(2,productos.getNombre());
        preparedStatement.setString(3,productos.getCategoria());
        preparedStatement.setDouble(4,productos.getPrecio());

        preparedStatement.execute();
    }

    @Override
    public List<Productos> obtenerProductos() {
        return List.of();
    }

    @Override
    public List<Productos> obtenerProductos(int id) {
        return List.of();
    }

    @Override
    public int eliminarProducto(int id) {
        return 0;
    }
}
