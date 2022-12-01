package com.mycompany.ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) throws Exception {
        Integer[] intArray = {15, 8, 6, 4, 9};
        Double[] doubleArray = {2.5, 6.4, 7.1, 2.8, 10.6};
        Character[] charArray = {'P', 'E', 'R', 'U'};

        System.out.println("Antes del cambio de posiciones: ");
        imprimirArray(intArray);
        randomPos(intArray, 0, 4);
        System.out.println("Despues del cambio de posiciones: ");
        imprimirArray(intArray);
        System.out.println();

        System.out.println("Antes del cambio de posiciones: ");
        imprimirArray(doubleArray);
        randomPos(doubleArray, 0, 4);
        System.out.println("Despues del cambio de posiciones: ");
        imprimirArray(doubleArray);
        System.out.println();

        System.out.println("Antes del cambio de posiciones: ");
        imprimirArray(charArray);
        randomPos(charArray, 0, 3);
        System.out.println("Despues del cambio de posiciones: ");
        imprimirArray(charArray);   
        System.out.println();
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }

        System.out.println();
    }

    public static <T> void randomPos(T[] array, int pos1, int pos2) {
        T temp;
        temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;

    }

}
