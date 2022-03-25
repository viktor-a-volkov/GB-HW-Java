/**
 * GB Java. Homework 7
 *
 * @author Viktor A. Volkov
 * @version 12.3.2022
 */
class HWApp7 {

    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Smokey", 5), new Cat("Barsik", 15), new Cat("Alice", 20), new Cat("Musya", 10)
        };

        Plate plate = new Plate(30);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50);
        plate.info();
    }
}