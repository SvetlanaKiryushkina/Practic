package Practic.Lesson4;

public class Main {
    public static void main(String[] args) {

        /*
        Создать спортсооружение, исполком, 2 жилых дома, 2 фабрики Значения придумать самим. Добавить эти объекты
        в деревню (реализовать метод по добавлению постройки в деревню) (должны придумать,как это сделать)
         */
        AdminBuilding sportsFacilities = new AdminBuilding("Немига", "Кирпич",1986,
                "Общественное здание", 6, "спортсооружение", 200);

        CivilBuilding committee = new CivilBuilding("Ленина", "Бетон", 1896,
                "Общественное здание", 12);

        Appartman minskWorld = new Appartman("Пушкинская", "Панель", 2015,
                "Жилой дом", 25, 250);

        Appartman danaMall = new Appartman("Независимости", "Панель", 2025,
                "Жилой дом", 30, 1200);

        /*
        Получить значение количества людей, которые могут находится в спортсооружении,
        созданном выше и вывести это в консоль (метод getter)
         */

        System.out.println("Изначальное значение " + sportsFacilities.getNumberPeople());

        // Изменить количество людей, которые могут находится в спортсооружении и
        // вывести их в консоль после изменения (методы setter и getter)

        sportsFacilities.setNumberPeople(450);
        System.out.println("Измененное значение " + sportsFacilities.getNumberPeople());

        //создать массив построек
        Building buildings[] = new Building[2];
        buildings[0] = sportsFacilities;
        buildings[1]= committee;

        //создаем деревню и передаем массив
        Village village = new Village(buildings);

    }
}
