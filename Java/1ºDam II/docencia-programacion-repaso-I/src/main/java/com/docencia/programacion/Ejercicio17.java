package com.docencia.programacion;

public class Ejercicio17 {
    private final String classroomName;
    private String[] students;
    private int studentCount;

    public Ejercicio17(String classroomName, int maxCapacity) {
        this.classroomName = classroomName;
        this.students = new String[maxCapacity];
        this.studentCount = 0;
    }

    public boolean enrollStudent(String studentName) {
        studentCount++;
        return true;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getClassroomName() {
        return classroomName;
    }
}
