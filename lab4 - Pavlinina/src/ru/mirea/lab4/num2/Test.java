package ru.mirea.lab4.num2;

public class Test {
    public static void main(String[] args) {
        Food food = new Food(160.95, "nuts");
        Clothes cloth = new Clothes(5499.99, "coat");

        System.out.println("Food price: " + food.getPrice() + " RUB");
        System.out.println("Clothes price: " + cloth.getPrice() + " RUB\n");

        System.out.println(food + "\n");
        System.out.println(cloth);
    }
}
