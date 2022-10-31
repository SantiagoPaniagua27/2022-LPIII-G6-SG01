/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a5s9;

public class Persona {

    protected String nombre;
    protected String telefono;
    protected String direccion;

    public Persona(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return this.nombre + "\t" + this.telefono + "\t" + this.direccion + "\n";
    }

}
