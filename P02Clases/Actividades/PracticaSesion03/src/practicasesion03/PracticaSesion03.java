/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package practicasesion03;
import java.util.*;
/**
*
* @author HP
*/
public class PracticaSesion03 {



  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                
        //Creación de dos objetos solo ingresando la raza y el color
        Perro Fido = new Perro ("Chihuaha","Marron");
        Perro Pelusa = new Perro("Pequines"," Blanco");
        
        Fido.increEdad(2);
        Pelusa.increEdad(5);
        
        System.out.println(Fido.toString());
        
        //Verificación del estado de Fido:
        //Se crea un objeto de tipo diagnostico
        Diagnóstico Diagnostico = new Diagnóstico();
        //Llamamos al metodo pero ingresando como el valor el objeto de tipo perro "Fido"
        Diagnostico.aptoVacunaA(Fido);
        //Para ingresar datos al objeto de tipo perro
        Scanner s1 = new Scanner (System.in);
        System.out.println("Ingrese el nuevo peso para el perro: ");
        double miPeso = s1.nextDouble();
        System.out.println("Ingresa la nueva edad para el perro: ");
        Integer miEdad = s1.nextInt();
        System.out.println("Ingresa la nueva temperatura para el perro: ");
        double miTemp = s1.nextDouble();
        
        //Creación del objeto Usuario de tipo perro
        Perro Usuario = new Perro();
        
        //Asignación de los valores ingresados por el usuario
        Usuario.setTemp(miTemp);
        Usuario.peso = miPeso;
        Usuario.setEdad(miEdad);
        
        Diagnostico.aptoVacunaA(Usuario);
     
    }
    
} 
