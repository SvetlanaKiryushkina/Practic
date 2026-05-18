package Practic.Lesson2;

public class Task5 {
    public static void main(String[] args) {
        int a;
        for (a = 100; a >= 1; a--) {
            System.out.print(a);
            if (a > 1) {
                System.out.print(",");
            }
        }
        System.out.println("******************");

        //Вывести каждый десяток от 1 до 100. (for)
        int i;
        for (i = 0; i <= 100; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println("**************************");

        //Вывести только нечётные числа от 1 до 100
        int x;
        for (x=1;x<=100;x+=2){
            System.out.print(x + " ");
        }

        System.out.println("*******************");

         //Создать массив чисел от 1 до 100. Вывести полученный массив.

        int[] array = new int[100];
        for (int d =0; d< array.length; d++){ //1 цикл
            array[d] = d+1;
        }
        for (int j =0; j< array.length; j++){ //2 цикл вывод
            int h = array[j];
            System.out.print(h + " ");
        }
    }
}
