/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4s11;

public class Soda extends Biscuits {

    private String salt;
    private String integral;

    public Soda(int id, String description, float price, String flavor, String gluten, String salt, String integral) {
        super(id, description, price, flavor, gluten);
        this.salt = salt;
        this.integral = integral;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    @Override
    public String toString() {
        return "Soda{"
                + "sal='" + salt + '\''
                + '}';
    }
}
