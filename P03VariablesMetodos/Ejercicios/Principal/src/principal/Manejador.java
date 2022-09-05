/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Manejador {
    //Método de clase para calcular el areacon los datos que ingreso el usuario
    public void area(Rectangulo rect)
    {
        int altura=Math.abs(rect.getEsquina1().getY()-rect.getEsquina2().getY());
        int base=Math.abs(rect.getEsquina1().getX()-rect.getEsquina2().getX());
        int area=base*altura;
        System.out.println("El area del rectangulo es: "+area);
    }

    //Método de clase para calcular el perímetro
    public void perimetro(Rectangulo rect){
        int altura=Math.abs(rect.getEsquina1().getY()-rect.getEsquina2().getY());
        int base=Math.abs(rect.getEsquina1().getX()-rect.getEsquina2().getX());
        int perimetro=(base*2)+(altura*2);
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }

    //Método de clase para desplazar rectangulo en el eje x
    public void moverX(Rectangulo rect){

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de desplazamiento en el eje X: ");
        int desplazamientoX=sc.nextInt();
        int x1=rect.getEsquina1().getX();
        int x2=rect.getEsquina2().getX();
        x1+=desplazamientoX;
        x2+=desplazamientoX;
        rect.getEsquina1().setX(x1);
        rect.getEsquina2().setX(x2);
        System.out.println("El rectangulo desplazado en el eje X es: "+rect);
    }
    
    //Método de clase para desplazar rectangulo en el eje y
    public void moverY(Rectangulo rect){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de desplazamiento en el eje Y: ");
        int desplazamientoY=sc.nextInt();
        int y1=rect.getEsquina1().getY();
        int y2=rect.getEsquina2().getY();
        y1+=desplazamientoY;
        y2+=desplazamientoY;
        rect.getEsquina1().setY(y1);
        rect.getEsquina2().setY(y2);
        System.out.println("El rectangulo desplazado en el eje Y es: "+rect);
    }
}
