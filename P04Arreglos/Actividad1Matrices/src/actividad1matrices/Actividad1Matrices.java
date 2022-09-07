/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1matrices;

/**
 *
 * @author HP
 */

import java.util.*;
public class Actividad1Matrices {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        // Matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];
        // Variables utilizadas
        boolean salir = false;
        int opcion, fila, columna, sumaDiagonal=0, sumaDiagonalInversa=0, sumaTotal=0;;
        // Utilizado para indicar si hemos entrado en la 1ª opcion
        boolean rellenado = false;
        // Menu
        do {
            // Mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Salir");
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    // Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    System.out.println("La matriz es:");
                    imprimirMatriz(matriz);
                    break;
                case 2:
                    if (rellenado) {
                        // Validamos la fila
                        do {
                            System.out.println("Elige una fila");
                            fila = sn.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println("La suma de los valores de la fila " + fila
                                + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if (rellenado) {
                        // Validamos la columna
                        do {
                            System.out.println("Elige una columna");
                            columna = sn.nextInt();
                        } while (!(columna >= 0 && columna < matriz.length));
                        System.out.println("La suma de los valores de la columna " + columna
                                + " es: " + sumaColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 5");
                }
                if (rellenado == true && opcion==2 || opcion==3){
                    //Sumar la diagonal principal de la matriz
                    for (int i = 0; i < matriz.length; i++) {
                        sumaDiagonal += matriz[i][i];
                    }
                    System.out.println("La suma de la diagonal es: " + sumaDiagonal);
                    //sumar la diagonal inversa de la matriz
                    for (int i = 0; i < matriz.length; i++) {
                        sumaDiagonalInversa += matriz[i][matriz.length-1-i];
                    }
                    System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa);    
                    //Sumar la media de todos los valores de la matriz
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            sumaTotal += matriz[i][j];
                        }
                    }
                    System.out.println("La media de todos los valores de la matriz es: " 
                        + sumaTotal/(matriz.length*matriz.length));
            }
        } while (!salir);
        System.out.println("FIN");
    }

    /**
     * Rellena la matriz con valores insertados por el usuario
     *
     * @param sn
     * @param matriz
    */
    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }
    /**
     * Suma los valores de una determinada fila
     *
     * @param matriz
     * @param fila
     * @return
     */
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }
    /**
     * Suma los valores de una determinada Columna
     *
     * @param matriz
     * @param Columna
     * @return
     */
    //Suma los valores de una determinada Columna
    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println("");
        }
    }

}



