package e2s7;
import java.util.*;

public class E2S7 {

    public static void main(String[] args) throws Exception {
        try {
            System.out.println(metodo("w"));
        } catch (Exception e) {
            System.out.println("Excepcion en el metodo()");
            e.printStackTrace();
        }
    }

    private static int metodo(String num) {
        int valor = 0;
        try {
            valor++;
            valor += Integer.parseInt(num);
            valor++;
            System.out.println("Valor al final del try: " + valor);
        } catch (NumberFormatException e) {
            valor += Integer.parseInt("42");
            System.out.println("Valor al final de catch: " + valor);
        } finally {
            valor++;
            System.out.println("Valor al final de finally: " + valor);
        }
        valor++;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}
