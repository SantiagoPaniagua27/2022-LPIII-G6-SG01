package ejercicio2perfilmedico;
public class ClasePerfilMedico {
    private String nombre;
    private String apellido;
    private char sexo;
    //Atributos para la fecha de nacimiento
    private int dia;
    private int mes;
    private int anio;

    private double altura;
    private double peso;
    //un constructor que reciba estos atributos
    public ClasePerfilMedico(String nombre, String apellido, char sexo, int dia, int mes, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }
    //debe proveer los métodos establecer setters y getters para cada atributo
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Perfil Medico{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", altura=" + altura + ", peso=" + peso + '}';
    }
    //Metodo para devolver la edad del paciente
    public int edad(){
        return 2022 - anio;
    }
    //Metodo para devolver la frecuencia cardiaca máxima FMC
    public int fmc(){
        return(int)(208 - (0.7 * edad()));
    }
    //Metodo para devolver el índice de masa corporal IMC
    public double imc(){
        return peso/(altura * altura);
    }
}