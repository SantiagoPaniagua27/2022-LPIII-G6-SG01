package actividades5.ejercicio1;

import java.util.Scanner;

public class TestComposicion {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese su ID: ");
        int id = s1.nextInt();
        System.out.println("Ingrese su nombre: ");
        String nombre = s1.next();
        System.out.println("Ingrese su apellido: ");
        String apellido = s1.next();
        System.out.println("Ingrese su saldo: ");
        double saldo = s1.nextDouble();
        int numero = id;
        int opcion, numCuenta, eleccion;
        char tipoCliente;
        boolean salir = false;
        boolean fin = false;

        do {
            System.out.println("Elija cual va a hacer su tipo como cliente: ");
            System.out.println("1. Cliente / 2. Banca Exclusiva / 3. Empresarial");
            opcion = s1.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Elegiste ser de tipo Cliente");
                    tipoCliente = 'C';
                    System.out.println("Su numero de cuenta es C1000");
                    numCuenta = 1000;
                    salir = true;
                    break;
                case 2:
                    System.out.println("Elegiste ser de tipo Banca Exclusiva");
                    tipoCliente = 'B';
                    System.out.println("Su numero de cuenta es B5000");
                    numCuenta = 5000;
                    salir = true;
                    break;
                case 3:
                    System.out.println("Elegiste ser de tipo Empresarial");
                    tipoCliente = 'E';
                    System.out.println("Su numero de cuenta es E8000");
                    numCuenta = 8000;
                    salir = true;
                    break;
                
            }
        } while (!salir); 
        
        do {
            System.out.println("Elija si desea depositar o retirar: ");
            System.out.println("1. Depositar / 2. Retirar");
            eleccion = s1.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Cuanta cantidad desea depositar:");
                    double depositar = s1.nextDouble();
                    saldo = saldo + depositar;
                    fin = true;
                    break;
                case 2:
                    System.out.println("Cuanta cantidad desea retirar:");
                    double retirar = s1.nextDouble();
                    saldo = saldo - retirar;
                    fin = true;
                    break;
            }
        } while (!fin);
        Persona persona = new Persona(id, nombre, apellido, tipoCliente, numCuenta);
        Cuenta cuenta = new Cuenta(numero, saldo, retirar, depositar);
        System.out.println(persona.toString());
        System.out.println(cuenta.toString());
    }

}
