package ru.mirea.lab2.num2;

public class Human {
    private String name;
    private int age;
    private String profession;
    private Head head;
    private Hand hand;
    private Leg leg;

    public Human(String name, int age, String profession, Head head, Hand hand, Leg leg) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Human:\n" +
                "name: " + name +
                "\nage: " + age +
                "\nprofession: " + profession +
                "\nhead = " + head +
                "\nhand = " + hand +
                "\nleg = " + leg;
    }
}
