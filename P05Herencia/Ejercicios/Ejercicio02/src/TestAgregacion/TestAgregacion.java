/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestAgregacion;

/**
 *
 * @author HP
 */
public class TestAgregacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Automovil auto = new Automovil("AU398", 3, "Toyota", "Corolla");
        Motor motor = new Motor(3728, 1000);
        motor.automovil = auto;
        System.out.println("Automovil numero 1");
        System.out.println(auto+"\n");
        System.out.println(motor+"\n");
        Automovil auto2 = new Automovil("PO398", 4, "KIA", "Rio");
        Motor motor2 = new Motor(4728, 2500);
        motor2.automovil = auto2;
        System.out.println("Automovil numero 2");
        System.out.println(auto2+"\n");
        System.out.println(motor2+"\n");
    }
}
