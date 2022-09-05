/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;
import java.util.*;
public class Principal {
    public static void main(String[] args) throws Exception {
        //Formar un for para que el usuario pueda crear cuantos rectangulos quiera
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de rectangulos que desea crear: ");
        int cantidad=sc.nextInt();
        for(int i=0;i<cantidad;i++)
        {
            System.out.println("Ingrese la coordenada x de la esquina 1: ");
            int x1=sc.nextInt();
            System.out.println("Ingrese la coordenada y de la esquina 1: ");
            int y1=sc.nextInt();
            System.out.println("Ingrese la coordenada x de la esquina 2: ");
            int x2=sc.nextInt();
            System.out.println("Ingrese la coordenada y de la esquina 2: ");
            int y2=sc.nextInt();
            Coordenada esquina1=new Coordenada(x1,y1);
            Coordenada esquina2=new Coordenada(x2,y2);
            Rectangulo rect=new Rectangulo(esquina1,esquina2);
            System.out.println("El rectangulo es: "+rect);
            Manejador manejador=new Manejador();
            manejador.area(rect);
            manejador.perimetro(rect);
            manejador.moverX(rect);
            manejador.moverY(rect);
            //imprimir la variable de clase color
            rect.contador();
        }
    }
}