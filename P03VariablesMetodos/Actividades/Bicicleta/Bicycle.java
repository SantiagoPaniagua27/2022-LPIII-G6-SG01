/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lp03_g06_s03;

/**
 *
 * @author pania
 */
public class Bicycle {
    static int count;
    private String ownerName;
    private float distance;
    private String idBicy;
    public Bicycle (String ownerName, int diatance ) {
        this.ownerName = ownerName;
        this.distance = distance;
        counter();
        String tempId = String.valueOf(1000 * count);
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public float getDistance() {
        return this.distance;
    }
    public void distanceTraveled (int meters) {
        this.distance += meters;
    }
    public static void counter() {
        count ++;
    }
    public static Bicycle mostUsed(Bicycle x, Bicycle y){
        if (x.distance > y.distance)
            return x;
        return y;
    }
    @Override
    public String toString() {
        String s = String.format("Bicycle : $\nOwner : $\tDistance in meters : %10.2f\n",this.idBicy,this.ownerName,this.distance);
        return s;
    }
}
