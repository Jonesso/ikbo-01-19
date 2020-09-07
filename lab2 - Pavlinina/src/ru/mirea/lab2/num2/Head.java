package ru.mirea.lab2.num2;

public class Head {
    private String eyeColor;
    private String hairColor;
    private int headRadius;

    public Head() {}

    public Head(String eyeColor, String hairColor, int headRadius) {
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.headRadius = headRadius;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getHeadRadius() {
        return headRadius;
    }

    public void setHeadRadius(int headRadius) {
        this.headRadius = headRadius;
    }

    @Override
    public String toString() {
        return "Head:\n" +
                "eye color: " + eyeColor +
                "\nhair color: " + hairColor +
                "\nhead radius: " + headRadius;
    }
}
