/**
 * GB Java. Homework 2
 *
 * @author Viktor A. Volkov
 * @version 20.2.2022
 */
class HWApp2 {

    public static void main(String[] args) {
        System.out.println(from10to20(2, 4));
        System.out.println(from10to20(3, 7));
        System.out.println(from10to20(9, 5));
        System.out.println(from10to20(12, 8));
        System.out.println(from10to20(17, 9));

        posOrNeg(-6);
        posOrNeg(0);
        posOrNeg(7);

        System.out.println(negOrPos(-7));
        System.out.println(negOrPos(0));
        System.out.println(negOrPos(6));

        string("Hello, world!", 5);

        System.out.println(leapyear(2000));
        System.out.println(leapyear(1991));
        System.out.println(leapyear(1987));
        System.out.println(leapyear(2018));
    }

    static boolean from10to20(int a, int b) {
        return a + b >= 10 && a + b <=20;
    }

    static void posOrNeg(int x) {
        System.out.println(x >= 0? "Positive" : "Negative");
    }

    static boolean negOrPos(int y) {
        return y < 0;
    }

    static void string(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    static boolean leapyear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}