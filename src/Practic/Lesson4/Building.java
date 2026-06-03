package Practic.Lesson4;

public class Building {

    //Создать класс Постройка (Building). Поля у класса Постройка: улица,
    // материал стен, год постройки.

    private String street;
    private String wallMaterial;
    private int yearConstruction;

    public Building(String street, String wallMaterial, int yearConstruction) {
        this.street = street;
        this.wallMaterial = wallMaterial;
        this.yearConstruction = yearConstruction;
    }
}
