
public class Goodies implements Comparable {

    private int id;
    private String descripition;
    private float price;

    public Goodies(int id, String descripition, float price) {
        this.id = id;
        this.descripition = descripition;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripition() {
        return this.descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Goodies) {
            Goodies goodiesComparar = (Goodies) obj;
            return this.id == goodiesComparar.getId();
        }
        return false;
    }

    @Override
    public int compareTo(Object obj) {
        Goodies goodiesComp = (Goodies) obj;
        if (this.price == goodiesComp.getPrice()) {
            return 0;
        } else {
            if (this.price > goodiesComp.getPrice()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return  "\n" + "ID:" + this.id + "\nProducto: " + this.descripition
                + "\nPrecio: " + this.price;
    }

}