/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a7s9;

import javax.swing.JFrame;
import java.io.IOException;

public class PruebaJFileChooser {

    public static void main(String[] args) throws IOException {
        DemoJFileChooser aplicacion = new DemoJFileChooser();
        aplicacion.setSize(400, 400);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setVisible(true); 
    }    
}
