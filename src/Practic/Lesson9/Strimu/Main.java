package Practic.Lesson9.Strimu;

public class Main {
    /*
    В классе main используя ваш функциональный интерфейс, создате лямбда выражение и посчитайте произведение 5 на 10.
     */
    public static void main(String[] args) {

        Multiplication multiplication = (a, b) -> {
            System.out.println("Привет умножение");
            return a*b;
        };
        Multiplication multiplication2 = (a,b) -> {
            System.out.println("Привет деление");
            return a/b;
        };

        System.out.println(mp1(multiplication,10,12));
        System.out.println(mp1(multiplication2,20,2));
    }

    public static Integer mp1(Multiplication multiplication, Integer a, Integer b ){
        return multiplication.mp(a,b);
    }
}
