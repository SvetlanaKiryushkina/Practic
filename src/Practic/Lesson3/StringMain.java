package Practic.Lesson3;

public class StringMain {
    public static void main(String[] args) {
        StringClass str1 = new StringClass();
        System.out.println(str1.stroka("I like Java!!!"));

        //Распечатать последний символ строки. Используем метод String.charAt().
        String str2 = "какая-то буква";
        char a = str2.charAt(str2.length()-1);
        System.out.println(a);

        //Вырезать строку Java c помощью метода String.substring().
        String str3 = "Будем вырезать Java из текста";
        String b = str3.substring(15, 19);
        System.out.println(b);
    }
}
