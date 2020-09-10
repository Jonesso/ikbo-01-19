package ru.mirea.lab4.num1;

public class Animal implements Nameable {
    private String name;
    private String species;

    public Animal(){}

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal:" +
                "\nname: " + name +
                "\nspecies: " + species;
    }
}
