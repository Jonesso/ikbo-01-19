package ru.mirea.lab3.num3;

public class TestFurniture {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop("Leroy Merlin");
        shop.addFurniture(new Table(
                1555.50,
                123,
                "Wood",
                130,
                3));
        shop.addFurniture(new Sofa(
                34785.90,
                13,
                "White"));
        System.out.println(shop);

        System.out.println(shop.getFurnitureList().get(1).info());
        for (int i = 1; i <= 6; i++) {
            shop.getFurnitureList().get(1).send();
            System.out.println(i + ") " + shop);
        }
        System.out.println(shop.getFurnitureList().get(1).info());
    }
}
