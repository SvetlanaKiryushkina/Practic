package Practic.Lesson1.Block2;

import java.util.Scanner;

public class Task2 {
    // Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
    //Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        boolean resalt;

        if (a > b && b != 0) {
            System.out.println("Разница числа a и b:" + a / b);
        } else if (a != 0) {
            System.out.println("Разница числа b и a:"+ b / a);
        } else System.out.println("Сумма числа a и b:" + a + b);
    }
}
