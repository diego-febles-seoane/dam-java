package com.docencia.programacion;

public class Ejercicio18 {
    private final int roomNumber;
    private boolean occupied;

    public Ejercicio18(int roomNumber) {
        this.roomNumber = roomNumber;
        this.occupied = false;
    }

    public void occupy() {
        this.occupied = true;
    }

    public void release() {
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
