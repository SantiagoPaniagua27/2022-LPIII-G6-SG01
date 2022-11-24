
public class CandyBags extends Bag<Goodies> {

    private String marca;

    public CandyBags(int n, String marca) {
        super(n);
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Goodies cheapest() {
        Goodies[] list = this.getList();
        Goodies menor = list[0];
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i].compareTo(menor) < 0) {
                menor = list[i];
            }
        }
        return menor;
    }

    public CandyBags mostExpensive(int n) {
        Goodies[] list = this.getList();
        burbujaDescendente(list);
        Goodies[] list2 = new Goodies[n];
        for (int i = 0; i < n; i++) {
            list2[i] = list[i];
        }
        CandyBags b1 = new CandyBags(n, this.marca);
        b1.setList(list2);
        b1.setCount(n);
        return b1;
    }

    public static void burbujaDescendente(Goodies array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                Goodies elemActual = array[j],
                        elemSiguiente = array[j + 1];
                if (elemActual.compareTo(elemSiguiente) < 0) {
                    array[j] = elemSiguiente;
                    array[j + 1] = elemActual;
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMarca: " + this.marca;
    }
}
