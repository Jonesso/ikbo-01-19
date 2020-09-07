package ru.mirea.lab2.num2;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("John", 22, "Lawyer",
                new Head("green", "hazel", 20),
                new Hand(33.3, 10),
                new Leg(42, 65.8));
        System.out.println("1. " + human + "\n");
        human.setHead(new Head("blue", "blond", 21));
        human.setProfession("Programmer");
        System.out.println("2. " + human + "\n");
        human.getHead().setHairColor("ginger");
        System.out.println("3. " + human);
    }
}
