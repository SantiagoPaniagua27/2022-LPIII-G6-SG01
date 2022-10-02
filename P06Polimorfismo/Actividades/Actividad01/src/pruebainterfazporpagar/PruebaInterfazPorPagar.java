/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebainterfazporpagar;

/**
 *
 * @author HP
 */
public class PruebaInterfazPorPagar {
    public static void main(String[] args){
        //crear arreglo PorPagar para cuatro elementos
        PorPagar[] objetosPorPagar = new PorPagar[6];

        //llena el arreglo con objetos que implementen la interfaz pagar
        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetosPorPagar[4] = new Prestamo("Juan", "Perez", "222-22-2222", 48, 250);
        objetosPorPagar[5] = new Prestamo("Maria", "Gomez", "333-33-3333", 36, 500);

        System.out.println("Facturas y Empleados procesados de forma polimorfica:\n");

        //procesa en forma generica cada elemento en el arreglo objetosPorPagar

        for (PorPagar porPagarActual : objetosPorPagar){
            System.out.printf("%s \n%s: $%,.2f\n\n", porPagarActual.toString(), "pago vencido", porPagarActual.getMontoPago());
        }   // fin de for
    }   // fin de main
}   // fin de la clase PruebaInterfazPorPagar
