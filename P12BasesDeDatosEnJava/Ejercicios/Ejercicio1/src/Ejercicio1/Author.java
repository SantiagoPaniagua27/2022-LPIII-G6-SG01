//Clase Autor
package Ejercicio1;
public class Author {
    private int authorid;
    private String firstname;
    private String lastname;
    public Author(int authorid, String firstname, String lastname) {
        this.authorid = authorid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Author() {
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Author{" + "authorid=" + authorid + ", firstname=" + firstname + ", lastname=" + lastname + '}';
    }
}

