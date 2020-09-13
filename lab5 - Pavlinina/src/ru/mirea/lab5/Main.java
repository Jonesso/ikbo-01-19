package ru.mirea.lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path to the image:");
        String path = scanner.nextLine();
        new Task2(path);
    }
}


//C:/Users/sonya/Pictures/boss_doggo.jpg
//C:/Users/sonya/Documents/Sharaga/Java/nature.jpg
//C:/Users/sonya/Pictures/Saved Pictures/doggo.jpg

