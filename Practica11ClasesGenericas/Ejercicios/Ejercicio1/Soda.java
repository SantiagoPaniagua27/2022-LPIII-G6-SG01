package e1s11;

public class Soda extends Biscuits {

    private double cantSal;

    public Soda(int id, float price, String forma, double cantSal) {
        super(id, price, "Salada", forma);
        this.cantSal = cantSal;
    }

    public double getCantSal() {
        return this.cantSal;
    }

    public void setCantSal(double cantSal) {
        this.cantSal = cantSal;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Soda) {
            Soda sodaComparar = (Soda) obj;
            return this.cantSal == sodaComparar.cantSal
                    && this.getForma().equals(sodaComparar.getForma());
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantidad Sal: " + this.cantSal;
    }

}
