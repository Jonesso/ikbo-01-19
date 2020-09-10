package ru.mirea.practice5;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        System.out.println("Enter your sequence:");
        System.out.println("Maximum: " + maxNum());

    }

    public static int maxNum() {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num == 0) {
            return 0;
        } else {
            return Math.max(num, maxNum());
        }
    }
}
