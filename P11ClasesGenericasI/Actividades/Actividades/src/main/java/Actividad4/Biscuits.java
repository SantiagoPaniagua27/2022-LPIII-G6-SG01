package a4s11;

public class Biscuits extends Goodies {

    private String savor;
    private String gluten;

    public Biscuits(int id, String description, float price, String savor, String gluten) {
        super(id, description, price);
        this.savor = savor;
        this.gluten = gluten;
    }

    public String getsavor() {
        return savor;
    }

    public void setsavor(String savor) {
        this.savor = savor;
    }

    public String getGluten() {
        return gluten;
    }

    public void setGluten(String gluten) {
        this.gluten = gluten;
    }

    @Override
    public String toString() {
        return "Biscuits{"
                + "sabor='" + savor + '\''
                + ", gluten='" + gluten + '\''
                + '}';
    }
}
