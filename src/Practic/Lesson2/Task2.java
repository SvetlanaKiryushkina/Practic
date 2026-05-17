package Practic.Lesson2;

public class Task2 {
    public static void main(String[] args) {
        //Написать программу, которая посчитает сумму первых 10 чисел (while)

        int a = 1, i = 0, sum = 0;
        while (i < 10) {
            sum = sum + a++;
            i++;
        }
        System.out.println("Сумма " + sum);
    }
}
