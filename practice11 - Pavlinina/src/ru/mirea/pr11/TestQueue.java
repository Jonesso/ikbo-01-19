package ru.mirea.pr11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class TestQueue {
    public static void main(String[] args) {

        MyArrayQueue<Integer> myArrayQueue = new MyArrayQueue<>();
        myArrayQueue.add(666);
        myArrayQueue.add(555);
        myArrayQueue.add(444);
        myArrayQueue.add(333);
        System.out.println("------ArrayQueue------");
        System.out.println(myArrayQueue);
        System.out.println("First element: " + myArrayQueue.element());
        System.out.println(myArrayQueue);
        System.out.println("Poll: " + myArrayQueue.poll());
        System.out.println(myArrayQueue);
        System.out.println();

        MyLinkedQueue<Integer> myLinkedQueue = new MyLinkedQueue<>();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3, 4, 10, 25, 30));
        myLinkedQueue.addAll(arrayList);
        myLinkedQueue.offer(1);
        myLinkedQueue.offer(2);
        myLinkedQueue.offer(3);
        myLinkedQueue.offer(4);
        myLinkedQueue.offer(5);
        System.out.println("------LinkedQueue------");
        System.out.println(myLinkedQueue);
        System.out.println("Queue size: " + myLinkedQueue.size());
        System.out.println("Peek: " + myLinkedQueue.peek());
        System.out.println(myLinkedQueue);
        System.out.println("Poll: " + myLinkedQueue.poll());
        System.out.println(myLinkedQueue);

    }
}
