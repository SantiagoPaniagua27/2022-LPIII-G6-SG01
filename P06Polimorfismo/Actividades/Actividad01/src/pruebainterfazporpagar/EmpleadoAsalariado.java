/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebainterfazporpagar;

/**
 *
 * @author HP
 */
// Fig 10.14: EmpleadoAsalariado.java
// La clase EmpleadoAsalariado extiende a Empleado, que implementa a PorPagar

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    // constructor con cuatro argumentos
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);   // pasa argumentos al constructor de Empleado
        setSalarioSemanal(salario);  // valida y almacena el salario semanal
    } // fin del constructor de EmpleadoAsalariado con cuatro argumentos


    // validar el salario semanal, debe ser mayor a 0
    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0)
        {
            throw new IllegalArgumentException("El salario a ingresar debe ser mayor a 0");
        }
        this.salarioSemanal = salarioSemanal;
    } // fin del método setSalarioSemanal

    public double getSalarioSemanal() {
        return salarioSemanal;
    } // fin del método getSalarioSemanal
    
    // calcula los ingresos; implementar el metodo de la interfaz PorPagar
    // que era abstracto en la superclase Empleado
    @Override
    public double getMontoPago() {
        return getSalarioSemanal();
    } // fin del método obtenerMontoPago

    @Override
    public String toString() {
        return String.format("empleado asalariado: %s%n%s: $%,.2f", super.toString(), "salario semanal", getSalarioSemanal());
    } // fin del método toString
}   // fin de la clase EmpleadoAsalariado
