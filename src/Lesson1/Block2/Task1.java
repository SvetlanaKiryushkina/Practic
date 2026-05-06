package Lesson1.Block2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную. Иначе если a=b  вывести сумму этих чисел.
        //Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();

        int result;

        if (a > b) {
            result = a - b;
            System.out.println("Разность" + result);
        } else if (a == b) {
            result = a+b;
            System.out.println("Сумма"+result);
        }else {
            result = b-a;
            System.out.println(result);
        }
        }
    }
