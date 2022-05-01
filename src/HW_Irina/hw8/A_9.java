package HW_Irina.hw8;

import java.util.Arrays;

public class A_9 {

    //9. Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
    //Test Data:
    //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    //{1, 2, 4, 5, 89}, {8, 9, 45} → {}



    public static void main(String[] args) {

    }

    public int[] intersection (int[] arr1, int[] arr2) {
        int[] tempArray = new int[arr1.length + arr2.length];
        int arrLength = tempArray.length;

        for (int i = 0; i < arr1.length; i++) {
            tempArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            tempArray[i + arr1.length] = arr2[i];
        }
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray.length - 1; j++) {
                if (tempArray[j + 1] < tempArray[j]) {
                    int temp = tempArray[j + 1];
                    tempArray[j + 1] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < tempArray.length - 1; i++) {
            if (tempArray[i] == tempArray[i + 1]) {
                arrLength--;
            }
        }

        int[] result = new int[arrLength];

        for (int i = 0, index = 0; i < tempArray.length - 1; i++, index++) {
            if (tempArray[i] != tempArray[i + 1]) {
                result[index] = tempArray[i];
            } else {
                index--;
            }
            result[result.length - 1] = tempArray[tempArray.length - 1];
        }
        return result;
    }
}
