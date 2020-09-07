package ru.mirea.practice3.num2;

public class TestShape {
    public static void main(String[] args) {
        Square square = new Square(3, "black", true);
        System.out.println("---Square---");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println(square);
        square.setSide(13);
        System.out.println("With new side length: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println(square);
        square.setLength(5);
        System.out.println("Square -> Rectangle: " + square.getWidth() + " " + square.getLength());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println();

        Rectangle rectangle = new Rectangle(0.5, 10.7, "red", false);
        System.out.println("\n---Rectangle---");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle);
        rectangle.setColor("blue");
        rectangle.setWidth(13.9);
        System.out.println("With new width & color: " + rectangle.getWidth() + " & " + rectangle.getColor());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle);
        System.out.println();

        Circle circle = new Circle(15);
        System.out.println("\n---Circle---");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println(circle);
        circle.setColor("green");
        circle.setFilled(true);
        circle.setRadius(9);
        System.out.println("With new parameters");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println(circle);
    }
}
