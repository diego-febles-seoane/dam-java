package com.ejemplo.app;

import com.ejemplo.repository.sqlite.ClaseSqliteRepository;

public class Main {
    public static void main(String[] args) {
        ClaseSqliteRepository repo = new ClaseSqliteRepository();
        if (repo.testConnection()) {
            System.out.println("Conexión a la base de datos exitosa.");
        } else {
            System.out.println("Error en la conexión a la base de datos.");
        }
    }
}
