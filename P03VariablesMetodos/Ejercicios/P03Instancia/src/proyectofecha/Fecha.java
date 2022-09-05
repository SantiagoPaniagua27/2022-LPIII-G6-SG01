/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofecha;
import java.util.*;

public class Fecha {
    private int dia, mes, anio;
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }
    public Fecha(){
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes()
    {
        return this.mes;
    }
    public int getAnio()
    {
        return this.anio;
    }
    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar dia (1-31): ");
        int dia = sc.nextInt();
        this.dia = dia;
        System.out.print("Ingresar Mes (1-12): ");
        int mes = sc.nextInt();
        this.mes = mes;
        System.out.print("Ingresar anio (1900-2050): ");
        int anio = sc.nextInt();
        this.anio = anio;
        this.valida();
    }
    public boolean biciesto()
    {
        if(this.anio % 4 == 0 && this.anio % 100 != 0 || this.anio % 400 == 0)
            return true;
        else
            return false;
    }

    public int diasMes(int mes) {
        switch (mes) {
            case 1:
                return 31;
            case 2:
                if (this.biciesto() == true)
                    return 29;
                else
                    return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return 0;
    }
    private void valida()
    {
        if(this.dia<1 || this.dia>31)
            this.dia = 1;
        if(this.mes<1 || this.mes>12)
            this.mes = 1;
        if(this.anio<1900 || this.anio>2050)
            this.anio = 1900;
    }
    public void corta()
    {
        System.out.println( this.dia + "-" + this.mes + "-" + this.anio);
    }
    public int diasTranscurridos() {
        Fecha count = new Fecha();
        int countDias = 0;
        while (count.dia != this.dia || count.mes != count.mes || count.anio != this.anio) {
            count.fechaTras(1);
            countDias = countDias + 1;
        }
        return countDias;
    }

    public int diaSemana()
    {
        int dias = diasTranscurridos();//obtenemos los dias transcurridos desde 1900
        int diaSemana;
        if(dias==0)
            return 0;
        else
            diaSemana = dias % 7;//obtenemos los dias sobrantes de todas las semanas pasadas
        return diaSemana;//retornamos el dia de la semana, 0 es domingo, 1 es lunes, etc
    }
    public void larga()
    {
        String diaSemana = "";
        String mes = "";
        switch(diaSemana())
        {
            case 0:
                diaSemana = "Domingo";
                break;
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            default:
                break;
        }
        switch(this.mes)
        {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes= "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                break;
        }
        System.out.println(diaSemana + " " + this.dia + " de " + mes + " de " + this.anio);
    }
    public void fechaTras(long d)
    {
        this.dia=1;
        this.mes=1;
        this.anio=1900;
        for (int i = 0; i < d; i++) {
            this.siguiente();
        }
    }
    public int diasEntre(Fecha f) {
        return (this.diasTranscurridos() - f.diasTranscurridos());
    }
    public void siguiente()
    {
        if(this.dia == diasMes(this.mes))
        {
            this.dia = 1;
            if(this.mes == 12)
            {
                this.mes = 1;
                this.anio = this.anio+1;
            }
            else
                this.mes = this.mes+1;
        }
        else
            this.dia = this.dia+1;
    }
    public void anterior()
    {
        if(this.dia == 1)
        {
            if(this.mes == 1)
            {
                this.mes = 12;
                this.anio = this.anio - 1;
            }
            else
                this.mes = this.anio - 1;
            this.dia = diasMes(this.mes);
        }
        else
            this.dia = this.anio - 1;
    }
    public void fechaFutura(long di)
    {
        for(int i=0; i<di; i = i +1)
        {
            siguiente();
        }
    }
    public Fecha copia() {
        return this;
    }
    static public boolean igualQue(Fecha fec1, Fecha fec2)
    {
        if(fec1.getDia() == fec2.getDia() && fec1.getMes() == fec2.getMes() && fec1.getAnio() == fec2.getAnio())
            return true;
        else
            return false;
    }
    public static boolean menorQue(Fecha fec1, Fecha fec2) {
        if (fec1.dia <= fec2.anio)
            if (fec1.mes <= fec2.mes)
                if (fec1.dia <= fec2.dia)
                    return true;
        return false;
    }

    static public boolean mayorQue(Fecha fec1, Fecha fec2)
    {
        if(fec1.getAnio() > fec2.getAnio())
            return true;
        else if(fec1.getAnio() == fec2.getAnio())
        {
            if(fec1.getMes() > fec2.getMes())
                return true;
            else if(fec1.getMes() == fec2.getMes())
            {
                if(fec1.getDia() > fec2.getDia())
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
        else
            return false;
    }
}
