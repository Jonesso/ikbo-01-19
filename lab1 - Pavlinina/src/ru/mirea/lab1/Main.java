package ru.mirea.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int fact(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++)
            res *= i;

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 задание
        {
            System.out.println("Task1:");
            int[] Array = new int[20];

            for (int i = 0; i < 20; i++)
                Array[i] = (int) (Math.random() * 100);

            for (int i = 0; i < 20; i++)
                System.out.print(Array[i] + " ");

            System.out.println();

            int end = 0;
            while (end < 20) {
                System.out.print(Array[end] + " ");
                end++;
            }

            System.out.println();

            end = 0;
            do {
                System.out.print(Array[end] + " ");
                end++;
            } while (end < 20);
            System.out.println();
        }
        //2 задание
        {
            System.out.println("Task2:");

            for (int str = 0; str < args.length; str++)
                System.out.print(args[str]);

            System.out.println();
        }
        //3 задание
        {
            System.out.println("Task3:");
            double sum = 0;

            for (int i = 1; i <= 10; i++) {
                sum += (double) 1 / i;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        //4 задание
        {
            System.out.println("Task4:");
            int[] Arr = new int[20];

            for (int i = 0; i < 20; i++)
                Arr[i] = (int) (Math.random() * 100);

            for (int i = 0; i < 20; i++)
                System.out.print(Arr[i] + " ");

            System.out.println();
            Arrays.sort(Arr);

            for (int i = 0; i < 20; i++)
                System.out.print(Arr[i] + " ");

            System.out.println();
        }
        //5 задание
        {
            System.out.print("Task5:\nEnter a number: ");
            int num = scanner.nextInt();
            System.out.println("Factorial of the number: " + fact(num));
        }
    }
}
