package Practic.Lesson1.Block1;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args){
        //Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        System.out.println("Введите y");
        int y = sc.nextInt();
        System.out.println("Введите z");
        int z = sc.nextInt();

        int resalt = (x+y)+y*z;
        System.out.println("Результат решения:" + resalt);
    }
}
