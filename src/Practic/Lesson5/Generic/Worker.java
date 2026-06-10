package Practic.Lesson5.Generic;

public class Worker extends Character {

    //3. Создать класс Сотрудник. Поля, зарплата

    private double salary;

    public Worker(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}