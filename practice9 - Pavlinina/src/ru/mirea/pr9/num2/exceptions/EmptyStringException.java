package ru.mirea.pr9.num2.exceptions;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Student's personal info is missing");
    }

}
