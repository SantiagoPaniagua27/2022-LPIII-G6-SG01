/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author jchal
 */
import java.util.*;
import java.math.*;
public class VentasTotales {
    private int cant_productos = 5;
    private int cant_vendedores = 4;
    private int [][] datos = {{3,4,5,1},{4,6,1,4},{6,4,7,1},{8,3,9,2},{4,7,2,1}};
    private int ventas[][] = new int [cant_productos][2];
    private int[] precios = {100,200,300,400,500};
    
    public void calcularVentas(){
        int suma_vendedor = 0;
        for (int i=0;i<cant_productos;i++){
            for(int j=0;j<cant_vendedores;j++){
                if(datos[i][j]>0){
                    ventas[i][0]+=datos[i][j] * precios[i];
                }
            }
        }
        for (int columna=0;columna<cant_vendedores ;columna++){
            for(int fila=0;fila<cant_productos;fila++){
                if(datos[fila][columna]>0){
                    ventas[columna][1]+=datos[fila][columna] * precios[fila];
                }
            }
        }
    }
    public void mostrarTotales(){
        System.out.printf("%25s\n","VENDEDORES");
        System.out.printf("%10s%10s%10s%10s%23s","1","2","3","4","TOTAL DE PRODUCTO\n\n");
        
        for (int i=0;i<cant_productos;i++){
            System.out.printf("%d",(i+1));            
            for(int j=0;j<cant_vendedores;j++){
                System.out.printf("%10d",datos[i][j]);
                if(j==3){
                    System.out.printf("%15d",ventas[i][0]);
                }
            }
            System.out.println();
        }
        for(int i=0;i<cant_vendedores;i++){
            System.out.printf("%10d",ventas[i][1]);
        }
    }
}
