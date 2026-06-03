package Practic.Lesson4;

public class Factory extends IndustrialBuildings{
    /*
    Создать класс фабрика. Вопрос: От какого класса должна наследоваться Фабрика. Поля, которые можно
    определить в Фабрике: количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)
Все поля должны быть с модификатором доступа private. Реализовывать методы getter и setter по необходимости.
Инициализацию объекта производить через конструктор.
     */
    private int quantityWorkers;
    private String manufacturedProducts;

    public Factory(String street, String wallMaterial, int yearConstruction,
                   String branch, int quantityWorkers, String manufacturedProducts) {
        super(street, wallMaterial, yearConstruction, branch);
        this.quantityWorkers = quantityWorkers;
        this.manufacturedProducts = manufacturedProducts;
    }
}
