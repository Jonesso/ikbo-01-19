package ru.mirea.lab4.num1;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("John", 23, "programmer");
        Planet planet = new Planet("Earth", 2000000);
        Animal animal = new Animal("Buddy", "Dog");

        System.out.println("Animal name: " + animal.getName());
        System.out.println("Planet name: " + planet.getName());
        System.out.println("Person name: " + person.getName() + "\n");

        System.out.println(person + "\n");
        System.out.println(planet + "\n");
        System.out.println(animal);
    }
}
