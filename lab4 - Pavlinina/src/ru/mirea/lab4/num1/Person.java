package ru.mirea.lab4.num1;

public class Person implements Nameable {
    private String name;
    private int age;
    private String profession;

    public Person() { }

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person " + name +
                ":\nage: " + age +
                "\nprofession: " + profession;
    }
}
