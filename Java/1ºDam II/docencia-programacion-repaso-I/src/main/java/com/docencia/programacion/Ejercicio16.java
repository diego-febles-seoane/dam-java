package com.docencia.programacion;

public class Ejercicio16 {
    private double balance;

    public Ejercicio16() {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance+amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance){
            return false;
        }
        balance = balance - amount;
        return true;
    }

    public double getBalance() {
        if (balance <= 0){
            return 0.0;
        }
        return balance;
    }
}
