public class App {
    public static void main(String[] args) throws ObjectNoExist {
        Dictionary<String, Integer> Diccionario1 = new Dictionary<String, Integer>();
        Diccionario1.add("Pepito Juan", 1);
        Diccionario1.add("Pepito Poncio", 2);
        Diccionario1.add("Pablito Correa", 3);
        Diccionario1.add("Felipito Junior", 4);
        Diccionario1.add("Lobato Antonio", 5);
        System.out.println(Diccionario1);
        Diccionario1.delete("Pablito Correa");
        Diccionario1.delete("Felipito Junior");
        System.out.println(Diccionario1);
        System.out.println(Diccionario1.getValue("Pepito Poncio"));
        System.out.println(Diccionario1.getValue("Lobato Antonio"));
        System.out.println(Diccionario1.getValue("Pablito Correa"));
        System.out.println();
    }
}