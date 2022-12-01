

import java.util.Arrays;

public class App {

    public static void main(String[] args) throws IsFull, IsEmpty, ObjectNoExist, ExistsList {
        try {
            CandyBags bolsagolosinas = new CandyBags(5, "Alicorp");
            Goodies golosinas1 = new Goodies(10, "Oreo", 1.50f);
            Chocolates chocolates1 = new Chocolates(11, "Sublime", 1.50f, "menta");
            Biscuits galletas1 = new Biscuits(12, 1.20f, "barra", "rectangulo");
            Soda soda1 = new Soda(13, 1.50f, "redonda", 0.9);
            Sweet dulce1 = new Sweet(14, 1.80f, "cuadrada", 1.2);
            
            bolsagolosinas.add(golosinas1);
            bolsagolosinas.add(chocolates1);
            bolsagolosinas.add(galletas1);
            bolsagolosinas.add(soda1);
            bolsagolosinas.add(dulce1);

            System.out.println("------------------------Tienda------------------------");
            System.out.println("------------Lista de Productos------------");
            System.out.println("Productos de la lista n°1: ");
            System.out.println(bolsagolosinas);
            System.out.println("------------------------------------------------------");
            System.out.println("El producto más barato de la lista es:");
            System.out.println(bolsagolosinas.cheapest());
            
            System.out.println("------------------------------------------------------");
            System.out.println("El producto más caro de la lista es:");
            
            System.out.println(bolsagolosinas.mostExpensive(2));
            System.out.println("------------------------------------------------------");
            

        } catch (IsFull | ExistsList exc) {
            System.out.println(exc.getMessage());
        }

    }

}

