package ru.mirea.lab2.num2;

public class Leg {
    private int size;
    private double legLength;

    public Leg() {}

    public Leg(int size, double legLength) {
        this.size = size;
        this.legLength = legLength;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength(double legLength) {
        this.legLength = legLength;
    }

    public String toString() {
        return "Leg:\n" +
                "length = " + legLength +
                "\nshoe size = " + size;
    }
}
