package Practic.Lesson5.Kitchen;

public class Cleaner implements Appliance{

    /*
    Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn. Класс Пылесос имплементирует
    интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».
     */

    private String name;
    private String brand;
    private double price;
    private boolean isOn;

    public Cleaner(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Пылесос убирает");
    }

    public void pilesosit (){
        System.out.println("Пылесосит");
    }
}
