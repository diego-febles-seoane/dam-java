package es.ies.puerto.cuarenta.seis;
import java.util.Objects;

public class Restaurante {
    private int numReservas;
    private Reserva[]reservas;

    public Restaurante() {
        this.numReservas = 0;
        this.reservas = new Reserva[10];
    }
    public boolean addReserva(Reserva reserva){
        if(numReservas<reservas.length){
            reservas[numReservas]=reserva;
            numReservas++;
            return true;
        }
        return false;
    }
    public boolean deleteReserva(Reserva reserva){
        for (int i = 0; i < reservas.length; i++) {
            if(reservas[i].equals(reserva)){
                reservas[i]=null;
                for (int j = i; j < reservas.length-1; j++) {
                    reservas[j]=reservas[j+1];
                    reservas[reservas.length-1]=null;
                }
                numReservas--;
                return true;
            }
        }
        return false;
    }

    public Restaurante(int numReservas, Reserva[] reservas) {
        this.numReservas = numReservas;
        this.reservas = reservas;
    }

    public int getNumReservas() {
        return this.numReservas;
    }

    public void setNumReservas(int numReservas) {
        this.numReservas = numReservas;
    }

    public Reserva[] getReservas() {
        return this.reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }

    public Restaurante numReservas(int numReservas) {
        setNumReservas(numReservas);
        return this;
    }

    public Restaurante reservas(Reserva[] reservas) {
        setReservas(reservas);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Restaurante)) {
            return false;
        }
        Restaurante restaurante = (Restaurante) o;
        return numReservas == restaurante.numReservas && Objects.equals(reservas, restaurante.reservas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numReservas, reservas);
    }

    @Override
    public String toString() {
        return "{" +
            " numReservas='" + getNumReservas() + "'" +
            ", reservas='" + getReservas() + "'" +
            "}";
    }
    
}
