package com.docencia.composicion.ejercicio20;
import java.util.Objects;

public class Cita extends Mascota{
    private String fecha;
    private String motivo;
    private Mascota mascota;


    public Cita() {
    }

    public Cita(String fecha, String motivo, Mascota mascota) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Mascota getMascota() {
        return this.mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cita)) {
            return false;
        }
        Cita cita = (Cita) o;
        return Objects.equals(fecha, cita.fecha) && Objects.equals(motivo, cita.motivo) && Objects.equals(mascota, cita.mascota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, motivo, mascota);
    }
    

    @Override
    public String toString() {
        return "{" +
            " fecha='" + getFecha() + "'" +
            ", motivo='" + getMotivo() + "'" +
            ", mascota='" + getMascota() + "'" +
            "}";
    }

    
}
