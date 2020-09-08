package ru.mirea.lab3.num3;

public class Sofa extends Furniture {
    private String color;

    public Sofa(double price, int amount, String color) {
        super(price, amount);
        this.color = color;
    }

    @Override
    public String info() {
        if (super.getAmount() == 1) {
            return "Last sofa left!";
        }
        else if(super.getAmount() > 1){
            return "Several sofas left";
        }
        else
            return "No sofas left";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sofa:" +
                "\ncolor: " + color +
                "\nprice: " + super.getPrice() +
                "\nleft: " + super.getAmount();
    }
}
