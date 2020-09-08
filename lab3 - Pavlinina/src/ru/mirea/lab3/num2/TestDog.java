package ru.mirea.lab3.num2;

public class TestDog {
    public static void main(String[] args) {
        Dog hound = new Hound("Killer", 2);
        hound.bark();
        hound.grow();
        System.out.println(hound);
        System.out.println();

        Dog corgi = new Corgi("Bread", 3);
        corgi.bark();
        corgi.grow();
        System.out.println(corgi);
    }
}
