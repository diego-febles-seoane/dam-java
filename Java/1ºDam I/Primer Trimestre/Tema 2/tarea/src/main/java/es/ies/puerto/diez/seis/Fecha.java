package es.ies.puerto.diez.seis;
import java.util.Objects;
/**
 * Crea una clase Fecha con atributos dia, mes y anio.
 * Implementa métodos para validar si la fecha es correcta y para comparar dos fechas con equals().
 * @author emsantamaria
 * @version 1.0.0
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    /**
     * Constructor por defecto
     */
    public Fecha() {
    }
    /**
     * Constructor con parámetros
     * @param anio
     * @param mes
     * @param dia
     */
    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }


    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Fecha dia(int dia) {
        setDia(dia);
        return this;
    }

    public Fecha mes(int mes) {
        setMes(mes);
        return this;
    }

    public Fecha anio(int anio) {
        setAnio(anio);
        return this;
    }
    /**
     * Comprobar fecha
     * @param comprobar
     */
    public boolean comprobar(){
        if(mes >= 1 && mes <= 12 && dia > 0 &&dia <=31&&anio > 0&& anio < 3000){ return true;}
        else{return false;}
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Fecha)) {
            return false;
        }
        Fecha fecha = (Fecha) o;
        return dia == fecha.dia && mes == fecha.mes && anio == fecha.anio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, anio);
    }

    @Override
    public String toString() {
        return "{" +
            " Dia:'" + getDia() + "'" +
            ", Mes:'" + getMes() + "'" +
            ", Año:'" + getAnio() + "'" +
            "}";
    }
    
}
