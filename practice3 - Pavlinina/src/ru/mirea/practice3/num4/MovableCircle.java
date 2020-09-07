package ru.mirea.practice3.num4;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        System.out.println("moveUp(): " + this);
    }

    @Override
    public void moveDown() {
        System.out.println("moveDown(): " + this);
    }

    @Override
    public void moveLeft() {
        System.out.println("moveLeft(): " + this);
    }

    @Override
    public void moveRight() {
        System.out.println("moveRight(): " + this);
    }

    @Override
    public String toString() {
        return "MovableCircle:" +
                "\nradius = " + radius +
                "\ncenter = " + center +
                '}';
    }
}
