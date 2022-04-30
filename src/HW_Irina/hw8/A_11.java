package HW_Irina.hw8;

import java.util.Arrays;

public class A_11 {

    public static int[] reverseArray (int[] array) {
        int[] mas = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            mas[i] = array[array.length - 1 - i];
        }

        return mas;
    }

    public static void main(String[] args) {
        int [] a = {2, 7, 3, 10};
        int [] b = {2, 7, 3, 10};
        System.out.println(Arrays.toString(reverseArray(a)));

    }
}
