package e3s10;

public class E3S10 {

    public static void main(String[] args) {
        System.out.println("---Comparaciones de diferentes tipos de Datos---");
        System.out.printf("STRINGS: ");
        isEqualTo("PruebaGenerica", "PruebaGenerica"); ///parametros X & Y enviados

        System.out.printf("ENTEROS: ");
        isEqualTo("18", "18");

        System.out.printf("DOUBLES: ");
        isEqualTo("19.9", "14.2");

        System.out.printf("CHARS: ");
        isEqualTo("X", "F");
    }

    public static <T> void isEqualTo(T x, T y) { ///metodo generico que podemos utilizar para diferentes Tipos (Reutilizable)
        System.out.println(x.equals(y));
    }
}
