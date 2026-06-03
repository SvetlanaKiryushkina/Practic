package Practic.Lesson4;

public class AdminBuilding extends CivilBuilding {
    /*
    1.4 Создать класс Административном здание. Административное здание должно наследоваться от Гражданского здания.
    Поля, которые можно определить в Административном здании: назначение административного
    здания (офисное, кинотеатр, спортсооружение),число людей, на которое рассчитано здание.
     */

    private String purposeAdminBuild;
    private int numberPeople;

    public AdminBuilding(String street, String wallMaterial, int yearConstruction, String purpose,
                         int numberFloors, String purposeAdminBuild, int numberPeople) {
        super(street, wallMaterial, yearConstruction, purpose, numberFloors);
        this.purposeAdminBuild = purposeAdminBuild;
        this.numberPeople = numberPeople;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }
}
