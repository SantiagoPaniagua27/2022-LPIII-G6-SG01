/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2perfilmedico;
import java.util.*;
/**
 *
 * @author HP
*/
public class Ejercicio2PerfilMedico {
    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Scanner sc = new Scanner(System.in);
        String nombre, apellido;
        char sexo;
        int mes=1;
        int dia=1;
        int anio=2000;
        System.out.println("Ingrese el nombre del paciente: ");
        nombre = sc.next();
        System.out.println("Ingrese el apellido del paciente: ");
        apellido = sc.next();
        System.out.println("Ingrese el sexo del paciente: ");
        sexo = sc.next().charAt(0);
        do{
            System.out.println("Ingrese el dia de nacimiento del paciente: ");
            dia = sc.nextInt();
        } while(dia<1 || dia>31);
        do{
            System.out.println("Ingrese el mes de nacimiento del paciente: ");
            mes = sc.nextInt();
        } while(mes<1 || mes>12);
        do{
            System.out.println("Ingrese el año de nacimiento del paciente: ");
            anio = sc.nextInt();
        } while(anio<2000 || anio>2022);
        System.out.println("Ingrese su altura: ");
        double altura = sc.nextDouble();
        System.out.println("Ingrese su peso: ");
        double peso = sc.nextDouble();
        // crear un objeto de la clase 
        ClasePerfilMedico paciente = new ClasePerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);
        // imprimir el objeto paciente
        System.out.println(paciente.toString());
        //Mostrar edad
        System.out.println("La edad de " + paciente.getNombre() + " es " + paciente.edad());
        //Mostrar el índice de masa corporal IMC
        System.out.println("El índice de masa corporal de " + paciente.getNombre() + " es " + paciente.imc());
        //Mostrar la frecuencia cardiaca máxima FMC
        System.out.println("La frecuencia cardiaca máxima de " + paciente.getNombre() + " es " + paciente.fmc()); 
    }
}

