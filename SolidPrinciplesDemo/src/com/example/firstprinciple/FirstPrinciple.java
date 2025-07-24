package com.example.firstprinciple;

public class FirstPrinciple {
    public static void main(String[] args) {
        Student student = new Student("Ravi", 85);

        StudentPrinter printer = new StudentPrinter();
        printer.print(student);

        StudentDataSaver saver = new StudentDataSaver();
        saver.save(student);
    }
}
