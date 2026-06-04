package Practic.Lesson5.Kitchen;

public class Main {
    public static void main(String[] args) {

    /*
    В классе main cоздайте по паре объектов на основании вышесозданных классов.
    Создайте в классе main создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора
     */
        CoffeeMachine coffeeMachine = new CoffeeMachine("WE", "кофейная", 125.6, true);
        Holodilnik holodilnik = new Holodilnik("Холод", "LG", 1452, false);
        Cleaner cleaner = new Cleaner("Жорик", "LG", 896, true);
        Washer washer = new Washer("Стиралка", "BMW", 100000, true);

        Appliance[] applianseList = {cleaner,coffeeMachine, washer,holodilnik};
        for (Appliance appliance : applianseList) {
            appliance.work();
        }

        /*9.  В классе main сделать выставку только из Кухонной техники. Продемонстрировать способности всех
        электроприборов в этой выставке.
         */

        KitchenAppliance[] kitchenAppliances = {washer, holodilnik};
        for (KitchenAppliance ka : kitchenAppliances){
            ka.cook();
        }
    }
}
