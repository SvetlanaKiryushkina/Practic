package Practic.Lesson3;

public class Main {
    public static void main(String[] args) {
       Book book2 = new Book(1, "Книга2", "Пушкин", "Издательство", 1963,
               123,256);

        String infoForBook1;

        //infoForBook1 = book1.info();
        String infoForBook2 = book2.info();
        //System.out.println(infoForBook1);
        System.out.println(infoForBook2);

        book2.changPrice(70);
        String changBook = book2.info();
        System.out.println(changBook);

       //4 В классе main создать массив из пяти книг
        Book[] arrayFiveBooks = areyBook(); //переменная массива. 1. Тип переменной Book [] 2. Название переменной 3. Объявление переменной
        for (Book x: arrayFiveBooks){
            System.out.println(x.info());
        }
    }

    public static Book [] areyBook (){

        Book oneBook = new Book(1, "Книга2", "Пушкин", "Издательство", 1963,
                123,256);
        Book twoBook = new Book(1, "Книга2", "Пушкин", "Издательство", 1963,
                123,256);
        Book threeBook = new Book(1, "Книга2", "Пушкин", "Издательство", 1963,
                123,256);
        Book fourBook = new Book(1, "Книга2", "Пушкин", "Издательство", 1963,
                123,256);
        Book fiveBook = new Book(1, "Книга2", "Пушкин", "Издательство", 1963,
                123,256);
        Book areyBook [] = new Book[5];
        areyBook[0] = oneBook;
        areyBook[1] = twoBook;
        areyBook[2] = threeBook;
        areyBook[3] = fourBook;
        areyBook[4] = fiveBook;
        return areyBook;
    }
}
