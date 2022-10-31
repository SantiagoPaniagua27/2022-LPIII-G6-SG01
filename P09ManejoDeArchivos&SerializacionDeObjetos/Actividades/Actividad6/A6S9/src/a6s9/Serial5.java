/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a6s9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial5 {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;

        try {
            fos = new FileOutputStream("C:\\ArchivosTexto\\Act6.dat");
            salida = new ObjectOutputStream(fos);
            f = new Fecha(5, 9, 2010);
            a = new Alumno("123456A", "Roberto Rodriguez", 12, f);
            salida.writeObject(a);
            f = new Fecha(20, 10, 2008);
            a = new Alumno("234567B", "Mario Gonzales", 14, f);
            salida.writeObject(a);
            f = new Fecha(1, 1, 2000);
            a = new Alumno("345678C", "Maria Cruz", 22, f);
            salida.writeObject(a);
            System.out.println("El programa se ejecuto correctamente");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
