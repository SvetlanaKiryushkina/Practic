package Practic.Lesson1.Block1;

public class Task4 {
    public static void main (String[] args){
        //Даны значения: x=5; y=2; c=x*y
        //Расставьте операции инкремента декремента так,
        // * чтобы после выполнения операции (c=x*y) с=10; x=6; y=1
        int x = 5;
        int y = 2;
        int c;

        c = x++ * y--;
        System.out.println("Результат:" + c);
        System.out.println(x);
        System.out.println(y);
    }
}
