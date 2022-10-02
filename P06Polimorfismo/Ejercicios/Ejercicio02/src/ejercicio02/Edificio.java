/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;
//Clase Edificio
//Clase Edificio
public class Edificio implements ImpactoEcologico {
    final static double FACTOR_DE_EMISION_EDIFICIO = 0.5;
    private double MontoPromedioDeReciboDeAgua;  // Monto promedio que pagan por mes de recibo de agua
    private double MontoPromedioDeReciboDeLuz;   // Monto promedio que pagan por mes de recibo de luz
    private double DATO_ACTIVIDAD;               //dato de actividad de carbono

    public Edificio(double MontoPromedioDeReciboDeAgua, double MontoPromedioDeReciboDeLuz) {
        this.MontoPromedioDeReciboDeAgua = MontoPromedioDeReciboDeAgua;
        this.MontoPromedioDeReciboDeLuz = MontoPromedioDeReciboDeLuz;
    }

    public void setMontoPromedioDeReciboDeAgua(double MontoPromedioDeReciboDeAgua) {
        this.MontoPromedioDeReciboDeAgua = MontoPromedioDeReciboDeAgua;
    }

    public void setMontoPromedioDeReciboDeLuz(double MontoPromedioDeReciboDeLuz) {
        this.MontoPromedioDeReciboDeLuz = MontoPromedioDeReciboDeLuz;
    }

    public double getMontoPromedioDeReciboDeAgua() {
        return MontoPromedioDeReciboDeAgua;
    }

    public double getMontoPromedioDeReciboDeLuz() {
        return MontoPromedioDeReciboDeLuz;
    }

    public double DATO_ACTIVIDAD() {
        //Formula: MontoDeAgua/CosteDeAguaPorMetroCubicoEnPeru*CO2PorMetroCubico
        // + MontoDeLuz/CosteDeLuzPorKilowattEnPEru*CO2PorKilowatt*24Horas*365Dias
        DATO_ACTIVIDAD=(((MontoPromedioDeReciboDeAgua/2.36)*0.550)+((MontoPromedioDeReciboDeLuz/0.852)*0.397))*16*365;  
        return DATO_ACTIVIDAD;
    }

    @Override
    public double getImpactoEcologico() {
        
        return DATO_ACTIVIDAD() * FACTOR_DE_EMISION_EDIFICIO;
        
    }
    
    @Override
    public String toString() {
        //procesa en forma generica cada elemento en el arreglo objetosPorPagar
        System.out.println("Impacto ecologico de un edificio por año");
        return String.format("Edificio con monto promedio de recibo de agua  %s\nMonto promedio de recibo de luz %s: "
        , getMontoPromedioDeReciboDeAgua(), getMontoPromedioDeReciboDeLuz());
    }
}