/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;
//clase Auto
//clase Auto
public class Auto implements ImpactoEcologico {
    final static double FACTOR_DE_EMISION_AUTO = 0.5;
    private double KilometrosRecorridos;        //Kilometros recorridos por el auto
    private String TipoDeCombustible;           //Tipo de combustible del auto
    private double DATO_ACTIVIDAD;              //dato de actividad de carbono
    public Auto(double KilometrosRecorridos, String LitrosDeGasolina) {
        this.KilometrosRecorridos = KilometrosRecorridos;
        this.TipoDeCombustible = LitrosDeGasolina;
    }

    public void setKilometrosRecorridos(double KilometrosRecorridos) {
        this.KilometrosRecorridos = KilometrosRecorridos;
    }

    public void setTipoDeCombustible(String TipoDeCombustible) {
        this.TipoDeCombustible = TipoDeCombustible;
    }

    public double getKilometrosRecorridos() {
        return KilometrosRecorridos;
    }

    public String getTipoDeCombustible() {
        return TipoDeCombustible;
    }

    public double DATO_ACTIVIDAD() {
        //Formula: De acuerdo a cada 100 kilometros y el kolimetraje promedio total de un auto
        //KilometrosRecorridos/100KM * CO2ProducidoPorLitroDeCombustible * Litros de gasolina por 100Km / 100Km
        switch (getTipoDeCombustible().toLowerCase()) {
            case "gasolina":
                DATO_ACTIVIDAD=(KilometrosRecorridos/100)*((2392*6)/100);
                break;
            case "diesel":
                DATO_ACTIVIDAD=(KilometrosRecorridos/100)*((2640*5)/100);
                break;
            case "glp":
                DATO_ACTIVIDAD=(KilometrosRecorridos/100)*((1665*6)/100);
                break;
            case "electrico":
                DATO_ACTIVIDAD=((KilometrosRecorridos/100)*((2392*6)/100))*0.7;
                break;
            default:
                DATO_ACTIVIDAD=0;
                break;
        }
        return DATO_ACTIVIDAD;
    }

    @Override
    public double getImpactoEcologico() {
        return DATO_ACTIVIDAD() * FACTOR_DE_EMISION_AUTO;
    }
    
    @Override
    public String toString() {
        return String.format("Auto con kilometraje promedio total : %s\nTipo de combustible : %s  "
        , getKilometrosRecorridos(), getTipoDeCombustible());
    }
}