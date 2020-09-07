package ru.mirea.lab3.num1;

public class Plate extends Dish {
    private String material;

    public Plate(String material){
        super("Plate", "white");
        this.material = material;
    }

    @Override
    public void wash() {
        System.out.printf("Washing %s...\n", super.getType());
        super.setClean(true);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Plate:" +
                "\nmade from: " + material +
                "\n" + super.toString();
    }
}
