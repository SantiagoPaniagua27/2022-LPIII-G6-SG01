import java.util.ArrayList;
public class Dictionary <K, V> {
    private final ArrayList<OrderedPair> dictionary;
    public Dictionary(){
        this.dictionary = new ArrayList<>();
    }
    public void add(K key, V value){
        OrderedPair<K, V> objeto = new OrderedPair<K,V>(key,value);
        dictionary.add(objeto);
    }
    public boolean delete(K key){
        for(int i=0; i<dictionary.size() ; i++){
            if(key.equals(dictionary.get(i).getKey())){
                dictionary.remove(dictionary.get(i));
                return true;
            }
        }
        return false;
    }
    public Object getValue(K key) throws ObjectNoExist{
        try {
            for(int i=0; i<dictionary.size() ; i++){
                if(key.equals(dictionary.get(i).getKey()))
                    return dictionary.get(i).getValue();
            }
        } catch (Exception e) {
            throw new ObjectNoExist();
        }
        return null;
    }
    @Override
    public String toString() {
        return "Imprimiendo diccionario \n"
                + "  " + dictionary + "\n"
                + "  ";
    }
}


