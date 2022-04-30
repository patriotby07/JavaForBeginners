package HW_Irina.hw8;

import java.util.Arrays;

public class A_12 {
    //12.	Написать алгоритм SortArray, который принимает на вход массив целых чисел,
    // и сортирует элементы массива в порядке возрастания.
    //Test Data:
    //{4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}

    public static int[] sortArray (int[] array) {

        if (array == null) {
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }
        }
        return array;
    }
}
