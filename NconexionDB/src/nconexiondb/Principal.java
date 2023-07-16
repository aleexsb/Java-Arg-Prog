/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nconexiondb;

import java.sql.*;

/**
 *
 * @author Alex
 */

/*HACER CLICK DERECHO EN LIBRERIAS, LUEGO AGREGAR LIBRERIA Y INSTALAR LIBRERIA POSTGRESQL*/
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/ejercicio1";
        String username = "postgres";
        String password = "postgres";
        
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmt=con.createStatement();
        
        ResultSet rs = stmt.executeQuery("select * from persona");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
//        int result = stmt.executeUpdate("delete from emp where id=33");
//        System.out.println(result + " records affected");
        con.close();
    }

}
