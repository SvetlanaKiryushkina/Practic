package Practic.Lesson6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    /*
1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
1.2Добавить  пару записей (Привет, Как дела, Праздник, Суфле)
1.3 Вывести все записи.
1.4 Проверить, содержит ли коллекция слово Конфета
1.5 Посчитать количество элементов в коллекции
     */
        List<String> stringList = new ArrayList<>();
        stringList.add("Привет");
        stringList.add("Как дела");
        stringList.add("Праздник");
        stringList.add("Суфле");

        System.out.println(stringList);
        System.out.println("Содержит ли коллекция слово Конфета " + stringList.contains("Конфета"));
        System.out.println("Кол-во элементов " + stringList.size());

/*
2. Условие: Создайте ArrayList<String> для хранения списка покупок. Добавь в него 5 товаров.
Затем выведите весь список на экран, а после — удалите один товар по названию и снова выведите обновлённый список.
 */
        List<String> arreyPokupki = new ArrayList<>();
        arreyPokupki.add("Товар 1");
        arreyPokupki.add("Товар 2");
        arreyPokupki.add("Товар 3");
        arreyPokupki.add("Товар 4");
        arreyPokupki.add("Товар 5");

        System.out.println(arreyPokupki);
        arreyPokupki.remove("Товар 1");
        System.out.println(arreyPokupki);

        System.out.println("**************");
        //Создайте 3 книги. И добавьте эти книги в коллекцию.

        Book book1 = new Book("Книга синяя", "Пушкин");
        Book book2 = new Book("Книга большая", "Толстой");
        Book book3 = new Book("Книга интересная", "Есенин");
        Book book4 = new Book("Книга большая", "Толстой");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        System.out.println(books);

        //Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.

        books.remove(1);
        System.out.println(books);
        System.out.println("**********");

        /*
        Создайте множество Set<Book> и добавьте в него несколько книг, включая дубликаты (одинаковое название и автор).
         Переопределите методы equals() и hashCode() так, чтобы книги с одинаковыми значениями title и author
         считались одинаковыми. Выведи содержимое множества и убедись, что дубликаты не добавляются.
         */
        Set<Book> bookSet = new HashSet<>();
        //System.out.println(book1.equals(book2));
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        System.out.println("Книги " + bookSet);
    }
}
