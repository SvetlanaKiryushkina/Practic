package Practic.Lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое не заканчивается на 0");
        int a = sc.nextInt();
        int sum = 0, b;
        if (a % 10 != 0) {
            while (a != 0) {
                b = a % 10;
                sum = sum + b;
                a = a / 10;
            }
        } else {
            System.out.println("Вы ввели число, которое заканчиватеся на 0");
        }
        if (sum > 0) System.out.println("Сумма:" + sum);
    }
}
