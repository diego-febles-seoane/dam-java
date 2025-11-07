package com.docencia.programacion;

public class Ejercicio32 {
    private final String title;
    private final String author;
    private boolean borrowed;

    public Ejercicio32(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public boolean borrow() {
        if (borrowed)
            return false;
        borrowed = true;
        return true;
    }

    public boolean returnBook() {
        if (!borrowed)
            return false;
        borrowed = false;
        return true;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
