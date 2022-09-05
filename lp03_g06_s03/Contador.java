/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp03_g06_s03;

/**
 *
 * @author pania
 */
public class Contador {
    static int acumulador = 0;
    final static int VALOR_INICIAL = 10;
    private int valor;
    static int nContadores = 0;
    static int ultimoContador = 0;
    public static int acumulador() {
        return acumulador;
    }
    public Contador (int valor) {
        this.valor = valor;
        Contador.acumulador += valor;
    }
    public Contador() {
        new Contador(Contador.VALOR_INICIAL);
    }
    public void inc() {
        this.valor++;
        acumulador++;
        nContadores++;
        ultimoContador = acumulador;
    }
    public int getValor() {
        return this.valor;
    }
}
