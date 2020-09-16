package ru.mirea.lab5;

import java.awt.*;

public class Triangle extends Shape {

    public Triangle() {
        super();
    }

    public Triangle(Color shapeColor) {
        super(shapeColor);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        graphics.setPaint(getColor());
        Polygon triangle = new Polygon();
        triangle.addPoint(getCoordX() + (getWidth() / 2), getCoordY());
        triangle.addPoint(getCoordX(), getCoordY() + getHeight());
        triangle.addPoint(getCoordX() + getWidth(), getCoordY() + getHeight());
        graphics.fill(triangle);
    }
}
