package Practic.Lesson4;

public class Appartman extends CivilBuilding{

    /*
    Создать класс Многоквартирный жилой дом. Вопрос: От какого класса должен наследоваться Многоквартирный жилой дом.
    Поля, которые можно определить в Многоквартирном жилье: количество квартир.
     */
    private int numberApartments;

    public Appartman(String street, String wallMaterial, int yearConstruction, String purpose,
                     int numberFloors, int numberApartments) {
        super(street, wallMaterial, yearConstruction, purpose, numberFloors);
        this.numberApartments = numberApartments;
    }
}
