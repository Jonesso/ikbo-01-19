package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Shape extends JComponent {
    final private int coordX;
    final private int coordY;
    final private Color color;

    public Shape() {
        this.coordX = getX();
        this.coordY = getY();
        this.color = generateColor();
    }

    public Shape(Color color) {
        this.coordX = getX();
        this.coordY = getY();
        this.color = color;
    }

    private Color generateColor() {
        Random random = new Random();
        return new Color(
                random.nextFloat(),
                random.nextFloat(),
                random.nextFloat());
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public Color getColor() {
        return color;
    }
}

