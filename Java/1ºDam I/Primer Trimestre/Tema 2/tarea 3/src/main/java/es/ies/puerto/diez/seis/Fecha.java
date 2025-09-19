package es.ies.puerto.diez.seis;
import java.util.Objects;

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
     * Constructor de la clase
     * @param dia
     * @param mes
     * @param anio
     */
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
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


    @Override
    public String toString() {
        return "{" +
            "dia= '" + getDia() + "'" +
            ", mes= '" + getMes() + "'" +
            ", anio= '" + getAnio() + "'" +
            "}";
    }

    /**
     * Funcion que compara dos elemento de tipo fecha
     */
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

}
