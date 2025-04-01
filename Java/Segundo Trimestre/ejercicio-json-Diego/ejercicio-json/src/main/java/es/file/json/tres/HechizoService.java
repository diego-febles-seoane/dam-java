package es.file.json.tres;


import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import es.file.json.dos.Tributo;


public class HechizoService   {
    ObjectMapper objectMapper;
    String path = "src/main/resources/hechizos.json";
    File file;
    List<Hechizo> hechizos;

    public HechizoService() {
        objectMapper = new ObjectMapper();
        file = new File(path);
        hechizos = loadAll();
    }

    public Hechizo findById(int id) {
        Hechizo hechizo = new Hechizo(id);
        int posicion = hechizos.indexOf(hechizo);
        if( posicion < 0){
            return null;
        }
        return hechizos.get(posicion);
    }

    public List<Hechizo> findByDateRange(String startDate, String endDate) {
        if (startDate.isEmpty() || endDate.isEmpty() || startDate == null || endDate == null){
            return null;
        }
        List<Hechizo> lista = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate start = LocalDate.parse(startDate, formatter);
            LocalDate end = LocalDate.parse(endDate, formatter);
            for (Hechizo hechizo : hechizos) {
                LocalDate fechaIngreso = LocalDate.parse(hechizo.getFechaCreacion(), formatter);
                if(!fechaIngreso.isBefore(start) && !fechaIngreso.isAfter(end)) {
                    lista.add(hechizo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public List<Hechizo> getList() {
        return new ArrayList<>(hechizos);
    }
    
    public List<Hechizo> loadAll() {
        try {
            hechizos = objectMapper.readValue(file, new TypeReference<List<Hechizo>>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hechizos;
    }
    
    
    
    public boolean add(Hechizo obj) {
        if (obj == null){
            return false;
        }
        int posicion = hechizos.indexOf(obj);
        if (posicion >= 0){
            return false;
        }
        boolean insertar = hechizos.add(obj);
        if (insertar){
            saveFile(file, hechizos);
        }
        return insertar;
    }

    public void saveFile(File file, List<Hechizo> hechizos) {
        try {
            objectMapper.writeValue(file, hechizos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean delete(Hechizo obj) {
        if (obj == null){
            return false;
        }
        boolean borrar = hechizos.remove(obj);
        if ( borrar){
            saveFile(file, hechizos);
        }
        return borrar;
    }
    
    
}
