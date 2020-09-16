package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Task1 extends JFrame {
    final int MIN_COORD = 50;
    final int MIN_SIZE = 50;
    final int MAX_COORD = 500;
    final int MAX_SIZE = 200;

    public Task1() {
        setLayout(null);
        setTitle("Random shapes");
        setMinimumSize(new Dimension(700, 700));
        setSize(1000, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Random r = new Random();

        Shape shape;
        for (int i = 0; i < 20; i++) {
            shape = randomShape();
            shape.setBounds(
                    r.nextInt(MAX_COORD - MIN_COORD + 1) + MIN_COORD,
                    r.nextInt(MAX_COORD - MIN_COORD + 1) + MIN_COORD,
                    r.nextInt(MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE,
                    r.nextInt(MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE);
            add(shape);
        }

        pack();
        setVisible(true);
    }

    private Shape randomShape() {
        if (Math.random() > 0.66) {
            return new Rectangle();
        } else if (Math.random() > 0.33) {
            return new Circle();
        } else {
            return new Triangle();
        }
    }

    public static void main(String[] args) {
        new Task1();
    }
}
