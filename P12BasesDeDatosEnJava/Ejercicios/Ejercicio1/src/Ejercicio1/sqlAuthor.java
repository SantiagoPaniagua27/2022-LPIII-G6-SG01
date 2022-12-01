//Clase sqlAuthor
package Ejercicio1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class sqlAuthor {
    Statement st;
    ResultSet rs;
    Interface in;
    private conectarSQL mysql = new conectarSQL();
    private Connection cn = mysql.conectar();
    
    public void setSt(Statement st) {
        this.st = st;
    }

    public Statement getSt() {
        return st;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setIn(Interface in) {
        this.in = in;
    }

    public Interface getIn() {
        return in;
    }

    public void setMysql(conectarSQL mysql) {
        this.mysql = mysql;
    }

    public conectarSQL getMysql() {
        return mysql;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Connection getCn() {
        return cn;
    }
}
