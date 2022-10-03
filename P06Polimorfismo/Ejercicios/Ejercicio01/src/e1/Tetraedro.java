/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e1;

/**
 *
 * @author jchal
 */
public class Tetraedro extends FiguraTridimensional {

    private double lado;


    public Tetraedro(String tipoFiguraTri, String tipoCuerpoTri, double lado) {
        super(tipoFiguraTri, tipoCuerpoTri);
        setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double areatotal() {
        double area;
        area = (getLado()* getLado()) * Math.sqrt(3);
        return area;
    }

    public double volumentotal() {
        double volumen;
        volumen = (getLado()* getLado()* getLado()) * (double)(Math.sqrt(2)/12);
        return volumen;
    }

    @Override
    public String toString() {
        return "\n" +"----------------------------"+
                "\n"+"La figura es un: " + this.tipoFiguraTri + "\n" + "Es una: " + this.tipoCuerpoTri + "\n" + "Su area es: " + this.areatotal()+ "\n" + "Su volumen es: " + this.volumentotal()+ "\n";
    }

}