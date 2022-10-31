/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4s9;

/**
 *
 * @author jchal
 */
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ViewFile extends JFrame {
    private JTextArea areaTexto;
    
    public ViewFile(String s){
        super("Mostrando el conteniedo de un archivo");
        areaTexto = new JTextArea(s,5,50);
        add(areaTexto);
    }
}