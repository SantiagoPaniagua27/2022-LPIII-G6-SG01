/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e1;

/**
 *
 * @author jchal
 */
public class Triangulo extends FiguraBidimensional {

    private double altura;
    private double base;

    public Triangulo(String tipoFiguraBi, String tipoCuerpoBi, double altura, double base) {
        super(tipoFiguraBi, tipoCuerpoBi);
        setAltura(altura);
        setBase(base);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double areatotal() {
        double area;
        area = (getAltura() * getBase()) / 2;
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