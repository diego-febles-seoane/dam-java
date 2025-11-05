package com.docencia.programacion;

public class Ejercicio35 {
    private double balance;
    private final String[] history;
    private int historyCount;
    private static final int MAX_HISTORY = 100;

    public Ejercicio35() {
        // TODO inicializar
        this.balance = 0.0;
        this.history = new String[0];
        this.historyCount = 0;
    }

    public void deposit(double amount) {
        // TODO implementar
    }

    public boolean withdraw(double amount) {
        // TODO implementar
        return false;
    }

    public double getBalance() {
        // TODO implementar
        return 0.0;
    }

    public String[] getHistory() {
        // TODO devolver copia defensiva
        return new String[0];
    }
}
