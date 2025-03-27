package com.formacom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class FichajesDB implements IFichajes{
    @Override
    public Boolean login(String user, String pass) {
        try {
            Connection conexion=DatabaseConnection.getConnection();
            String sql="SELECT * FROM administradores WHERE username=? AND password=?";
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1,user);
            pst.setString(2,pass);
            return pst.executeQuery().next();

        } catch (SQLException e) {
            return false;
            //throw new RuntimeException(e);
        }

    }

    @Override
    public String alta_alumno(String dni, String nombre) {
        String sql="INSERT INTO usuarios(dni,nombre) VALUES(?,?)";
        try {
            Connection conexion=DatabaseConnection.getConnection();
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1,dni);
            pst.setString(2,nombre);
            pst.executeUpdate();
            return "Alumno añadido correctamente";
        } catch (SQLException e) {
            return "El alumno ya existe con ese DNI";
            //throw new RuntimeException(e);
        }

    }

    @Override
    public String cambiar_modo(String modo) {
        return "";
    }

    @Override
    public List<Registro> informe_por_dia(LocalDate dia) {
        return List.of();
    }

    @Override
    public List<Registro> informe_por_alumno(String dni) {
        return List.of();
    }

    @Override
    public String fichar(String dni) {
        return "";
    }
}
