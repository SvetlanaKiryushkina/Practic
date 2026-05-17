package Practic.Lesson2;

public class Task4 {
    public static void main(String[] args) {
        //Создать массив из чисел. Вывести макс и мин число.
        int[] array = {7, 3, 10, 5, 9};
        int min = 100;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a < min) min = a;
            if (a > max) max = a;
        }
        System.out.println("Min " + min + " " + "Max " + max);
    }
}
