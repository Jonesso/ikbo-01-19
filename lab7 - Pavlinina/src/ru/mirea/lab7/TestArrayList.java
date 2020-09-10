package ru.mirea.lab7;

import java.util.Arrays;

public class TestArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> list1 = new MyArrayList<>();
        for (int i = 0; i < 20; i++) {
            list1.add((int)(Math.random()*100+1));
        }
        System.out.println("ArrayList1: " + list1);

        MyArrayList<Integer> list2 = new MyArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list2.add((int)(Math.random()*100+1));
        }
        System.out.println("ArrayList2: " + list2);

        Integer[] ar = new Integer[11];
        for (int i = 0; i < 11; i++) {
            ar[i] = (int)(Math.random()*100+1);
        }
        MyArrayList<Integer> list3 = new MyArrayList<>(Arrays.asList(ar));
        System.out.println("ArrayList3 size: " + list3.size());
        System.out.println("ArrayList3: " + list3);
        System.out.println("Element with index 7 in ArrayList3: " + list3.get(7));
        list3.add(7, 666);
        System.out.println("ArrayList3 with new element at index 7: " + list3);
        System.out.println("New ArrayList3 size: " + list3.size());

        list3.addAll(list1);
        System.out.println("Merged ArrayList1 and ArrayList3: " + list3);

        MyArrayList<Integer> list4 = MyArrayList.of(ar);
        System.out.println("ArrayList4: " + list4);
        list4.remove(1);
        System.out.println("ArrayList4 with removed number (at index 1): " + list4);
    }
}
