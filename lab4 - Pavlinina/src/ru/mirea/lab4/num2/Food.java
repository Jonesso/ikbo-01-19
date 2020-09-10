package ru.mirea.lab4.num2;

public class Food implements Priceable {
    private double price;
    private String type;

    public Food() {}

    public Food(double price, String type) {
        this.price = price;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Food:" +
                "\ntype: " + type +
                "\nprice: " + price + " RUB";
    }
}
