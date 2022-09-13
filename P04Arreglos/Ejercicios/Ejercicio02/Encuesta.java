
package Encuesta;

import java.util.Scanner;

public class Encuesta {
    int Sexo;
    int Trabaja;
    int Sueldo;
    
    public Encuesta(int Sexo, int Trabaja, int Sueldo) {
        this.Sexo = Sexo;
        this.Trabaja = Trabaja;
        this.Sueldo = Sueldo;
    }
    
    public int getSexo() {
        return Sexo;
    }
    
    public int setSexo(int Sexo) {
        this.Sexo = Sexo;
    }
    
    public int getTrabaja() {
        return Trabaja;
    }
    
    public int setTrabaja(int Trabaja) {
        this.Trabaja = Trabaja;
    }
    
    public int getSueldo() {
        return Sueldo;
    }
    public int setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    Scanner Leer = new Scanner(System.in);
    System.out.println("¿Cuantas personas desea ingresar?");
    int cantidad = Leer.nextInt();
    Encuesta[] lista = new Encuesta[cantidad]; //Le asignamos tamaño
    
    for (int i = 0; i < cantidad; i++){
        System.out.println("Ingrese el sexo 1) Masculino  2) Femenino");;
        int sexos = Leer.nextInt();
        int Sexo = sexos; //Guardamos en el parametro que se encuentra en nuestra clase
        
        System.out.println("¿Trabaja? 1) Si  2) No");
        int trabajo = Leer.nextInt();
        int Trabaja = trabajo;
        
        int SueldoPersona = 0;
        if (trabajo ==1) {
            System.out.println("Ingrese el sueldo");
            SueldoPersona = Leer.nextInt();
        }else{
            SueldoPersona=0;
        }
        int Sueldo = SueldoPersona;
        lista [i] = new Encuesta(Sexo, Trabaja, Sueldo);
    }
    
    int Chombres = 0;
 for(int i=0; i<lista.length; i++){
    if (lista[i].getSexo()==1){
        Chombres+=1;
    }
}
    double PorcentajeH = (Chombres*100)/lista.length;
    int Cmujeres = 0;
    for(int i=0; i<lista.length; i++){
        if (lista[i].getSexo()==1){
            Cmujeres+=1;
        }
    }
    double PorcentajeM = (Cmujeres*100)/lista.length;
    
    int HombresT = 0;
    int sueldoH = 0;
    for(int i=0;i<lista.length;i++){
        if (lista[i].getSexo()=01 && lista[i].getTrabaja()==1){
            HombresT+=1;
            sueldoH += lista[i].getSueldo();
        }
    }
    double PhombreT=(HombresT*100)/lista.length;
    double promedioH = sueldoH/HombresT;
    
    int MujeresT = 0;
    int sueldoM = 0;
    for(int i=0;i<lista.length;i++){
        if (lista[i].getSexo()=01 && lista[i].getTrabaja()==1){
            MujeresT+=1;
            sueldoM += lista[i].getSueldo();
        }
    }
    double PMujeresT=(MujeresT*100)/lista.length;
    double promedioM = sueldoM/MujeresT;
    
    System.out.println("El porcentaje total de hombres es: "+PorcentajeH);
    System.out.println("El porcentaje total de mujeres es: "+PorcentajeM);
    System.out.println("El porcentaje de hombres que trabajan es: "+PhombresT);
    System.out.println("El porcentaje de mujeres que trabajan es: "+PmujeresT);
    System.out.println("El sueldo promedio de los hombres que trabajan es: "+promedioH);
    System.out.println("El sueldo promedio de las mujeres que trabajan es: "+promedioM);
}

