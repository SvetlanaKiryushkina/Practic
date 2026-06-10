package Practic.Lesson5.Kitchen;

public class CoffeeMachine implements Appliance {
    /*
    Создать класс Кофемашина. Поля наименование. Список функционала. Стоимость, Boolean isOn (включен) Класс
    кофемашина имплементирует интерфейс Электроприборы. Переопределите метод ворк так,
    чтобы методы выводил «Кофемашина варит кофе».
     */

    private String name;
    private String functionality;
    private double price;
    private boolean isOn;

    @Override
    public void  work (){
        System.out.println("Кофемашина варит кофе");
    }

    public CoffeeMachine(String name, String functionality, double price, boolean isOn) {
        this.name = name;
        this.functionality = functionality;
        this.price = price;
        this.isOn = isOn;
    }

    public void offCoffeeMachine (){
        this.isOn = false;
        System.out.println("Кофемашина выключена");
    }
}
