package es.file.json.dos;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import es.file.json.dos.Tributo;

public class TributoService {
    ObjectMapper objectMapper;
    String path = "src/main/resources/tributos.json";
    File file;
    List<Tributo> tributos;


    public TributoService() {
        objectMapper = new ObjectMapper();
        file = new File(path);
        tributos = loadAll();
    }

    public Tributo findById(int id) {
        Tributo tributo = new Tributo(id);
        int posicion = tributos.indexOf(tributo);
        if( posicion < 0){
            return null;
        }
        return tributos.get(posicion);
    }

    public List<Tributo> findByDateRange(String startDate, String endDate) {
        if (startDate.isEmpty() || endDate.isEmpty() || startDate == null || endDate == null){
            return null;
        }
        List<Tributo> lista = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate start = LocalDate.parse(startDate, formatter);
            LocalDate end = LocalDate.parse(endDate, formatter);
            for (Tributo tributo : tributos) {
                LocalDate fechaIngreso = LocalDate.parse(tributo.getFechaSeleccion(), formatter);
                if(!fechaIngreso.isBefore(start) && !fechaIngreso.isAfter(end)) {
                    lista.add(tributo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public List<Tributo> getList() {
        return new ArrayList<>(tributos);
    }
    
    public List<Tributo> loadAll() {
        try {
            tributos = objectMapper.readValue(file, new TypeReference<List<Tributo>>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tributos;
    }
    
    
    
    public boolean add(Tributo obj) {
        if (obj == null){
            return false;
        }
        int posicion = tributos.indexOf(obj);
        if (posicion >= 0){
            return false;
        }
        boolean insertar = tributos.add(obj);
        if (insertar){
            saveFile(file, tributos);
        }
        return insertar;
    }

    public void saveFile(File file, List<Tributo> tributos) {
        try {
            objectMapper.writeValue(file, tributos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean delete(Tributo obj) {
        if (obj == null){
            return false;
        }
        boolean borrar = tributos.remove(obj);
        if ( borrar){
            saveFile(file, tributos);
        }
        return borrar;
    }
    
    
}
