/**
 * GB Java. Homework 4
 *
 * @author Viktor A. Volkov
 * @version 4.3.2022
 */
import java.util.Random;
import java.util.Scanner;

class HWApp4 {

    Random random;
    Scanner scanner;
    char[][] map;

    public static void main(String[] args) {
        new HWApp4().game();
    }

    HWApp4() {
        random = new Random();
        scanner = new Scanner(System.in);
        map = new char[3][3];
    }

    void game() {
        initMap();
        printMap();
        while (true) {
            turnHuman();
            if (checkWin('X')) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
            turnAI();
            printMap();
            if (checkWin('O')) {
                System.out.println("AI WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
        }
        System.out.println("GAME OVER!");
        printMap();
    }

    void initMap() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                map[x][y] = '.';
            }
        }
    }

    void printMap() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(map[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter x y [1..3]: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = 'X';
    }

    void turnAI() {
        int x, y;
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                if (isCellValid(x, y)) {
                    map[y][x] = 'X';
                    if (checkWin('X')) {
                        map[y][x] = 'O';
                        return;
                    }
                    map[y][x] = '.';
                }
            }
        }
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        map[x][y] = 'O';
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return map[x][y] == '.';
    }

    boolean checkWin(char ch) {
        for (int i = 0; i < 3; i++) {
            if ((map[i][0] == ch && map[i][1] == ch && map[i][2] == ch) ||
                (map[0][i] == ch && map[1][i] == ch && map[2][i] == ch))
                return true;
        }
            if ((map[0][0] == ch && map[1][1] == ch && map[2][2] == ch) ||
                (map[2][0] == ch && map[1][1] == ch && map[0][2] == ch)) {
                return true;
            }
        return false;
    }

    boolean isMapFull() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (map[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}