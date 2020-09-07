package ru.mirea.lab3.num1;

public abstract class Dish {
    private String type;
    private String color;
    private boolean clean;

    public Dish() {}

    public Dish(String type, String color) {
        this.type = type;
        this.color = color;
        this.clean = false;
    }

    public abstract void wash();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isClean() {
        return clean ? "yes" : "no";
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    @Override
    public String toString() {
        return "Dish:\n" +
                "type: " + type +
                "\ncolor: " + color +
                "\nclean: " + clean;
    }
}
