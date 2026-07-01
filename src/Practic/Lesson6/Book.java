package Practic.Lesson6;

public class Book {
    /*
 3. Условие: Создай класс Book с полями:
• String title
• String author
3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false
3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.
8. Условие: Создай класс Book с полями:
• String title
• String author
Создайте множество Set<Book> и добавьте в него несколько книг, включая дубликаты (одинаковое название и автор).
Переопределите методы equals() и hashCode() так, чтобы книги с одинаковыми значениями title и author считались
одинаковыми. Выведи содержимое множества и убедись, что дубликаты не добавляются.
     */
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    //классический equals
    public boolean equals(Object obj) {
        if (!(obj instanceof Book book)) {
            return false;
        }
        return title.equals(book.getTitle()) && author.equals(book.getAuthor());
    }

    //Переоперделите метод equals на книгах так,чтобы он всегда возвращал false
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Book)) {
//        }
//        return false;
//    }

    public int hashCode() {
        int result = title.hashCode() + author.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Наименование: " + title + " Автор: " + author;
    }
}
