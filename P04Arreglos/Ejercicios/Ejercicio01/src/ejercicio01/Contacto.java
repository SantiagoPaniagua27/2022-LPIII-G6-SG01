/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author HP
 */
//Clase Contacto
//Clase Contacto
//Clase Contacto
public class Contacto {
    private String contacto = "Contacto";
    private String telefono = "Telefono";
    private String direccion = "Direccion";

    public Contacto(String contacto, String telefono, String direccion) {
        this.contacto = contacto;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contacto [contacto=" + contacto + ", telefono=" + telefono + ", direccion=" + direccion + "]";
    }

}

