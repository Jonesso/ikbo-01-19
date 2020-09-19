package ru.mirea.pr8;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for testing waitLists
 *
 * @author Pavlinina S.
 */
public class TestWaitList {

    public static void main(String[] args) {

        //Test bounded list
        WaitList<Integer> boundedWaitList = new BoundedWaitList<>(10);
        for (int i = 0; i < 10; i++) {
            boundedWaitList.add((int) (Math.random() * 100 + 1));
        }
        System.out.println(boundedWaitList);
        System.out.println("Contains 0: " + boundedWaitList.contains(0));
        System.out.println("Remove first: " + boundedWaitList.remove());
        System.out.println("Is empty: " + boundedWaitList.isEmpty());
        List<Integer> test = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            test.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("Contains test-list: " + boundedWaitList.containsAll(test));
        System.out.println();

        //test unfair list
        UnfairWaitList<String> stringUnfairWaitList = new UnfairWaitList<>();
        System.out.println("String UnfairWaitList is empty: " + stringUnfairWaitList.isEmpty());
        stringUnfairWaitList.add("Hello");
        stringUnfairWaitList.add("World");
        stringUnfairWaitList.add("!");
        System.out.println("String UnfairWaitList is empty: " + stringUnfairWaitList.isEmpty());
        System.out.println("String UnfairWaitList contains \"Hello\": " + stringUnfairWaitList.contains("Hello"));
        System.out.println(stringUnfairWaitList);
        System.out.println(stringUnfairWaitList.remove());
        System.out.println(stringUnfairWaitList);
        stringUnfairWaitList.moveToBack("New");
        System.out.print(stringUnfairWaitList);
    }
}
