import java.util.ArrayList;
public class Dictionary <K, V> {
    private final ArrayList<Contacts> dictionary;
    public Dictionary(){
        this.dictionary = new ArrayList<>();
    }
    public void add(K key, V value){
        Contacts<K, V> objeto = new Contacts<K,V>(key,value);
        dictionary.add(objeto);
    }
    public boolean delete(K key){
        for(int i=0; i<dictionary.size() ; i++){
            if(key.equals(dictionary.get(i).getDNI())){
                dictionary.remove(dictionary.get(i));
                return true;
            }
        }
        return false;
    }
    public Object getValue(K key) throws ObjectNoExist{
        try {
            for(int i=0; i<dictionary.size() ; i++){
                if(key.equals(dictionary.get(i).getDNI()))
                    return dictionary.get(i).getValor();
            }
        } catch (Exception e) {
            throw new ObjectNoExist();
        }
        return null;
    }
    @Override
    public String toString() {
        return "  Imprimiendo diccionario\n"
                + "  " + dictionary + "\n"
                + "  ";
    }
}



