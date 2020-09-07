package ru.mirea.lab3.num1;

public class Glass extends Dish {
    private double volume;
    private String material;
    private double weight;

    public Glass() {
    }

    public Glass(double volume, double weight, String material) {
        super("Glass", "transparent");
        this.volume = volume;
        this.material = material;
        this.weight = weight;
    }

    @Override
    public void wash() {
        System.out.printf("Washing %s...\n", super.getType());
        super.setClean(true);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "Glass:" +
                "\nmade from: " + material +
                "\nvolume: " + volume +
                "\nweight: " + weight +
                "\n" + super.toString();
    }
}
