/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAgregacion;


//Clase Automovil
//Clase Automovil
//Clase Automovil
public class Automovil {
    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;

    public Automovil(String placa, int numPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //toString sin motor
    //toString sin motor
    public String toString() {
        return "Automovil sin motor \nPlaca      :" + placa + "\nNo. Puertas: " + numPuertas + "\nMarca      : " + marca + "\nModelo     : " + modelo;
    }

}

