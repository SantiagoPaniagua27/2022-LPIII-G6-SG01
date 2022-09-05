/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
/**
 *
 * @author HP
 */
//Clase REctangulo
public class Rectangulo {
    //llamar al constructor coodenaada
    private Coordenada esquina1;
    private Coordenada esquina2;
    private String Color;
    static int contador=0;
    public Rectangulo(Coordenada c1, Coordenada c2)
    {
        this.esquina1=c1;
        this.esquina2=c2;
    }
    public Coordenada getEsquina1()
    {
        return this.esquina1;
    }
    public void setEsquina1(Coordenada c1)
    {
        this.esquina1=c1;
    }
    public Coordenada getEsquina2()
    {
        return this.esquina2;
    }
    public void setEsquina2(Coordenada c2)
    {
        this.esquina2=c2;
    }
    @Override
    public String toString(){
        return "Rectangulo{" + "La esquina1= " + esquina1 + ",La esquina2= " + esquina2 + '}';
    }

    //Constructor para la creación de un rectangulo desde (0,0)
    public Rectangulo(int base, int altura)
    {
        this.esquina1=new Coordenada(0,0);
        this.esquina2=new Coordenada(base,altura);
    } 
    //Agregue la variable de clase color e incremente su valor en 1 cada vez que se crea un rectangulo
    public void contador()
    {
        if (Rectangulo.contador==0)
        {
            System.out.println("El color del rectangulo es verde");
        }
        else if (Rectangulo.contador==1)
        {
            System.out.println("El color del rectangulo es amarillo");
        }
        else if (Rectangulo.contador==2)
        {
            System.out.println("El color del rectangulo es rojo");
        }
        else
        {
            System.out.println("El color del rectangulo es verde");
            contador=0;
        }
        contador++;
    }
}
