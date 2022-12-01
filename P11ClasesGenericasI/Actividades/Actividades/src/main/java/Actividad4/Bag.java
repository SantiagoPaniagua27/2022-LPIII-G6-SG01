package a4s11;

import java.util.Arrays;

public class Bag<T> {
    private T[] lista;
    private int contador;

    public Bag(int n){
        this.lista = (T[]) new Object[n];
        this.contador = 0;
    }

    public void add(T obj) throws IsFull{
        try {
            lista[contador] = obj;
            contador++;
        }catch (Exception e){
            throw  new IsFull("La bolsa esta llena");
        }
    }

    public T[] getObjects() throws IsEmpty{
        if(contador == 0)
            throw new IsEmpty("La bolsa vacia");
        else
            return lista;
    }

    public T remove(T obj) throws ObjectNoExist{
        int con = 0;
        for(T i: this.lista){
            if(i != null && i.equals(obj)){
                T devolver = lista[con];
                for(int j = con; j < lista.length-1; j++){
                    lista[j]=lista[j+1];
                }
                lista[lista.length-1] = null;
                contador--;
                return devolver;
            }
            con++;
        }
        throw new ObjectNoExist("No existe en la lista");
    }

    public int getIndex(T obj){
        int devolver = -1;
        for(int i = 0; i < lista.length;i++){
            if(lista[i] == obj)
                devolver = i;
        }
        return devolver;
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "Productos=" + Arrays.toString(lista) +
                '}';
    }
}