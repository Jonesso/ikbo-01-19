package ru.mirea.pr9.num2.exceptions;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String student) {
        super(student + " was not found.");
    }
}
