/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2s9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String cadena;
        
        try (PrintWriter salida = new PrintWriter("C:\\ArchivosTexto\\act2.txt")){
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN: ");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")){
                salida.println(cadena);
                cadena = sc.nextLine();
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
