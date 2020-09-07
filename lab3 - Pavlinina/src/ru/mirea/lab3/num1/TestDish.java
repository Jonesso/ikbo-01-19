package ru.mirea.lab3.num1;

public class TestDish {
    public static void main(String[] args) {
        Dish plate = new Plate("porcelain");
        System.out.println(plate);
        System.out.println();
        plate.wash();
        System.out.println(plate);
        System.out.println();
        plate.setClean(false);
        plate.setType("Plate");
        System.out.println(plate);
        System.out.println();

        Dish glass = new Glass(0.3, 0.05, "glass");
        System.out.println(glass);
        System.out.println();
        glass.wash();
        System.out.println(glass);
        System.out.println();
        glass.setClean(false);
        glass.setType("Wine glass");
        System.out.println(glass);
    }
}
