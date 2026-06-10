package Practic.Lesson6;

public class Page {
    /*
    Создать Класс Page страница. У страницы есть номер страницы, тип бумаги.
     */
    private final int numberPage;
    private final String type;

    public Page(int nomerPage, String type) {
        this.numberPage = nomerPage;
        this.type = type;
    }

    public int getNomerPage() {
        return numberPage;
    }

    public String getType() {
        return type;
    }
}
