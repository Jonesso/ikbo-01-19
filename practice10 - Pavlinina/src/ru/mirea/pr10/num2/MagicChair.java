package ru.mirea.pr10.num2;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("Wooosh!");
    }

    @Override
    public String toString() {
        return "Magic chair";
    }
}
