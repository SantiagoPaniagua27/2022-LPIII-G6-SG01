/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Clase Principal
//Clase Principal
//Clase Principal
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        boolean contactoLlenado = false;
        boolean respuesta = false;
        int opcion;
        ArrayList<Contacto> Contactos = new ArrayList<Contacto>();
        do {
            System.out.println("Menu");
            System.out.println("¿Que opcion desea realizar?");
            System.out.println("1. Anadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Mostrar contactos");
            System.out.println("7. Salir");
            opcion = sc.nextInt();
            switch (opcion) 
            {
                case 1: //1. Anadir contacto
                    System.out.println("Introduzca el nombre del contacto (Nombres/Appellidos): ");
                    System.out.println("Ejemplo: JuanCarlos/PerezRodriguez");
                    String contacto = sc.next();
                    System.out.println("Introduzca el telefono del contacto:");
                    String telefono = sc.next();
                    System.out.println("Introduzca la direccion del contacto \nFormato(Pais/Ciudad/Calle/Numero/Piso/Codigo Postal) :");
                    System.out.println("Ejemplo: Peru/Arequipa/Av.Goyeneche/204/2/040201");
                    String direccion = sc.next();
                    Contactos.add(new Contacto(contacto, telefono, direccion));
                    contactoLlenado = true;
                    break;
                case 2: //2. Buscar contacto 
                    if (contactoLlenado == true) 
                    {
                        System.out.println("Introduzca el nombre del contacto a buscar (Nombres/Appellidos):");
                        System.out.println("Ejemplo: JuanCarlos/PerezRodriguez");
                        String nombre1 = sc.next();
                        for (int i = 0; i < Contactos.size(); i++) 
                        {
                            if (Contactos.get(i).getContacto().equals(nombre1)) 
                            {
                                System.out.println(Contactos.get(i).toString());
                                respuesta = true;
                                
                                i = Contactos.size();

                            }
                            //imprimir que no se encontro un contacto solo una vez
                            if (i == Contactos.size() - 1 && respuesta == false) 
                            {
                                System.out.println("No se encontro el contacto");
                            }
                        }   
                    } else {
                        System.out.println("Debes llenar un contacto primero");
                    }
                    break;
                case 3: //3. Modificar contacto
                    if (contactoLlenado==true) {
                        System.out.println("Introduzca el nombre del contacto que quiere modificar (Nombres/Appellidos):");
                        System.out.println("Ejemplo: JuanCarlos/PerezRodriguez");
                        String nombre2 = sc.next();
                        System.out.println("Introduzca el telefono del contacto que quiere modificar:");
                        String telefono2 = sc.next();
                        System.out.println("Introduzca la dirrecion del contacto que quiere modificar \nFormato(Pais/Ciudad/Calle/Numero/Piso/Codigo Postal) :");
                        System.out.println("Ejemplo: Peru/Arequipa/Av.Goyeneche/204/2/040201");
                        String direccion2 = sc.next();
                        for (int i = 0; i < Contactos.size(); i++) 
                        {
                            if (Contactos.get(i).getContacto().equals(nombre2) && Contactos.get(i).getTelefono().equals(telefono2) 
                            && Contactos.get(i).getDireccion().equals(direccion2)) 
                            {
                                System.out.println("Introduzca el nuevo nombre del contacto (Nombres/Appellidos):");
                                System.out.println("Ejemplo: JuanCarlos/PerezRodriguez");
                                String contacto2 = sc.next();
                                System.out.println("Introduzca el nuevo telefono del contacto:");
                                String telefono3 = sc.next();
                                System.out.println("Introduzca la nueva dirrecion del contacto \nFormato(Pais/Ciudad/Calle/Numero/Piso/Codigo Postal) :");
                                System.out.println("Ejemplo: Peru/Arequipa/Av.Goyeneche/204/2/040201");
                                String direccion3 = sc.next();
                                Contactos.get(i).setContacto(contacto2);
                                Contactos.get(i).setTelefono(telefono3);
                                Contactos.get(i).setDireccion(direccion3);
                                System.out.println("Contacto modificado");
                                i = Contactos.size();
                                respuesta = true;
                            }
                            if (i == Contactos.size() - 1 && respuesta == false) 
                            {
                                System.out.println("No se encontro el contacto");
                            } 
                        }  
                    } else {
                        System.out.println("Debes llenar un contacto primero");
                    }
                    break;
                case 4: //"4. Borrar contacto"
                    if (contactoLlenado==true) {
                        System.out.println("Introduzca el nombre del contacto que quiera borrar (Nombres/Appellidos):");
                        System.out.println("Ejemplo: JuanCarlos/PerezRodriguez");
                        String nombre4 = sc.next();
                        System.out.println("Introduza el telefono del contacto que quiere borrar:");
                        String telefono4 = sc.next();
                        System.out.println("Introduza la direccion del contacto que quiere borrar \nFormato(Pais/Ciudad/Calle/Numero/Piso/Codigo Postal) :");
                        System.out.println("Ejemplo: Peru/Arequipa/Av.Goyeneche/204/2/040201");
                        String direccion4 = sc.next();
                        for (int i = 0; i < Contactos.size(); i++) 
                        {
                            if (Contactos.get(i).getContacto().equals(nombre4) && Contactos.get(i).getTelefono().equals(telefono4) 
                            && Contactos.get(i).getDireccion().equals(direccion4)) 
                            {
                                Contactos.remove(i);
                                System.out.println("Contacto borrado");
                                i = Contactos.size();
                                respuesta = true;
                            }

                            if (i == Contactos.size() - 1 && respuesta == false) 
                            {
                                System.out.println("No se encontro el contacto");
                            }
                        }
                    } else {
                        System.out.println("Debes llenar un contacto primero");
                    }
                    break;
                case 5: //5. Eliminar contacto
                    if (contactoLlenado==true) {
                        System.out.println("Introduzca el nombre del contacto que quiera eliminar (Nombres/Appellidos):");
                        System.out.println("Ejemplo: JuanCarlos/PerezRodriguez");
                        String nombre5 = sc.next();
                        System.out.println("Introduza el telefono del contacto que quiere eliminar:");
                        String telefono5 = sc.next();
                        System.out.println("Introduza la direccion del contacto que quiere eliminar \nFormato(Pais/Ciudad/Calle/Numero/Piso/Codigo Postal) :");
                        System.out.println("Ejemplo: Peru/Arequipa/Av.Goyeneche/204/2/040201");
                        String direccion5 = sc.next();
                        for (int i = 0; i < Contactos.size(); i++) 
                        {
                            if (Contactos.get(i).getContacto().equals(nombre5) && Contactos.get(i).getTelefono().equals(telefono5) 
                            && Contactos.get(i).getDireccion().equals(direccion5)) 
                            {
                                Contactos.remove(i);
                                System.out.println("Contacto borrado");
                                i = Contactos.size();
                                respuesta = true;
                            }

                            if (i == Contactos.size() - 1 && respuesta == false) 
                            {
                                System.out.println("No se encontro el contacto");
                            }
                        }
                    } else {
                        System.out.println("Debes llenar un contacto primero");
                    }
                break;
                case 6: //6. Mostrar contactos
                    if (contactoLlenado==true) {
                        for (Contacto contacto6 : Contactos) {
                            System.out.println("Contacto numero: " + (Contactos.indexOf(contacto6)+1));
                            System.out.println("El contacto es (Nombres/Appellidos): " + contacto6.getContacto());
                            System.out.println("El telefono es: " + contacto6.getTelefono());
                            System.out.println("La direccion es: " + contacto6.getDireccion());
                        }
                    } else {
                        System.out.println("Debes llenar un contacto primero");
                    }
                    break;
                case 7: //7. Salir
                    salir=true;
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Tienes que elegir una opcion entre el 1 y 7");
                    break;
            } 
        } while (salir==false);
        System.out.println("FIN");
    }
}


