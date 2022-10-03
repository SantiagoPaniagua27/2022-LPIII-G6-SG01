/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1;

/**
 *
 * @author jchal
 */
public class E1 {
    
    public static void main(String[] args) {
    
        Figura[] Figuras = new Figura[6];

        Figuras[0] = new Circulo( "Circulo", "Figura Bidimensional", 2);
        Figuras[1] = new Cuadrado("Cuadrado", "Figura Bidimensional", 4);
        Figuras[2] = new Triangulo("Triangulo", "Figura Bidimensional", 12, 5);
        Figuras[3] = new Esfera("Esfera", "Figura Tridimensional", 4);
        Figuras[4] = new Cubo("Cubo", "Figura Tridimensional", 7);
        Figuras[5] = new Tetraedro("Tetraedro", "Figura Tridimensional", 3);

        int cB= 0;
        int cT= 0;
        for(Figura FigurasCreadas : Figuras) 
        {
            System.out.printf( FigurasCreadas.toString());

            if(FigurasCreadas instanceof FiguraBidimensional){
                cB = cB+1;
            }

            if(FigurasCreadas instanceof FiguraTridimensional){
                cT = cT+1;
            }
        }
    }
}
