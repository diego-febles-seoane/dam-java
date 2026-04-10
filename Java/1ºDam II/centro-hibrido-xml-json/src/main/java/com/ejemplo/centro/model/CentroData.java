package com.ejemplo.centro.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "centro")
public class CentroData {

    @JacksonXmlElementWrapper(localName = "profesores")
    @JacksonXmlProperty(localName = "profesor")
    private List<Profesor> profesores = new ArrayList<>();

    @JacksonXmlElementWrapper(localName = "modulos")
    @JacksonXmlProperty(localName = "modulo")
    private List<Modulo> modulos = new ArrayList<>();

    public CentroData() {
    }

    public CentroData(List<Profesor> profesores, List<Modulo> modulos) {
        this.profesores = profesores;
        this.modulos = modulos;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }
}
