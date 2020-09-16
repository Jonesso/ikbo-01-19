package ru.mirea.lab5;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle() {
        super();
    }

    public Rectangle(Color shapeColor) {
        super(shapeColor);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        graphics.setPaint(getColor());
        graphics.fillRect(getCoordX(), getCoordY(), getWidth(), getHeight());
    }
}
