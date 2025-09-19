package es.ies.puerto.file.tres;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileArmasCsv {

    List<Arma> armas = new ArrayList<>();
    File file = new File("src/main/resources-backup/tres.csv");

    /**
     * Lee las armas del fichero
     * 
     * @return List<Arma>
     */
    public List<Arma> obtenerArmas() {
        return armas;
    }

    /**
     * Busca un arma en el archivo
     * 
     * @param arma buscada
     * @return Arma
     */
    public Arma obtenerArma(Arma arma) {
        return null;
    }

    
    public boolean actualizarFichero(String data) {
        return false;
    }

    
    public void addArma(Arma arma) {
        
    }

    
    public void deleteArma(Arma arma) {
        
    }

    
    public void updateArma(Arma arma) {
    }
}
