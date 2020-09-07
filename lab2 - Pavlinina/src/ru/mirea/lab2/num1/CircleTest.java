package ru.mirea.lab2.num1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println();
        circle.setRadius(15);
        System.out.println(circle);
        System.out.println();
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Square: " + circle.getSquare());
        System.out.println("Length: " + circle.getLength());
    }
}
