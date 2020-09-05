package ru.mirea.lab1;

public class Dog {
    private String name;
    private String species;
    private int age;

    public Dog() {
    }

    public Dog(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    };

    public String getName() {
        return name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice(){
        System.out.println("Woof!");
    }
    public String toString(){
        return "Dog " + name + ":\nSpecies: "+species+"\nAge: " + age;
    }
}
