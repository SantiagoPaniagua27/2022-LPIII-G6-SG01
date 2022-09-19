/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestAsociacion;

/**
 *
 * @author HP
 */
public class TestAsociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona(1, "Juan", "Perez", 'A');
        Persona p2 = new Persona(2, "Maria", "Gomez", 'C');
        Persona p3 = new Persona(3, "Pedro", "Gomez", 'B');
        Persona p4 = new Persona(4, "Ana", "Perez", 'E');
        Banco b1 = new Banco("Banco de la Nacion");
        b1.agregarCliente(p1);
        b1.agregarCliente(p2);
        b1.agregarCliente(p3);
        b1.agregarCliente(p4);
        System.out.println("Cleintes: " + b1);
        System.out.println("Tipo de cuenta del primer cliente: ");
        b1.clientesTipo(p1.getTipo());
        System.out.println("Tipo de cuenta del segundo cliente: ");
        b1.clientesTipo(p2.getTipo());
        System.out.println("Tipo de cuenta del tercer cliente: ");
        b1.clientesTipo(p3.getTipo());
        System.out.println("Tipo de cuenta del cuarto cliente: ");
        b1.clientesTipo(p4.getTipo());
        System.out.println("Clientes: " + b1);
        System.out.println("Buscar a " + p1);
        System.out.println(b1.buscarCliente(p1));
        System.out.println("Buscar a " + p2);
        System.out.println(b1.buscarCliente(p2));
        System.out.println("Buscar a " + p3);
        System.out.println(b1.buscarCliente(p3));
        System.out.println("Dar de baja al cliente " + p1);
        b1.darBajaCliente(p1);
        System.out.println("Buscar si sigue existiendo el cliente " + p1 + " en el banco");
        System.out.println(b1.buscarCliente(p1));
    }
}
