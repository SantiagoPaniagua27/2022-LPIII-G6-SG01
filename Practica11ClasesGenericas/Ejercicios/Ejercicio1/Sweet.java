
package e1s11;

public class Sweet extends Biscuits {
    //Atributos

    private double cantAzucar;

    public Sweet(int id, float price, String forma, double cantAzucar) {
        super(id, price, "Dulce", forma);
        this.cantAzucar = cantAzucar;
    }

    //Setters y Getters
    public double getCantAzucar() {
        return this.cantAzucar;
    }

    public void setCantAzucar(double cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Sweet) {
            Sweet sodaComparar = (Sweet) obj;
            return this.cantAzucar == sodaComparar.cantAzucar
                    && this.getForma().equals(sodaComparar.getForma());
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantidad de Azucar: " + this.cantAzucar;
    }

}
