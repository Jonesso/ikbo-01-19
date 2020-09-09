package ru.mirea.practice5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        N = scanner.nextInt();
        nextNum(N, 1);
    }

    public static void nextNum(int N, int printedNum) {
        if (N < 1) {
            throw new IllegalStateException("The number can not be less than 1.");
        } else {
            if (printedNum > N)
                return;
            if (N == printedNum)
                System.out.print(printedNum);
            else
                System.out.print(printedNum + ", ");
            nextNum(N, printedNum + 1);
        }

    }
}
