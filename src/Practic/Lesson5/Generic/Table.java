package Practic.Lesson5.Generic;

public class Table<I, C extends Man> {

    /*
    Создать класс стол. Этот класс будет состоять из двух дженериков. Первый дженерик будет отображать
    инвертарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
     */

    private I inventoryNumber;
    private C character;


    public Table(I inventoryNumber, C character) {
        this.inventoryNumber = inventoryNumber;
        this.character = character;
    }

    public I getInventoryNumber() {
        return inventoryNumber;
    }

    public C getCharacter() {
        return character;
    }

    //6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.

    public String toString() {
        String result = "Инвент.номер " + inventoryNumber + " за ним сидит " + character.getName();
        return result;
    }

    public String getNameOfPerson() {
        String name = character.getName();
        return name;
    }
}