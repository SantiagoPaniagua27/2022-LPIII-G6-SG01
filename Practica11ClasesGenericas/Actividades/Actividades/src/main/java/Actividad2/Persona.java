package actividad2;

public class Persona{
	private String nombre;
	private String telefono;
	private String direccion;
	
	public Persona(String telefono,String nombre,String direccion){
		this.nombre=nombre;
		this.telefono=telefono;
		this.direccion=direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean equals(Object o) {
		if(o instanceof Persona) {
			Persona p= (Persona) o;
			return this.nombre.equals(p.nombre);
		}
		return false;
	}

	@Override
	public String toString() {
		return  this.telefono +","+ this.nombre;
	}
	

}