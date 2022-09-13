/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author jchal
 */

import java.util.Scanner;

public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[5][4];
        Scanner sn = new Scanner(System.in);
        VentasTotales venta = new VentasTotales();
        
        venta.calcularVentas();
        venta.mostrarTotales();
    }
    
}
