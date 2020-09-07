package ru.mirea.practice2.num2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(141.338, 176.12);
        System.out.println("1. " + ball1);
        ball1.move(-10.10, 0.06);
        System.out.println("After move: " + ball1);
        ball1.setXAndY(406.529, 71.008123);
        System.out.println("New coordinates: " + ball1);

        System.out.println();
        Ball ball2 = new Ball();
        System.out.println("2. " + ball2);
        ball2.setX(123.709);
        ball2.setY(13.914);
        System.out.println("After initialization: " + ball2);
        ball2.move(100, -17.9);
        System.out.println("After move: " + ball2);
    }
}
