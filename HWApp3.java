/**
 * GB Java. Homework 3
 *
 * @author Viktor A. Volkov
 * @version 20.02.2022
 */
class HWApp3 {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr7 = {1, 1, 2, 2};
        System.out.println("Task 1: ");
        task1(arr1);
        System.out.println("\nTask 2: ");
        task2(100);
        System.out.println("\nTask 3: ");
        task3(arr3);
        System.out.println("\nTask 4: ");
        task4();
        System.out.println("\nTask 5: ");
        task5(5, 1);
        System.out.println("\nTask 6: ");
        task6(arr6);
        System.out.println("\nTask 7: ");
        System.out.println(task7(arr7));
    }

    public static void task1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void task2(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void task3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void task4() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    public static void task6 ( int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static boolean task7( int[] arr){
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (leftSum == rightSum - leftSum) {
                return true;
            }
        }
        return false;
    }


}