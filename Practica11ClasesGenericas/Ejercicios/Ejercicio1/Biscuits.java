
package e1s11;

public class Biscuits extends Goodies {
    
	private String tipo;
	private String forma;
	
	public Biscuits(int id, float price, String tipo, String forma) {
		super(id,"Galleta", price);
		this.tipo = tipo;
		this.forma = forma;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getForma() {
		return this.forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Biscuits) {
			Biscuits BiscuitsComparar = (Biscuits) obj;
			return  this.tipo.equals(BiscuitsComparar.tipo)
					&& this.forma.equals(BiscuitsComparar.forma);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "\nTipo: " + this.tipo + "\nForma: " + this.forma ;
	}
}
