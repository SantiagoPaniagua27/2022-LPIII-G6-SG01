
//Clase conectarSQL
package Ejercicio1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

class conectarSQL {
    sqlAuthor sqlA;
    public String NombreBaseDatos = "sesion12";
    public String url = "jdbc:mysql://localhost:3307/" + NombreBaseDatos;
    public String user = "root";
    public String pass = "root";

    public Connection conectar() {
        Connection link = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            //url, usuario, contraseña para ingresar a la base de datos
            link = DriverManager.getConnection(this.url, this.user, this.pass); 
        } catch (ClassNotFoundException | SQLException e) { 
            JOptionPane.showConfirmDialog(null, e); 
        }
        return link;
    }
}
