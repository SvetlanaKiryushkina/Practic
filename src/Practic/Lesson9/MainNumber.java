package Practic.Lesson9;

import java.util.List;

public class MainNumber {
    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 5, 9, 15);
        List<Integer> numbers2 = List.of(2, 25, 5, 9, 15);
//        List<Integer> numbers3 = List.of(1,92,55,9,15);
//        List<Integer> numbers4 = List.of(1,2,5,95,15);
//        List<Integer> numbers5 = List.of(1,92,59,95,15);
//
//        AvgNumbers avgNumbers1 = new AvgNumbers(numbers1);
//        AvgNumbers avgNumbers2 = new AvgNumbers(numbers2);
//        AvgNumbers avgNumbers3 = new AvgNumbers(numbers3);
//        AvgNumbers avgNumbers4 = new AvgNumbers(numbers4);
//        AvgNumbers avgNumbers5 = new AvgNumbers(numbers5);
//
//        avgNumbers1.start();
//        avgNumbers2.start();
//        avgNumbers3.start();
//        avgNumbers4.start();
//        avgNumbers5.start();
//
//        avgNumbers1.setName("One");
//        avgNumbers2.setName("Two");
//        avgNumbers3.setName("Try");
//        avgNumbers4.setName("For");
//        avgNumbers5.setName("Five");

        AvgWithRun avgRun1 = new AvgWithRun(numbers1);
        Thread t1 = new Thread(avgRun1);

        AvgWithRun avgRun2 = new AvgWithRun(numbers2);
        Thread t2 = new Thread(avgRun2);
        t1.start();
        t2.start();
    }
}
