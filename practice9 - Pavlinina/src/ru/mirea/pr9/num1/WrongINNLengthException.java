package ru.mirea.pr9.num1;

public class WrongINNLengthException extends Exception {

    public WrongINNLengthException() {
        super("There should be 12 digits in INN");
    }

}
