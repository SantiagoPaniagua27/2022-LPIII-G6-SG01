/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e1;

/**
 *
 * @author jchal
 */
public class Circulo extends FiguraBidimensional {

    private double radio;

    public Circulo(String tipoFiguraBi, String tipoCuerpoBi, double radio) {
        super(tipoFiguraBi, tipoCuerpoBi);
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double areatotal() {
        double area;
        area = 3.14 * (getRadio()* getRadio());
        return area;
    }

    public double volumentotal() {
        return 0;
    }


    @Override
    public String toString() {
        return "----------------------------"+ "\n" +
                "La figura es un: " + this.tipoFiguraBi + "\n" + "Es una: " + this.tipoCuerpoBi + "\n" + "Su area es: " + this.areatotal();
    }
}
