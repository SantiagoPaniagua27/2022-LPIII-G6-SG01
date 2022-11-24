
public class Chocolates extends Goodies {

    private String sabor;

    public Chocolates(int id, String descripition, float price, String sabor) {
        super(id, descripition, price);
        this.sabor = sabor;
    }

    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Chocolates) {
            Chocolates ChocolatesComparar = (Chocolates) obj;
            return this.sabor.equals(ChocolatesComparar.sabor);
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSabor: " + this.sabor;
    }

}

