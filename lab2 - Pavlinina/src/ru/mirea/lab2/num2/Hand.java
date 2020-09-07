package ru.mirea.lab2.num2;

public class Hand {
    private double length;
    private int amountOfFingers;

    public Hand() {}

    public Hand(double length, int amountOfFingers) {
        this.length = length;
        this.amountOfFingers = amountOfFingers;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getAmountOfFingers() {
        return amountOfFingers;
    }

    public void setAmountOfFingers(int amountOfFingers) {
        this.amountOfFingers = amountOfFingers;
    }

    public String toString() {
        return "Hand:\n" +
                "length = " + length +
                "\namount of fingers = " + amountOfFingers;
    }
}
