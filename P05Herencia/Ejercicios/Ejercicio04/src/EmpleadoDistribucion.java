/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actherencia2;

/**
 *
 * @author jchal
 */
public class EmpleadoDistribucion extends Asalariado{
    private String region;
    private double salariodist;
    public EmpleadoDistribucion (String nombre,long dni,int diasVacaciones,double salario, String region){
        super(nombre,dni,diasVacaciones,salario);
        this.region = region;
    }
    public double nomica () {
        double n1,n2;
        n1=getSalario();
        n2 =getSalario()*0.1;
        this.salariodist= n1+n2;
        return this.salariodist;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getSalariodist() {
        return salariodist;
    }

    public void setSalariodist(double salariodist) {
        this.salariodist = salariodist;
    }

    public String getRegion() {
        return region;
    }
    @Override
    public String toString() {
        return "Empleado de Distribucion" +"------------------------ \ndni            : " + getDni()+ "  \nNombre         : " + getNombre() +                 " \ndiasVacasiones : " + getDiasVacasiones() + " dias"+"     \nZona: "+region+" \nSalario        : " + this.nomica();
    } 
}


