package es.ies.puerto.treinta.tre;
import java.util.Objects;

public class Componentes {
    private String nombre;

    public Componentes() {
    }

    public Componentes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Componentes nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Componentes)) {
            return false;
        }
        Componentes componentes = (Componentes) o;
        return Objects.equals(nombre, componentes.nombre);
    }


    @Override
    public String toString() {
        return "{" +
            " Nombre del componente:'" + nombre + "'" +
            "}";
    }
    
}
