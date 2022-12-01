package com.mycompany.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        
        String[] stringArray = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};
        String[] stringArray1 = {"12", "13", "14", "15"};

        System.out.println("Array de cadenas contiene: ");
        imprimirArray(stringArray);
        System.out.println();
        System.out.println("Array de cadenas contiene: ");
        imprimirArray(stringArray1);

    }

    public static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length / 2) {
                System.out.println();
            }
            System.out.print(array[i] + "\t");
        }
    }

}
