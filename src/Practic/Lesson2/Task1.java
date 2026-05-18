package Practic.Lesson2;

public class Task1 {
    public static void main(String[] args) {
        //Необходимо, чтобы программа отображала следующую последовательность чисел:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98 (while)
        int a = 7;
        while (a <= 98) {
            System.out.print(a + " ");
            a += 7;
        }
    }
}
