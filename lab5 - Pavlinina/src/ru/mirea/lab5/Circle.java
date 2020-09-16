package ru.mirea.lab5;

import java.awt.*;

public class Circle extends Shape {

    public Circle() {
        super();
    }

    public Circle(Color shapeColor) {
        super(shapeColor);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        graphics.setPaint(getColor());
        graphics.fillOval(getCoordX(), getCoordY(), getWidth(), getHeight());
    }
}
