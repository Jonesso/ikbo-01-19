package ru.mirea.lab3.num3;

public class Table extends Furniture {
    private String material;
    private int height;
    private double weight;

    public Table(){}

    public Table(double price, int amount, String material, int height, double weight){
        super(price, amount);
        this.height = height;
        this.material = material;
        this.weight = weight;
    }

    @Override
    public String info() {
        if (super.getAmount() == 1) {
            return "Last table left!";
        }
        else if(super.getAmount() > 1){
            return "Several tales left";
        }
        else
            return "No tables left";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Table:" +
                "\nmaterial: " + material +
                "\nheight: " + height +
                "\nweight: " + weight +
                "\nprice: " + super.getPrice() +
                "\nleft: " + super.getAmount();
    }
}
