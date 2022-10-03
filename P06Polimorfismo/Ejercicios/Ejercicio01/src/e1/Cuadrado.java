/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e1;

/**
 *
 * @author jchal
 */
public class Cuadrado extends FiguraBidimensional {

    private double lado;

    public Cuadrado(String tipoFiguraBi, String tipoCuerpoBi, double lado) {
        super(tipoFiguraBi, tipoCuerpoBi);
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
        area = (getLado()* getLado());
        return area;
    }

    public double volumentotal() {
        return 0;
    }

    @Override
    public String toString() {
        return "\n" +"----------------------------"+
                "\n"+"La figura es un: " + this.tipoFiguraBi + "\n" + "Es una: " + this.tipoCuerpoBi + "\n" + "Su area es: " + this.areatotal();
    }

}
