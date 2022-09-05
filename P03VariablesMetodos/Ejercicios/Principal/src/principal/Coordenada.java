/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
/**
 *
 * @author HP
 */
public class Coordenada {
    private int x;
    private int y;
    public Coordenada()
    {
        this.x=0;
        this.y=0;
    }
    public Coordenada(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public Coordenada(Coordenada c)
    {
        this.x=c.x;
        this.y=c.y;
    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public double distancia(Coordenada c)
    {
        //Formula de distancia entre una coordenada y el origen
        double distancia=Math.sqrt(Math.pow(c.getX()-this.x,2)+Math.pow(c.getY()-this.y,2));
        return distancia;
    }
    public static double distancia2(Coordenada c1, Coordenada c2)
    {
        //Formula de distancia entre dos puntos
        double distancia=Math.sqrt(Math.pow(c1.x-c2.x,2)+Math.pow(c1.y-c2.y,2));
        return distancia;
    }
    @Override
    public String toString(){
        return "Coordenada{" + "En x= " + x + ", y= " + y + '}';
    }
}
