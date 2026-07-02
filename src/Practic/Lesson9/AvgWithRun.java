package Practic.Lesson9;

import java.util.List;

public class AvgWithRun implements Runnable{

    /*
    Создать 5 потоков, каждый из которых вычисляет среднее арифметическое коллекции
    из 5 случайных целых чисел и выводит на экран. Потоки решать двумя способоами через класс Thread и интерфейс Runnable
     */
    List<Integer> numbers;

    public AvgWithRun(List<Integer> number) {
        this.numbers = number;
    }

    public void avg(){
        int sum = 0;
        String str = Thread.currentThread().getName();
        System.out.println("Поток " + str + " Стартовал");
        for (Integer i : numbers){
            try {
                System.out.println("Поток " + str + " работает");
                Thread.sleep(1000);
                sum+=1;
            }catch (Exception e) {
                throw new RuntimeException("ERROR");
            }
        }
        System.out.println("Поток " + str + " закончил c результатом " +  sum/numbers.size());
    }

    //переопределили метод для работы с потоками
    @Override
    public void run() {
        avg();
    }
}
