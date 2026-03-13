package com.docencia.repository.file;

public class FileCsv extends FileAbstract {
    private static String path = "alumnos.csv";
    public FileCsv() {
        super(path);
    }

    public FileCsv(String path) {
        super(path);
    }

    

}
