package ru.mirea.lab3.num2;

public abstract class Dog {
    private String name;
    private String breed;
    protected int age;

    public Dog() {}

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    abstract void grow();

    public void bark() {
        System.out.println(name + " is barking...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog " + name +
                ":\nbreed: " + breed +
                "\nage: " + age;
    }
}
