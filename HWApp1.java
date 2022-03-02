/**
 * GB Java. Homework 1
 *
 * @author Viktor A. Volkov
 * @version 20.2.2022
 */
class HWApp1 {

    public static void main(String[] args) {
        printThreeWords();

        checkSumSign(2, 3);
        checkSumSign(-4, 4);
        checkSumSign(-7, 5);

        printColor(-30);
        printColor(0);
        printColor(1);
        printColor(58);
        printColor(100);
        printColor(123);

        compareNumbers(9, 9);
        compareNumbers(5, 3);
        compareNumbers(8, 17);
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign(int a, int b) {
        System.out.println(a + b >= 0? "Sum positive" : "Sum negative");
        }

    static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 100) {
            System.out.println("Green");
        } else {
            System.out.println("Yellow");
        }
    }

    static void compareNumbers(int a, int b) {
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}