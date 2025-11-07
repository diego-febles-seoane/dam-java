package com.docencia.programacion;

public class Ejercicio37 {
    private final Ejercicio18[] rooms;

    public Ejercicio37(Ejercicio18[] rooms) {
        // copia defensiva (shallow copy de objetos Ejercicio18)
        if (rooms == null)
            this.rooms = new Ejercicio18[0];
        else
            this.rooms = rooms.clone();
    }

    public int findFirstFreeRoomNumber() {
        for (Ejercicio18 r : rooms) {
            if (r == null)
                continue;
            if (!r.isOccupied())
                return r.getRoomNumber();
        }
        return -1;
    }

    public boolean checkIn(int roomNumber) {
        for (Ejercicio18 r : rooms) {
            if (r == null)
                continue;
            if (r.getRoomNumber() == roomNumber) {
                if (r.isOccupied())
                    return false;
                r.occupy();
                return true;
            }
        }
        return false;
    }

    public boolean checkOut(int roomNumber) {
        for (Ejercicio18 r : rooms) {
            if (r == null)
                continue;
            if (r.getRoomNumber() == roomNumber) {
                if (!r.isOccupied())
                    return false;
                r.release();
                return true;
            }
        }
        return false;
    }
}
