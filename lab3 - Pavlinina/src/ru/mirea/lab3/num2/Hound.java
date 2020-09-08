package ru.mirea.lab3.num2;

public class Hound extends Dog {

    public Hound(String name, int age) {
        super(name, "Hound", age);
    }

    @Override
    public void grow() {
        this.age+=2;
        System.out.println(super.getName() + " has grown.");
    }
}
