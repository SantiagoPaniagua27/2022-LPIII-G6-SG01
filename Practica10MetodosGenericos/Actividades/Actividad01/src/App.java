
//Clase App
//Clase App
public class App {
    public static void main(String[] args) {
        //Actividad 1.a añade el código necesario para verificar si funciona con arreglos de
        //tipo Float y de tipo Boolean
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5};
        Character[] charArray = {'A', 'R', 'R', 'A', 'Y'};
        Float[] floatArray = {0.11f, 2.22f, 33.3f, 4.44f, 5.55f};
        Boolean[] booleanArray = {true, false, true, false, true, false};

        System.out.printf("El arreglo integerArray contiene los siguientes elementos:%n");
        imprimirArray(intArray);
        System.out.printf("%nEl arreglo doubleArray contiene los siguientes elementos:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nEl arreglo charArray contiene los siguientes elementos:%n");
        imprimirArray(charArray);
        System.out.printf("%nEl arreglo floatArray contiene los siguientes elementos:%n");
        imprimirArray(floatArray);
        System.out.printf("%nEl arreglo booleanArray contiene los siguientes elementos:%n");
        imprimirArray(booleanArray);
        //Actividad 1.b crea un nuevo método llamado minimo que reciba 4 argumentos de tipos Integer, 
        //Double y String y nos devuelva cuál es el elemento menor.
        System.out.printf("\nEl minimo de los siguientes enteros: %d, %d, %d y %d es %d%n%n", 3,5,1,7,
        minimo(3,5,1,7));

        System.out.printf("El minimo de los siguientes numeros: {%.1f, %.1f, %.1f y %.1f es %.1f%n%n", 3.3, 2.2, 1.1, 4.4, 
        minimo(3.3, 2.2, 1.1, 4.4));

        System.out.printf("El minimo de las siguientes palabras: %s, %s, %s y %s es %s%n%n","mandarina", "platano", "durazno", "manzana", 
        minimo("mandarina", "platano", "durazno", "manzana"));
        
        System.out.printf("El minimo de los siguientes enteros: %d, %d, %d y %d es %d%n%n", 18, 16, 14, 12,
        minimo(18, 16, 14, 12));
    }
    //Actividad 1.a añade el código necesario para verificar si funciona con arreglos de 
    //tipo Float y de tipo Boolean
    public static <T> void imprimirArray(T[] inputArray) {
        for(T elemento : inputArray)
            System.out.printf("%s ",elemento);
        System.out.println();
    }
    //Actividad 1.b crea un nuevo método llamado minimo que reciba 4 argumentos de tipos Integer, 
    //Double y String y nos devuelva cuál es el elemento menor.
    public static <T extends Comparable<T>> T minimo (T a, T b, T c, T d) {
        T min = a;
        if(b.compareTo(a) < 0)
            min = b;
        if(c.compareTo(b) < 0)
            min = c;
        if(d.compareTo(c) < 0)
            min = d;
        return min;
    }
}

