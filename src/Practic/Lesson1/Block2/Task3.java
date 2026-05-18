package Practic.Lesson1.Block2;

import java.util.Scanner;

public class Task3 {
    //На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();

        if (a % 3 == 0) {
            System.out.println("Число делится на 3");
        } else System.out.println("Число не делится на 3");

        //На вход дано число. Определить, делиться ли оно на 3 и на 7, если нет, тогда проверить делиться ли оно на 3,
        // если не делиться, то проверить, делиться ли оно на 7. Вывести соответствующий текст.
        if (b % 3 == 0 && b % 7 == 0) {
            System.out.println("Число делится на 3 и на 7");
        } else if (b % 3 == 0) {
            System.out.println("Число делится на 3");
        } else if (b % 7 == 0) {
            System.out.println("Число делится на 7");
        }else System.out.println("Число не делится на 3 и на 7");
    }
}
