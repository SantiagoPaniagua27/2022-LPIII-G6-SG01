
import java.util.Scanner;
public class App{
    public static void main(String[] args) throws ObjectNoExist {
        Dictionary<Integer,String> diccionario1 = new Dictionary<Integer,String>();
        Scanner sc = new Scanner (System.in);
        boolean validadorApp = true;
        while(validadorApp){
            boolean validadorWhile = false;
            int opc = 0;
            while (!validadorWhile){
                System.out.println(" =========== Menu =========== ");
                System.out.println("  ");
                System.out.println("1. Ingresar un contacto");
                System.out.println("2. Borrar contacto");
                System.out.println("3. Mostrar datos contactos");
                System.out.println("4. Mostrar los contactos");
                System.out.println("5. Salir del programa");
                System.out.println(" ============================ ");
                System.out.print("Ingrese su opcion del Menu :\n");
                try {
                    opc = sc.nextInt();
                    validadorWhile = true;
                } catch (Exception e) {
                    System.out.println("Error: Ingrese un numero del 1 al 5");
                    sc.nextLine();
                }
                if(opc >= 1 && opc <= 5)
                    validadorWhile = true;
            }
            switch(opc){
                case 1:
                    int dni = 0;
                    System.out.print("Ingrese el DNI del contacto: ");
                    try {
                        dni = sc.nextInt();
                        if(dni < 0){
                            System.out.println("Error: El DNI no puede ser negativo");
                            break;
                        }
                        System.out.print("Ingrese el o los valores del contacto: ");
                        String valor = sc.next();

                        diccionario1.add(dni,valor);
                    } catch (Exception e) {
                        System.out.println("Error: El DNI debe ser un numero entero");
                        sc.nextLine();
                    }
                    break;
                case 2:    
                    try {
                        System.out.print("Ingrese el DNI del contacto a borrar: ");
                        int dniBorrar = sc.nextInt();
                        if(dniBorrar < 0){
                            System.out.println("Error: El DNI no puede ser negativo");
                            break;
                        }
                        if(diccionario1.delete(dniBorrar))
                            System.out.println("Contacto borrado");
                        else
                            System.out.println("Error: El contacto no existe");
                    } catch (Exception e) {
                        System.out.println("Error: El DNI debe ser un numero entero");
                        sc.nextLine();
                    } 
                    break;
                case 3:
                    try {
                        System.out.print("Ingrese el DNI a mostrar del contacto: ");
                        dni = sc.nextInt();
                        if(dni < 0){
                            System.out.println("Error: El DNI no puede ser negativo");
                            break;
                        }
                        System.out.println(diccionario1.getValue(dni));
                    } catch (Exception e) {
                        System.out.println("Error: El DNI debe ser un numero entero");
                        sc.nextLine();
                    } 
                    break;
                case 4:
                    System.out.println("Imprimiendo todos los contactos: ");
                    System.out.println(diccionario1);
                    break;
                case 5:
                    validadorApp = false;
                    break;
            }
        }
    }
}