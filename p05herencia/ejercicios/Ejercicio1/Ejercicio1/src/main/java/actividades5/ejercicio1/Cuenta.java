package actividades5.ejercicio1;

public class Cuenta {

    private int numero;
    private double saldo;
    private double retirar;
    private double depositar;

    public Cuenta(int numero, double saldo, double retirar, double depositar) {
        this.numero = numero;
        this.saldo = saldo;
        this.retirar = retirar;
        this.depositar = depositar;
        
    }

    public Cuenta(int numero) {
        this(numero);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public int getRetirar() {
        return retirar;
    }
    
    public int getDepostiar() {
        return depositar;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }
    
    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    @Override
    public String toString() {
        return "Cuenta {" + "Numero= " + numero + ", Saldo= " + saldo + "Retiro: " + retirar + "Deposito: " + depositar + "}";
    }
}
