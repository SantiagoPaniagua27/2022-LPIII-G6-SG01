/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebainterfazporpagar;

/**
 *
 * @author HP
 */
// Fig. 10.12: Factura.java 
// La clase Factura implementa a PorPagar.

public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // constructor con cuatro argumentos
    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        setCantidad(cuenta); // valida y almacena la cantidad
        setPrecioPorArticulo(precio); // valida y almacena el precio por artículo
    } // fin del constructor de Factura con cuatro argumentos
      // método requerido para realizar el contrato con la interfaz PorPagar

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) // valida la cantidad
        {
            throw new IllegalArgumentException("La cantidad debe ser >= 0");
        }
        this.cantidad = cantidad;
    } 

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    @Override
    public double getMontoPago() {
        return getCantidad() * getPrecioPorArticulo(); // calcula el costo total
    }// fin del método obtener MontoPago
     // fin de la clase Factura

    // devuelve representación String de un objeto Factura en un toString
    @Override
    public String toString() {
        return String.format("Factura:%n%s: %s (%s)%n%s: %d%n%s: $%,.2f",
                "numero de pieza", getNumeroPieza(), getDescripcionPieza(),
                "cantidad", getCantidad(), "precio por articulo", getPrecioPorArticulo());
    } // fin del método toString
}