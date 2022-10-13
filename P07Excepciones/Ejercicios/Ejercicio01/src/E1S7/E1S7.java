/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1s7;
import java.util.*;
public class E1S7 {

    public static void main(String[] args) throws Exception{
        double [] v  = new double[15];
        acceso(v,16);
    }
    public static double acceso(double[] v, int j) throws Exception {
        try {
            if (j >= 0 && j <= v.length)
                return v[j];
            else
                throw new Exception("El indice " + j + " no existe en el vector");
        }
        catch (Exception exc){
            throw exc;
        }
    }
}
