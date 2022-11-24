
public class Contacts<K,V> {
    private K DNI;
    private V valor;

    public Contacts(K DNI, V valor) {
        this.DNI = DNI;
        this.valor = valor;
    }

    public K getDNI() {
        return DNI;
    }

    public void setDNI(K DNI) {
        this.DNI = DNI;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "DNI=" + DNI +
                ", Valor=" + valor +
                '}';
    }
}