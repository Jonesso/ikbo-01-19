package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generic {

    private static <T> List<T> toList(T[] source) {
        return new ArrayList<>(Arrays.asList(source));
    }

    public static void main(String[] args) {
        Object[] objectArray = {"String", 1, true, 2.33};

        System.out.println("Array: " + toList(objectArray));
    }
}
