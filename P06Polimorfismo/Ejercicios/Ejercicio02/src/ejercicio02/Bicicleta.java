/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;
//clase Bicicleta
//clase Bicicleta
public class Bicicleta implements ImpactoEcologico {
    final static double FACTOR_DE_EMISION_BICICLETA = 0.05;
    private double HorasPromedioDeUsoSemanal;  // Horas de uso promedio por dia
    private double PesoDeLaBicicleta;   //material(metal,platico,etc) total invertido de la bicicleta
    private double DATO_ACTIVIDAD;      //dato de actividad de carbono

    public Bicicleta(double HorasPromedioDeUsoSemanal, double PesoDeLaBicicleta) {
        this.HorasPromedioDeUsoSemanal = HorasPromedioDeUsoSemanal;
        this.PesoDeLaBicicleta = PesoDeLaBicicleta;
    }

    public void setHorasPromedioDeUsoSemanal(double HorasPromedioDeUsoSemanal) {
        this.HorasPromedioDeUsoSemanal = HorasPromedioDeUsoSemanal;
    }

    public void setPesoDeLaBicicleta(double PesoDeLaBicicleta) {
        this.PesoDeLaBicicleta = PesoDeLaBicicleta;
    }

    public double getHorasPromedioDeUsoSemanal() {
        return HorasPromedioDeUsoSemanal;
    }

    public double getPesoDeLaBicicleta() {
        return PesoDeLaBicicleta;
    }

    public double DATO_ACTIVIDAD() {
        //Forumula: HorasDeUsoSemanal*HorasDeUsoSemanal(EnergiaQueProducimosParaMoverLaBicicleta)*PorcentajeDeCarbonoQueutilizamosParaMoverLaBicicleta 
        // + PesoDeLaBicicleta*1000(De kg a gramos)*PorcentajeDeCarbonoQueUtilizamosParaFabricarLaBicicleta
        DATO_ACTIVIDAD=((Math.pow(HorasPromedioDeUsoSemanal, 2)*(0.15))*PesoDeLaBicicleta*(0.95))*30;
        return DATO_ACTIVIDAD;
    }

    @Override
    public double getImpactoEcologico() {
        return DATO_ACTIVIDAD() * FACTOR_DE_EMISION_BICICLETA;
    }
    
    @Override
    public String toString() {
        return String.format("Horas promedio de uso por semana :%s\nPeso total de la bicicleta :%s"
        ,getHorasPromedioDeUsoSemanal(),getPesoDeLaBicicleta());
    }
}