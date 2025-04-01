package es.ies.puerto.cuarenta.siete;
import java.util.Objects;

public class CarritoDeCompras {
    private String nombre;

    public CarritoDeCompras() {
    }

    public CarritoDeCompras(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CarritoDeCompras nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CarritoDeCompras)) {
            return false;
        }
        CarritoDeCompras carritoDeCompras = (CarritoDeCompras) o;
        return Objects.equals(nombre, carritoDeCompras.nombre);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            "}";
    }
    
}
