/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAgregacion;

//Clase Motor
//Clase Motor
//Clase Motor
public class Motor {
    private int numMotor;
    private int RevPorMin;
    Automovil automovil;

    public Motor(int numMotor, int revPorMin) {
        this.numMotor = numMotor;
        RevPorMin = revPorMin;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getRevPorMin() {
        return RevPorMin;
    }

    public void setRevPorMin(int revPorMin) {
        RevPorMin = revPorMin;
    }

    // toString con motor
    // toString con motor
    public String toString() {
        return "Automovil con motor \nPlaca      : " + automovil.getPlaca() + "\nNo. Motor  : " + numMotor + "\nNo. Puertas: "
                + automovil.getNumPuertas() + "\nMarca      : " + automovil.getMarca() + "\nModelo     : " + automovil.getModelo() 
                + "\nRPM        : " + RevPorMin;
    }

}
