package Practic.Lesson4;

public class IndustrialBuildings extends Building{

    /*
    1.3 Создать класс Промышленном здание (IndustrialBuilding). Промышленные здания наследуются от Постройки.
    Поля которые можно определить в Промышленном здании: отрасль (Отрасль в которой здание задействовано
     (машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство)
     */

    private String branch;

    public IndustrialBuildings(String street, String wallMaterial, int yearConstruction, String branch) {
        super(street, wallMaterial, yearConstruction);
        this.branch = branch;
    }
}
