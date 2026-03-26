package com.docente.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.docente.modelo.Alumno;
import static com.docente.utils.Utilidades.DELIMITER;

public abstract class FicheroAbstract {

    File file;
    String path;

    public FicheroAbstract(String path) {
        this.path = path;
        file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("No se ha podido crear el fichero:" + path);
                e.printStackTrace();
            }
        }
    }

    public boolean cleanFile() {
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.err.printf("No se ha podido crear el fichero :%s", path);
            e.printStackTrace();
        }
        return true;
    }

    public List<Alumno> read() {
        List<Alumno> alumnos= new ArrayList<>();
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                alumnos.add(new Alumno(values[0],values[1], Integer.parseInt(values[2]), values[3]));
            }
        }
        } catch (Exception e) {
            System.err.printf("No se ha podido leer el fichero :%s", path);
        }
        return alumnos;
    }
    // datos = 00000000H| pepe| 18| DAM
    // Alumno alumno, alumno.toCSV  
    public void write(Alumno alumno) {
       try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(alumno.toCsv());
            bw.newLine();
        } catch (IOException e) {
            throw new IllegalStateException("Error al guardar el fichero CSV.", e);
        }
    }

    /**
     * Funcion que actualiza toda la lista dentro del fichero
     * @param alumnos lista de alumnos
     */
    public void updateFichero(List<Alumno> alumnos) {
        cleanFile();
        for (Alumno alumno : alumnos) {
            write(alumno);
        }
    }

}
