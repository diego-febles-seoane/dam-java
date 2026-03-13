package com.docencia.repository.file;

import java.io.File;

public class FileXml {
    private final String path;
    private final File file;

    public FileXml(String path) {
        this.path = path;
        this.file = new File(path);
    }

}
