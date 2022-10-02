/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.ArrayList;
//Clase Principal
//Clase Principal
public class Ejercicio02 {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        ArrayList<ImpactoEcologico> DactosDeActividad = new ArrayList<>();
        DactosDeActividad.add(new Auto(65000, "Gasolina"));
        DactosDeActividad.add(new Bicicleta(6, 8.5));
        DactosDeActividad.add(new Edificio(200, 3300));
        DactosDeActividad.add(new Auto(30000, "GLP")); 

        System.out.println("Mostrar datos de forma polimorfica y generica:\n");

    
        for (ImpactoEcologico impactoActual : DactosDeActividad) {
            System.out.printf("%s %s: %,.2f pts. GEI\n", impactoActual.toString(),"\nImpacto ecologico total: ", impactoActual.getImpactoEcologico());
            System.out.printf("\n");
        }
    
    }
}
