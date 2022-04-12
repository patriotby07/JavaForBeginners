package homeWork;

import java.util.Arrays;

public class Dmitry_E_4_lesson {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[][] arr2 = {{1, 10, 100, 1000},
                {2, 20, 200, 2000},
                {3, 30, 300, 3000},
                {4, 40, 400, 4000},
                {5, 50, 500, 5000}};

        System.out.println(Arrays.toString(arr2[2]));
        System.out.println(arr2[2][2]);
        int sum = 0;
        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(Arrays.toString(arr2[i]));
            sum = 0;
            for (int j = 0; j < arr2[i].length; j++) {
                sum = sum + arr2[i][j];
                total = total + arr2[i][j];

                if (min > arr2[i][j]) {
                    min = arr2[i][j];
                }

                if (max < arr2[i][j]) {
                    max = arr2[i][j];
                }
            }
            System.out.println("  sum: " + sum); // + "  min=" + min + "  max=" + max);
        }
        System.out.println("min=" + min + "  max=" + max + "  total=" + total);
    }
}

