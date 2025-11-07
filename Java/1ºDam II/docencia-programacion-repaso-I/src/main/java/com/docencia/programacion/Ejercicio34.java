package com.docencia.programacion;

public class Ejercicio34 {
    private Ejercicio33 tutor;
    private final Ejercicio15[] students;
    private int studentCount;

    public Ejercicio34(int maxCapacity) {
        this.tutor = null;
        if (maxCapacity < 0)
            maxCapacity = 0;
        this.students = new Ejercicio15[maxCapacity];
        this.studentCount = 0;
    }

    public void assignTutor(Ejercicio33 tutor) {
        this.tutor = tutor;
    }

    public boolean enrollStudent(Ejercicio15 s) {
        if (s == null)
            return false;
        if (studentCount >= students.length)
            return false;
        students[studentCount++] = s;
        return true;
    }

    public String getTutorName() {
        if (tutor == null)
            return "";
        return tutor.getName();
    }

    public int getStudentCount() {
        return studentCount;
    }
}
