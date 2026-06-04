package Practic.Lesson5.Generic;

public class Main {
    public static void main(String[] args) {
        /*
7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
8. Вывести поочередно  имена персонажей, которые сидят за столом.
         */
//создаем студента и сотрудника
        Student studentOne = new Student("Иван", "Иванов", "Экономический");
        Worker worker = new Worker("Петр", "Петров", 2000);
        Student studentTwo = new Student("Сидр", "Сидоров", "Механика");

        //Создаем столы
        Table<Integer, Student> tableOne = new Table<>(1, studentOne);
        Table<Integer, Worker> tableTwo = new Table<>(2, worker);
        Table<Integer, Student> table3 = new Table<>(3, studentTwo);

        System.out.println(tableOne.toString());
        System.out.println(tableTwo.toString());
        System.out.println(table3.toString());

    }
}
