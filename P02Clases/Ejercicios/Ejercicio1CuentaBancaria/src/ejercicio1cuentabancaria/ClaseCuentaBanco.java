package ejercicio1cuentabancaria;
public class ClaseCuentaBanco {
    
   
    private String titular;
    private double cantidad;

    public ClaseCuentaBanco(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public ClaseCuentaBanco(String titular) {
        this.titular = titular;
        cantidad=0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBanco{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    public void ingresar(double cantidad)
    {
        if(cantidad>=0)
            this.cantidad=cantidad;
    }
    public void retirar(double cantidad)
    {
        if(cantidad>this.cantidad)
            this.cantidad=0;
        else
            this.cantidad=this.cantidad-cantidad;
    }

}