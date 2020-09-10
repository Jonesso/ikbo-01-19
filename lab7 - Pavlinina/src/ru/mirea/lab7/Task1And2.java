package ru.mirea.lab7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1And2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*100+1));
        }
        System.out.println("Initial ArrayList: "+ list);
        System.out.println("First element: " + list.get(0));
        System.out.println("Try to find number 66... Got index: " + list.indexOf(66));
        System.out.println("Removed element with index 3: " + list.remove(3));
        System.out.println("Modified ArrayList: "+ list);

        list = new LinkedList<>(list);
        list.add(66);
        System.out.println("Added number 66 to the list");
        System.out.println("Try to find number 66... Got index: " + list.indexOf(66));
        list = list.stream().filter(x -> x > 50).collect(Collectors.toList());
        System.out.println("List of numbers that are greater than 50: " + list);
    }
}
