package ru.mirea.lab12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strRegEx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9_](?=\\S+$).{7,}$";
        Pattern pattern = Pattern.compile(strRegEx);
        String[] strPasswords = {
                "F032_Password", "TrySpy1", //TrySpy1, вообще, по условию не является верным, т.к. содержит 7 символов
                "smart_pass", "A007",
                "mypassword",
                "00000000",
                "Hello World@001",
                "<RRPhantom@16>"
        };

        for (String password : strPasswords) {

            if (password.matches(strRegEx))
                System.out.println(password + " is a valid password");
            else
                System.out.println(password + " is not a valid password");
        }
        //Можно ввести свой паттерн: раскомментируйте строки ниже
//        Matcher matcher = pattern.matcher(scanner.nextLine());
//        System.out.println(matcher.matches());
    }
}

