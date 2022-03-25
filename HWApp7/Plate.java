/**
 * GB Java. Homework 7. Plate
 *
 * @author Viktor A. Volkov
 * @version 12.3.2022
 */
class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }

    void addFood(int food) {
        this.food += food;
    }

    void info() {
        System.out.println("Plate: " + food);
    }
}