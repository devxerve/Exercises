/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jbdc.ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static jbdc.ejemplo.VentanaPpal.con1;

/**
 *
 * @author LABORATORIOS
 */
public class BBDD{
    public String url = "jdbc:mysql//localhost:3305/centroestudios";
    public String user= "root";
    public String pswd = "root";
    public BBDD(){ 
        url = "jdbc:mysql://localhost:3305/centroestudios";
        user= "root";
        pswd = "root";
    }
    static Connection crearConexion(String url, String user, String pswd){
    try{
        con1 = DriverManager.getConnection(url, user, pswd);
        if(con1!=null){
            System.out.println("Conexion correcta");
        }
    }catch(SQLException ex){
        ex.printStackTrace();
    }
    return con1;
    }
    
    static void insertarDatos(String nombre, String apellido, String dni, String email) {
    if (con1 != null) {
        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede insertar este alumno\nDatos faltantes", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String sql = "INSERT INTO centroestudios.alumno (nombre, apellido, dni, email) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = con1.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, dni);
            ps.setString(4, email);

            int retorno = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alumno insertado\nfilas insertadas: " + retorno, "Éxito", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Filas insertadas: " + retorno);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Conexión no existente", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


}

