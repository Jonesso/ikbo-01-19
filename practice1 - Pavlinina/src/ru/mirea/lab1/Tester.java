package ru.mirea.lab1;

public class Tester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Scooby", "black hound", 2);
        System.out.println(dog1);
        System.out.println();

        dog1.voice();
        dog1.setAge(3);
        System.out.println(dog1);
        System.out.println();

        Book book1 = new Book("Crime and punishment", "Dostoevsky", "novel", 1932);
        System.out.println(book1);
        System.out.println();

        Ball ball1 = new Ball();
        ball1.setSport("basketball");
        ball1.setRadius(3);
        ball1.setColor("orange");
        System.out.println(ball1);


    }
}
