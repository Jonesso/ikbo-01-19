package ru.mirea.lab9;

import java.util.Scanner;

//Задания 7-8
public class ThrowsDemo3 {
    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key ");
        while (myScanner.hasNextLine()) {
            try {
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("The line is empty, try entering correct line");
            }
        }
    }

    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private static String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {

        getKey();

    }
}
