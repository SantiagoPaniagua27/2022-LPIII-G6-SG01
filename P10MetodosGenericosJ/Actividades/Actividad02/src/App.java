
//Clase App
//Clase App
public class App {
    public static void main(String[] args) throws Exception{

        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        Character[] charArray = {'c', 'h', 'a', 'r', 'a', 'r', 'r', 'a', 'y'};
        System.out.printf("Los elementos del arreglo intArray de acuerdo al limite inferior y superior son:%n");

        imprimirArray(intArray, 5, 20);

        System.out.printf("%nLos elementos del arreglo doubleArray de acuerdo al limite inferior y superior sone:%n");
        imprimirArray(doubleArray, 4, 8);
        System.out.printf("%nLos elementos del arreglo charArray de acuerdo al limite inferior y superior son:%n");
        imprimirArray(charArray, 1,2);
    }
    public static <T> void imprimirArray(T[] arreglo, int limiteInferior, int limiteSuperior) throws LimiteInvalidoException{
        try{
            for(int i = limiteInferior; i <= limiteSuperior; i++)
                System.out.printf("%s ",arreglo[i]);
            System.out.println();
        }catch (Exception mensaje) {
            throw new LimiteInvalidoException("Fuera de rango");
        }
    }
}

