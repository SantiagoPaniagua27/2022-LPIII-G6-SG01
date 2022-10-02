/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebainterfazporpagar;

/**
 *
 * @author HP
 */

//Clase Prestamo
//Clase Prestamo

//Clase Prestamo
//Clase Prestamo
public class Prestamo extends Empleado {
    private double numeroDeCuotas;
    private double montoDeCuota;

    public Prestamo(String nombre, String apellido, String nss, double numeroDeCuotas, double montoDeCuota) {
        super(nombre, apellido, nss);
        setNumeroDeCuotas(numeroDeCuotas);
        setMontoDeCuota(montoDeCuota);
    }

    // validar el numero de cuotas, debe ser mayor a 0
    public void setNumeroDeCuotas(double numeroDeCuotas) {
        if (numeroDeCuotas < 0.0)
        {
            throw new IllegalArgumentException("El numero de couotas a ingresar debe ser mayor a 0");
        }
        this.numeroDeCuotas = numeroDeCuotas;
    }

    // validar el monto de cuota, debe ser mayor a 0
    public void setMontoDeCuota(double montoDeCuota) {
        if (montoDeCuota < 0.0) 
        {
            throw new IllegalArgumentException("Tiene que ingresar un monto de cuota mayor a 0");
        }
        this.montoDeCuota = montoDeCuota;
    }

    public double getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public double getMontoDeCuota() {
        return montoDeCuota;
    }

    @Override
    public double getMontoPago() {
        return getNumeroDeCuotas() * getMontoDeCuota();
    }

    public String toString() {
        return String.format("Prestamo: %s%n%s: $%,.2f", super.toString(), "Monto a pagar", getMontoPago());
    }
}
