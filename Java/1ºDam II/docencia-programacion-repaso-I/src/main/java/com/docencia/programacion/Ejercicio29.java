package com.docencia.programacion;

public class Ejercicio29 {
    private final String name;
    private final double price;
    private int stock;

    public Ejercicio29(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void addStock(int delta) {
        if (delta <= 0)
            return;
        this.stock += delta;
    }

    public boolean removeStock(int delta) {
        if (delta <= 0)
            return false;
        if (delta > this.stock)
            return false;
        this.stock -= delta;
        return true;
    }

    public double getStockValue() {
        return this.price * this.stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
