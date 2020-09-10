package ru.mirea.lab4.num1;

public class Planet implements Nameable {
    private String name;
    private int age;

    public Planet(){}

    public Planet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Planet " + name +
                ":\nage: " + age;
    }
}
