/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofecha;
import java.util.*;
public class ProyectoFecha {

    public static void main(String[] args) {
        
        Fecha f = new Fecha();
        f.leer();
        System.out.println(f.toString());
        Fecha f1 = new Fecha(5,6,2009);
        System.out.println(f1.toString());
        if(Fecha.igualQue(f, f1)==true)
            System.out.println("las fechas son iguales");
        else
            System.out.println("las fechas no son iguales");
        
        if(Fecha.mayorQue(f, f1)==true)
            System.out.println(f.toString()+"  mayor que "+f1.toString());
        else
            System.out.println(f1.toString()+"  mayor que "+f.toString());
        if(Fecha.menorQue(f, f1)==true)
            System.out.println(f.toString()+"  menor que "+f1.toString());
        else
            System.out.println(f1.toString()+"  menor que "+f1.toString());
        if(f.biciesto()==true)
            System.out.println(f.toString()+"  anio bisiesto ");
        else
            System.out.println(f.toString()+" no es un anio bisiesto ");
        if(f1.biciesto()==true)
            System.out.println(f1.toString()+" es un anio bisiesto ");
        else
            System.out.println(f1.toString()+" no es un anio bisiesto ");
        f.diasEntre(f);
    }
}
