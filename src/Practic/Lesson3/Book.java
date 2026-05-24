package Practic.Lesson3;

public class Book {
    /*
    Создать класс Book c полями id (тип int), name (тип String), author (тип String), издательство ( тип String ),
    Год издания(тип Int), Количество страниц (тип int), цена (double).Инициализацию книги в классе main выполнять
    через конструктор с параметрами. Также определите конструктор без параметров.
     */

    int id;
    String name;
    String author;
    String publishing;
    int year;
    int quantity;
    double price;

    public Book(int id, String name, String author, String publishing, int year, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
    }

    public Book() {
        System.out.print("Конструктор буз параметров");
    }

    // Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public String info() {
        String result = "id " + id + "; Имя " + name + "; Автор " + author + " Издательство " + publishing + " ; Год выпуска " + year +
                "; Кол-во страниц " + quantity + "; Цена " + price;
        return result;
    }

    //Создать метод, который будет изменять цену книги (сам метод в качестве параметра будет принимать новую цену)
    public void changPrice(double newPrice) {
        this.price = newPrice;
    }

    //Создать метод в классе Book, который будет принимать массив книг и возвращать массив книг,
    // у которых год издания ниже переданного года в методе.

}
