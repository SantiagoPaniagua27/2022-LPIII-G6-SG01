/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAsociacion;

//Clase Banco
//Clase Banco
//Clase Banco
public class Banco {
    private String nombre;
    private Persona clientes[];
    
    public Banco(String nombre) {
        this (nombre,4);
    }
    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        clientes = new Persona[numCli];

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }

    public void agregarCliente(Persona persona) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = persona;
                break;
            }
        }
    }

    //método darBajaCliente
    //método darBajaCliente
    public Persona darBajaCliente(Persona persona) {
        if (this.buscarCliente(persona)) {
            boolean index = false;
            for (int i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i] != null) {
                    if (this.clientes[i].equals(persona)) {
                        index = true;
                        System.out.println("Se eliminara al cliente " + this.clientes[i]);
                        this.clientes[i] = null;
                       
                    }
                    if (index && i+1< this.clientes.length) {
                        this.clientes[i] = this.clientes[i+1];
                    }
                }
            }
            
        }
        else {
            System.out.println("El cliente no existe");
            return persona;
        }
        return persona;
    }

    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }
    public void clientesTipo(char tipo) {
        if (tipo == 'C') {
            System.out.println("Cuenta Cliente");
               
        } else if (tipo == 'B') {
            System.out.println("Banda exclusica");
                
        } else if (tipo == 'E') {
            System.out.println("Empresarial");
                
        } else {
            System.out.println("Cuenta Desconocida");
        } 
    }

    public String toString() {
        //imprimir la informacion de todos los clientes del banco uno por uno
        String info = "Nombre del banco: " + nombre + ", Clientes del Banco: ";
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                info += clientes[i].toString();
            }
        }
        info += "]";
        return info;
    }
}
