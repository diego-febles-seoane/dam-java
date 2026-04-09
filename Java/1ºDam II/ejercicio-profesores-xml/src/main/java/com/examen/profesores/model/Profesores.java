package com.examen.profesores.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "profesores")
public class Profesores {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "profesor")
    private List<Profesor> profesores = new ArrayList<>();

    public Profesores() {
    }

    public Profesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
