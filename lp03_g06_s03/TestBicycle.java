/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp03_g06_s03;
/**
 *
 * @author pania
 */
public class TestBicycle {
    public static void main(String[] args) {
        Bicycle a,b;
        a = new Bicycle("Adam Smith", 1);
        b = new Bicycle("Ben Jones", 5);
        a.distanceTraveled(240);
        System.out.println(b.getOwnerName());
        b.distanceTraveled(1100);
        Bicycle mostOld = Bicycle.mostUsed(a, b);
        System.out.println(mostOld);
    }
}
