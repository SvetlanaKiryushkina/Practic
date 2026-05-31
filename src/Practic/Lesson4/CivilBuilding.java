package Practic.Lesson4;

public class CivilBuilding extends Building {

    /*
    Создать класс Гражданские здания (CivilBuilding). Гражданские здания должны наследоваться от класса Постройка.
    Поля у класса Гражданские здания: назначение (жилье или общественные здания), количество этажей.
     */

    private String purpose;
    private int numberFloors;

    public CivilBuilding(String street, String wallMaterial, int yearConstruction, String purpose, int numberFloors) {
        super(street, wallMaterial, yearConstruction);
        this.purpose = purpose;
        this.numberFloors = numberFloors;
    }
}
