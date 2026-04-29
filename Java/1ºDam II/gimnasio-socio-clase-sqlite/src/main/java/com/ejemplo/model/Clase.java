package com.ejemplo.model;

import java.util.Objects;

public class Clase {
    private final Integer id;
    private final String nombre;
    private final String tipo;
    private final String horario;
    private final Integer cupoMaximo;
    private final Integer plazasDisponibles;
    private final Integer activa;
    private final Integer idMonitor;

    public Clase(Integer id, String nombre, String tipo, String horario, Integer cupoMaximo,
            Integer plazasDisponibles, Integer activa, Integer idMonitor) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.horario = horario;
        this.cupoMaximo = cupoMaximo;
        this.plazasDisponibles = plazasDisponibles;
        this.activa = activa;
        this.idMonitor = idMonitor;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getHorario() {
        return horario;
    }

    public Integer getCupoMaximo() {
        return cupoMaximo;
    }

    public Integer getPlazasDisponibles() {
        return plazasDisponibles;
    }

    public Integer getActiva() {
        return activa;
    }

    public Integer getIdMonitor() {
        return idMonitor;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Clase)) {
            return false;
        }
        Clase clase = (Clase) o;
        return Objects.equals(id, clase.id) && Objects.equals(idMonitor, clase.idMonitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idMonitor);
    }


}
