package Practic.Lesson5.Generic;

public class Student extends Character{

    //2. Создать класс Студент. Поля факультет

    private String facultet;

    public Student(String name, String surname, String facultet) {
        super(name, surname);
        this.facultet = facultet;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}