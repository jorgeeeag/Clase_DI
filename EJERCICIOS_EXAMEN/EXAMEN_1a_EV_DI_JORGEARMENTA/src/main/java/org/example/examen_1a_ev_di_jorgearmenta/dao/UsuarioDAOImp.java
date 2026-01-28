package org.example.examen_1a_ev_di_jorgearmenta.dao;

import org.example.examen_1a_ev_di_jorgearmenta.database.DBConnectionProductos;
import org.example.examen_1a_ev_di_jorgearmenta.database.DBConnectionUsuarios;
import org.example.examen_1a_ev_di_jorgearmenta.database.SchemeDBProductos;
import org.example.examen_1a_ev_di_jorgearmenta.database.SchemeDBUsuarios;
import org.example.examen_1a_ev_di_jorgearmenta.model.Productos;
import org.example.examen_1a_ev_di_jorgearmenta.model.Usuarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAOImp implements UsuarioDAO {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public boolean estaUsuario(String correo, String pass){
        connection=DBConnectionUsuarios.getConnection();
        String query=  String.format("SELECT * FROM %s WHERE %s=? ANS %S=?",);
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,correo);
            preparedStatement.setString(2,pass);
            resultSet=preparedStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("query erronea");
        }
    }
    Usuarios usuarios=new Usuarios();
    public UsuarioDAOImp() {
        connection = DBConnectionUsuarios.getConnection();
    }

    @Override
    public void insertarUsuarios() throws SQLException {
        String query = String.format("INSERT INTO %s (%s,%s,%s,%s) VALUES (?,?,?,?)",
                SchemeDBUsuarios.TAB_NAME,
                SchemeDBUsuarios.COL_ID,
                SchemeDBUsuarios.COL_NOMBRE,
                SchemeDBUsuarios.COL_CORREO,
                SchemeDBUsuarios.COL_PASS);
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,usuarios.getId());
        preparedStatement.setString(2,usuarios.getNombre());
        preparedStatement.setString(3, usuarios.getCorreo());
        preparedStatement.setString(4,usuarios.getPass()
        );

        preparedStatement.execute();
    }

    @Override
    public List<Productos> obtenerUsuarios() {
        return List.of();
    }

    @Override
    public List<Productos> obtenerUsuarios(int id) {
        return List.of();
    }

    @Override
    public int eliminarUsuarios(int id) {
        return 0;
    }
}