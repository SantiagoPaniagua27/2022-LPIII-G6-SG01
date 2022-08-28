package ejercicio1cuentabancaria;
import java.util.*;

/**
 *
 * @author HP
 */
public class Ejercicio1CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        String nomb;
        double cant=0;
        char opc;
        int nro;
        System.out.println("Ingrese el nombre del titular ");
        nomb=sc.next();
        System.out.println("¿Desea ingresar una cantidad inicial? (S/N)");
        opc=sc.next().charAt(0);
        if(opc=='s' || opc=='S')
        {
            System.out.println("Ingrese la cantidad inicial ");
            cant=sc.nextDouble();
        }
        
        ClaseCuentaBanco cuenta1=new ClaseCuentaBanco(nomb,cant);
        System.out.println(cuenta1.toString());
        System.out.println("\tMENU ");
        System.out.println("=========================== ");
        System.out.println("Elija una de las opciones ");
        System.out.println("1. Ingresar dinero ");
        System.out.println("2. Retirar dinero ");
        System.out.println("3. Mostrar saldo actual ");
        
        nro=sc.nextInt();
        switch (nro) {
            case 1:
                System.out.println("Ingrese la cantidad a ingresar ");
                cant = sc.nextDouble()+ cant;
                cuenta1.ingresar(cant);
                break;
            case 2:
                System.out.println("Ingrese la cantidad a retirar ");
                cant = sc.nextDouble();
                cuenta1.retirar(cant);
                break;
            case 3:
                System.out.println("El saldo actual es: " + cuenta1.getCantidad());
                break;
            default:
                System.out.println("Opcion no valida ");
                break;
        }
        
        System.out.println(cuenta1.toString());
    }
    
}
