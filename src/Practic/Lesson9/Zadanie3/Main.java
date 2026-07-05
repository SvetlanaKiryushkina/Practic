package Practic.Lesson9.Zadanie3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car_1 = new Car(1, "Audi", 80000, 2012, 250, 456987);
        Car car_2 = new Car(2, "Reno", 100000, 2013, 50, 45);
        Car car_3 = new Car(3, "Audi1", 51000, 2015, 150, 456);
        Car car_4 = new Car(4, "Audi2", 30000, 2016, 250, 4569);
        Car car_5 = new Car(5, "Audi3", 40000, 2016, 450, 45987);

        List<Car> cars = List.of(car_1, car_2, car_3, car_4, car_5);
        //1.6 Найти машины, у которых пробег от 50000 до 100000.
       List<Car> carFilter =  cars.stream().filter((car) -> {
            return (car.getProbeg()>50000 && car.getProbeg()<100000);
        }).toList();
       System.out.println(carFilter);
    }
}
