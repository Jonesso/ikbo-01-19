package ru.mirea.lab9;

import java.util.Scanner;

public class TestExceptions {

    public static void exceptionDemo1() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void exceptionDemo2() {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Wrong input format (should be an integer)");
        }
        finally {
            System.out.println("Finally block");
        }

    }

    public static void main(String[] args) {

        //Задание 1
        //При System.out.println(2.0 / 0.0); будет выведено "Infinity"

        exceptionDemo1(); // перехватит ошибку и выведет "Attempted division by zero"

        // Задание 2
        //Без блока try-catch: при Qwerty выдает NumberFormatException, при 0 - ArithmeticException (/ by zero),
        // при 1.2 - NumberFormatException, при 1 - 2 (не выдает ошибок)

        exceptionDemo2(); // перехватывает ошибки и выводит соответствующие предупреждения

        // Задание 3
        //При добавлении catch (Exception e) программа не будет выполнять дальнейшие проверки на другие
        // исключения, т.к. класс Exception является родителем всех остальных видов исключений (включает их в себя)// Задание 3

        // Задание 4
        //При добавлении блока finally программа будет выполнять код, находящийся в этом блоке,
        //в любом случае - в этом назначение ключевого слова finally


    }
}
