package com.docencia.repository.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.docencia.model.Usuario;

public abstract class FileAbstract {
    
    private final String path;
    private final File file;

    public FileAbstract(String path) {
        this.path = path;
        file = new File(path);
        if (!file.exists() || !file.isFile()) {
            System.err.println("La ruta " + path + ", no es una ruta valida o un fichero");
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //throw new IllegalArgumentException(path);
            //file.createNewFile();
        }
    }
    //0;Juan;email@gmail.com;123456
    //0;Juan;email2@gmail.com;123456
    public Set<Usuario> read() {
        Set<Usuario> usuariosLectura = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //line = 0;Juan;email@gmail.com;123456
                String[] datos = line.split(";");//[0][Juan][email@gmail][123456]
                Usuario usuarioLeido = new Usuario(Integer.parseInt(datos[0]), datos[1], datos[2], datos[3]);
                usuariosLectura.add(usuarioLeido);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return usuariosLectura;
    }

    public void write(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            writer.newLine();
            System.out.println("Registro agregado.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

}
