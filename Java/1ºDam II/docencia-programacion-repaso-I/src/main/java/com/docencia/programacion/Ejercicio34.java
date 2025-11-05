package com.docencia.programacion;

public class Ejercicio34 {
    private Ejercicio33 tutor;
    private final Ejercicio15[] students;
    private int studentCount;

    public Ejercicio34(int maxCapacity) {
        // TODO inicializar
        this.tutor = null;
        this.students = new Ejercicio15[0];
        this.studentCount = 0;
    }

    public void assignTutor(Ejercicio33 tutor) {
        // TODO implementar
    }

    public boolean enrollStudent(Ejercicio15 s) {
        // TODO implementar
        return false;
    }

    public String getTutorName() {
        // TODO implementar
        return "";
    }

    public int getStudentCount() {
        // TODO implementar
        return -1;
    }
}
