package Practic.Lesson5.Generic;

public class Character implements Man {
    /*
    1. Создать класс Персонаж. Поля Имя, фамилия.
     */
    private String name;
    private String surname;

    public Character(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return name + " " + surname;
    }
}
