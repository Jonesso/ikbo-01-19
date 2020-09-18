package ru.mirea.lab9;

import java.util.Scanner;

public class ThrowsDemo {

    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e){
            System.out.println("Null parameter in key, should be String");
        }

    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {

        //Задание 5. Изначально функцию getDetails неудобно оборачивать в try-catch,
        // т.к. непонятно, какую именно часть кода нужно обернуть в блок; небходима отдельная
        // функция (printMessage), которая будет вызывать проверку(getDetails),
        // которую и следует поместить в блок try
        printMessage(null);
        printMessage("abcd12345");

    }
}
