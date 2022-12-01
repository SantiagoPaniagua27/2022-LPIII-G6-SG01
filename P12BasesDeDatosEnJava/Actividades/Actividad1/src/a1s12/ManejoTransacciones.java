/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1s12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class ManejoTransacciones {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucsm", "root","");

            con.setAutoCommit(false);

            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into cursos values(7104353,'Computacion en red',4)");
            stmt.executeUpdate("insert into cursos values(7104742,'Fundamentos de Sistemas de informacion',4)");

            con.commit();
            System.out.println("Datos añadidos");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

