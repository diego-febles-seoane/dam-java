package com.docencia.composicion.ejercicio20;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    final private List<Cita> citas;

    public Clinica(){
        citas = new ArrayList<>();
    }

    public Clinica(List<Cita> citas){
        this.citas = citas;
    }

    public List<Cita> obtenerCitasPorMascota(Mascota mascota){
        List<Cita> resultado = new ArrayList<>();
        
        for (Cita cita : citas) {
            if (cita.getMascota().equals(mascota)){
                resultado.add(cita);
            }
        }

        return resultado;
    }
    
    public List<Cita> obtenerCitasPorFecha(String fecha){
        List<Cita> resultado = new ArrayList<>();
        
        for (Cita cita : citas) {
            if (cita.getFecha().equals(fecha)){
                resultado.add(cita);
            }
        }

        return resultado;
    }
}
