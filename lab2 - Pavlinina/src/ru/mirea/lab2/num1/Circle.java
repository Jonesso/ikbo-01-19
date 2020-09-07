package ru.mirea.lab2.num1;

public class Circle {
    private double radius;
    private double square;
    private double length;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
        this.square = Math.PI * Math.pow(radius, 2);
        this.length = 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        return square;
    }

    public double getLength() {
        return length;
    }

    public void setRadius(double radius) {
        this.square = Math.PI * Math.pow(radius, 2);
        this.length = 2 * Math.PI * radius;
        this.radius = radius;
    }

    public String toString() {
        return "Circle: \n" +
                "radius = " + radius +
                "\nsquare = " + square +
                "\nlength = " + length;
    }
}

