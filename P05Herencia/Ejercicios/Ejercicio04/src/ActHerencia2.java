/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actherencia2;

/**
 *
 * @author jchal
 */
public class ActHerencia2 {

    public static void main(String []args) {
      Asalariado e1 = new Asalariado ("Challa Josué",77039691,7,4250.0);
      EmpleadoProduccion e2 =new EmpleadoProduccion("Flores Addy",77067134,4,2125.0,"Noche");
      EmpleadoDistribucion e3 =new EmpleadoDistribucion("Paniagua Santiago",75634156,5,2200.0,"Norte");
      
      
      System.out.println(e1.toString());
      System.out.println("------------------------------------------------");
      System.out.println(e2.toString());
      System.out.println("------------------------------------------------");
      System.out.println(e3.toString());
      System.out.println("------------------------------------------------");
      
      
  }    
}
