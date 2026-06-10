package Practic.Lesson5.Kitchen;

public class Holodilnik implements Appliance, KitchenAppliance{

    /*
    Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен). Класс холодильник
     имплементирует интерфейс Электроприборы. Переопределите метод work так, чтобы методы выводил «Холодильник морозит».
     */

    private String name;
    private String brand;
    private double price;
    private boolean isOn;

    public Holodilnik(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Холодильник морозит");
    }

    @Override
    public void cook() {
        System.out.println("В холодильнике еда");
    }
}
