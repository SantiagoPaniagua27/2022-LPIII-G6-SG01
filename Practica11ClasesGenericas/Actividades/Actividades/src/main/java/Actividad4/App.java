package a4s11;

public class App {
    public static void main(String[] args) throws Exception {
        
	Bag<Goodies> bolsaGolocinas = new Bag<>(3);
	Soda cocacola = new Soda(111, "Bebida con 0% azucar", (float) 9.0, "original", "Si", "No", "No");
	Sweet oreo = new Sweet(112, "Galletas con relleno", (float) 1.5, "chocolate", "Si", "Si", "No");
	Chocolates sublime = new Chocolates(113, "Chocolate con maní", (float) 2.5, "dulce", 13);
       
	bolsaGolocinas.add(cocacola);
	bolsaGolocinas.add(oreo);
	bolsaGolocinas.add(sublime);
        
        /*Bag<Goodies> Carrito = new Bag<>(3);
	Soda pepsi = new Soda(111, "Bebida con 0% azucar", (float) 8.5, "original", "Si", "No", "No");
	Sweet chocman = new Sweet(112, "Bizcocho bañado en chocolate", (float) 2.5, "chocolate", "Si", "Si", "No");
	Chocolates extratino = new Chocolates(113, "Chocolate blanco", (float) 5.5, "dulce", 30);
        
        Carrito.add(pepsi);
	Carrito.add(chocman);
	Carrito.add(extratino);
        */
        
        System.out.println("----------------------------------Minimarket Panchito----------------------------------");
	System.out.println(bolsaGolocinas);
        
        ///System.out.println(Carrito);
	}   
}