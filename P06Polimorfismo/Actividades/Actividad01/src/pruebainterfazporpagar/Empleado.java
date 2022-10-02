/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebainterfazporpagar;

/**
 *
 * @author HP
 */

public abstract class Empleado implements PorPagar{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    //constructor con tres argumentos
    public Empleado(String nombre, String apellido, String nss){
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    }   //fin del constructor de Empleado con tres argumentos

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    @Override
    public String toString(){
        return String.format("%s%s\nnumero de seguro social: %s", getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());
    }   //fin del método toString
    //Nota: Aqui noimplementamos el método obtenerMontoPago de PorPagar, así que
    //esta clase debe dlecararse como abstract para evitar un error de compilación.
}   //fin de la clase abstracta Empleado
