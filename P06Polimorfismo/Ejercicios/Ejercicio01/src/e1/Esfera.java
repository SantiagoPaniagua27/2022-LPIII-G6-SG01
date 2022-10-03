/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e1;

/**
 *
 * @author jchal
 */
public class Esfera extends FiguraTridimensional {

    private double radio;

    public Esfera(String tipoFiguraTri, String tipoCuerpoTri, double radio) {
        super(tipoFiguraTri, tipoCuerpoTri);
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
        area = 4 * (3.14 * (getRadio()* getRadio()));
        return area;
    }

    public double volumentotal() {
        double volumen;
        volumen = (4/3) * (3.14 * (getRadio()* getRadio()));
        return volumen;
    }

    @Override
    public String toString() {
        return "\n" +"----------------------------"+
                "\n"+"La figura es una: " + this.tipoFiguraTri + "\n" + "Es una: " + this.tipoCuerpoTri + "\n" + "Su area es: " + this.areatotal()+ "\n" + "Su volumen es: " + this.volumentotal();
    }

}
