package ru.mirea.lab3.num3;

public abstract class Furniture {
    private double price;
    private int amount;

    public Furniture() {}

    public Furniture(double price, int amount) {
        this.price = price;
        this.amount = amount;
    }

    public abstract String info();

    public void send() {
        if (amount > 0) {
            amount--;
        }
        else
            System.out.println("No furniture left to send.");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Furniture:" +
                "\nprice: " + price +
                "\nnumber: " + amount;
    }
}
