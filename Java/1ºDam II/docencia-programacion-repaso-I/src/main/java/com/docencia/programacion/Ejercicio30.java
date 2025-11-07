package com.docencia.programacion;

public class Ejercicio30 {
    private final Ejercicio29[] products;

    public Ejercicio30(Ejercicio29[] products) {
        if (products == null)
            this.products = new Ejercicio29[0];
        else {
            this.products = new Ejercicio29[products.length];
            for (int i = 0; i < products.length; i++)
                this.products[i] = products[i];
        }
    }

    public double getTotalStockValue() {
        double s = 0.0;
        for (Ejercicio29 p : products) {
            if (p != null)
                s += p.getStockValue();
        }
        return s;
    }

    public Ejercicio29 findByName(String name) {
        if (name == null)
            return null;
        for (Ejercicio29 p : products) {
            if (p != null && name.equals(p.getName()))
                return p;
        }
        return null;
    }
}
