package ru.mirea.lab1;

public class Ball {
    private String color;
    private String sport;
    private int radius;

    public Ball() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Ball(String color, String sport, int radius) {
        this.color = color;
        this.sport = sport;
        this.radius = radius;
    }

    public double getVolume() {
        return Math.round(Math.pow(this.radius, 3) * Math.PI * 4 / 3);
    }

    public String toString() {
        return "Ball:\nColor: " + color + "\nRadius: " + radius + "\nVolume: " + getVolume() + "\nUsed in: " + sport;
    }
}
