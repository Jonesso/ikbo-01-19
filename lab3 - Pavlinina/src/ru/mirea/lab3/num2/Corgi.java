package ru.mirea.lab3.num2;

public class Corgi extends Dog {
    public Corgi(String name, int age) {
        super(name, "Corgi", age);
    }

    @Override
    public void grow() {
        this.age++;
        System.out.println(super.getName() + " has grown.");
    }
}
