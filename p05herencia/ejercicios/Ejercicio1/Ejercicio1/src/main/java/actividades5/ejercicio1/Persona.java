package actividades5.ejercicio1;

public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private char tipoCliente;
    private int numCuenta;

    public Persona(int id, String nombre, String apellido, char tipoCliente, int numCuenta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(id);
        this.tipoCliente = tipoCliente;
        this.numCuenta = numCuenta;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public Cuenta getcuenta() {
        return cuenta;
    }
    
    public char getTipoCliente() {
        return tipoCliente;
    }
    
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Persona {" + "id= " + id + ", Nombre : " + nombre + ", Apellido: " + apellido + ", Cuenta: " + cuenta + "Tipo de cliente: "+ tipoCliente + "Su numero de cuenta es: " + tipoCliente + numCuenta + "}";    }

}
