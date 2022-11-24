package Actividad3;
import java.util.Arrays;
public class Bag <T>{
    private T [] list;
    private int count;
    
    public Bag(int n){
        this.list = (T[])new Object[n];
        this.count = 0;
    }
    public void add(T obj) throws IsFull{
        try{
            list[count] = obj;
            count++;
        }catch(Exception a){
            System.out.println("la Bolsa esta llena");
        }        
    }
    
    public T[] getObjects() throws IsEmpty {
        if(count != 0)
            return list;        
        else
            throw new IsEmpty("La bolsa vacia");
    }
    
    public T remove(T obj) throws ObjectNoExist{
        int con = 0;
        for(T i: this.list){
            if(i != null && i.equals(obj)){
                T devolver = list[con];
                for(int j = con; j < list.length-1; j++){
                    list[j]=list[j+1];
                }
                list[list.length-1] = null;
                count--;
                return devolver;
            }
            con++;
        }
        throw new ObjectNoExist("No existe en la lista");
    }

    public int getIndex(T obj){
        int devolver = -1;
        for(int i = 0; i < list.length;i++){
            if(list[i] == obj)
                devolver = i;
        }
        return devolver;
    }

    
    @Override
    public String toString(){
        return "Bag: " +
                " list = " + Arrays.toString(list);
    }
}
