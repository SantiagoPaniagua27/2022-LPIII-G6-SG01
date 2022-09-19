/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actherencia2;

/**
 *
 * @author jchal
 */
public class EmpleadoProduccion extends Asalariado{
    private String turno;
    private double salarioprod;
    public EmpleadoProduccion (String nombre, long dni, int diasVacaciones,double salario, String turno){
        super(nombre,dni,diasVacaciones,salario);      
        this.turno = turno;
    }
    public double nomica () {
        double n1,n2;
        n1=getSalario();
        n2 =getSalario()*0.15;
        this.salarioprod= n1+n2;
        return this.salarioprod;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setSalarioprod(double salarioprod) {
        this.salarioprod = salarioprod;
    }

    public String getTurno() {
        return turno;
    }

    public double getSalarioprod() {
        return salarioprod;
    }
    @Override
    public String toString() {
        return "Empleado de Produccion" +"-------------------------- \ndni            : " + getDni()+ "  \nNombre         : " + getNombre() +                 " \ndiasVacasiones : " + getDiasVacasiones() + " dias"+"     \nTurno: "+turno+" \nSalario        : " + this.nomica();
    }    
    
}
