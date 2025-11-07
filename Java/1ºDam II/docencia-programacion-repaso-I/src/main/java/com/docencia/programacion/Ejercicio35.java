package com.docencia.programacion;

public class Ejercicio35 {
    private double balance;
    private final String[] history;
    private int historyCount;
    private static final int MAX_HISTORY = 100;

    public Ejercicio35() {
        this.balance = 0.0;
        this.history = new String[MAX_HISTORY];
        this.historyCount = 0;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            return;
        balance += amount;
        if (historyCount < MAX_HISTORY)
            history[historyCount++] = "deposit " + amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0)
            return false;
        if (amount <= balance) {
            balance -= amount;
            if (historyCount < MAX_HISTORY)
                history[historyCount++] = "withdraw " + amount + " ok";
            return true;
        } else {
            if (historyCount < MAX_HISTORY)
                history[historyCount++] = "withdraw " + amount + " denied";
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String[] getHistory() {
        String[] copy = new String[historyCount];
        for (int i = 0; i < historyCount; i++)
            copy[i] = history[i];
        return copy;
    }
}
