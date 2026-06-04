package Practic.Lesson5.Kitchen;

public class Washer implements Appliance, KitchenAppliance{

    /*
    Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn. Класс стиральная машина
     имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».
     */
    private String name;
    private String brand;
    private double price;
    private boolean isOn;

    public Washer(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Стиральная машина стирает");
    }

    @Override
    public void cook() {
        System.out.println("Что-то делает");
    }
}
