package ru.mirea.practice5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        N = scanner.nextInt();
        sequence(N, 0);
    }

    public static void sequence(int N, int printedNums) {
        if (N < 1) {
            throw new IllegalStateException("The number can not be less than 1.");
        }
        if (N == 1) {
            System.out.println(N);
        } else {
            if (printedNums > N)
                return;
            else {
                for (int i = 0; i < printedNums; i++)
                    if (i == N - 1)
                        System.out.print(printedNums);
                    else System.out.print(printedNums + ",");
                sequence(N, printedNums + 1);
            }
        }
    }
}
