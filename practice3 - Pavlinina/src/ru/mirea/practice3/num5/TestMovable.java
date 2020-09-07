package ru.mirea.practice3.num5;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 1, 5, 5, 3, 4);
        rectangle.moveUp();
        rectangle.moveDown();
        rectangle.moveDown();
        rectangle.moveRight();
        rectangle.moveLeft();
        rectangle.moveLeft();
        System.out.println(rectangle);
    }
}
