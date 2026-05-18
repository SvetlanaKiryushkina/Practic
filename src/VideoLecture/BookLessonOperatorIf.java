package VideoLecture;

public class BookLessonOperatorIf {
    public static void main(String[] ards) {

        int num;
        num = 100;
        System.out.println("Значение num:" + num);

        num = num * 2;
        System.out.println("Значение num:");
        System.out.println(num);

        if (num < 100) {
            System.out.println("Это правда");
        } else System.out.println("Это не правда");

        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println("Знaчeниe х меньше у");

        x = x * 2;
        if (x == y) System.out.println("Теперь значение x равно y");

        int a;
        for (a = 0; a < 10; a++)
            System.out.println("Знaчeниe х: " + a);

        int b, c;
        b = 10;
        c = 20;

        if (b < c) {
            b = 15;
            c = 0;
            System.out.println("Свершилось");
        }

        int d, e;
        e = 20;
        for (d = 0; d < 10; d++) {
            e = e - 2;
            System.out.println("d=" + d);
            System.out.println("e=" + e);
        }
    }
}
