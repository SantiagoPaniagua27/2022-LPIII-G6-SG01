/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package practicasesion03;
/**
*
* @author HP
*/
public class Diagnóstico {
    private double temperatura;
    private double peso1;
    private int edad;
    public Diagnóstico() {
        this.temperatura = 0.0;
        this.peso1 = 0.0;
        this.edad = 0;
    }
    
    public void aptoVacunaA(Perro x){
        temperatura = x.getTemp();
        peso1=x.peso;
        edad = x.getEdad();
        
        if (41>=temperatura && temperatura>=37 && peso1>5 && edad>1){
            System.out.println("El perro esta sano");
        }
        else{
            System.out.println("El perro esta enfermo");
        }
    }
    public void aptoVacunaB(Perro x){
        temperatura = x.getTemp();
        peso1=x.peso;
        edad = x.getEdad();
        
        if (41>=temperatura && temperatura>=37 && peso1>5 && edad>1){
            System.out.println("El perro esta sano");
        }
        else{
            System.out.println("El perro esta enfermo");
        }
    }
}
