
import Actividad1.Persona;

public class App {

	public static void main(String[] args) {
		OrderedPair <Integer,Integer> par1 =new OrderedPair<Integer,Integer> (8,4);
		OrderedPair <Integer,Integer> par2 =new OrderedPair<Integer,Integer> (2,3);
		OrderedPair <Integer,String> par3 =new OrderedPair<Integer,String> (6,"Tanto");
		OrderedPair <Integer,String> par4 =new OrderedPair<Integer,String> (8,"canta");
		OrderedPair <String,Persona> par5 =new OrderedPair<String,Persona>("adios", new Persona("945871263", "Pedro","Av.Ejercito"));
		OrderedPair <String,Persona> par6 =new OrderedPair<String,Persona>("Persona2",
				new Persona("958742631", " Julio","Av.Arce"));
		
	
		System.out.println(par1);
		System.out.println(par2);
		System.out.println();
		
		System.out.println(par3);
		System.out.println(par4);
		System.out.println();
		
		System.out.println(par5);
		System.out.println(par6);
	}

}
