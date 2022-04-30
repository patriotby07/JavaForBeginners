package HW_Irina.hw8;

import java.util.Arrays;

public class A_9 {

    //9. Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
    //Test Data:
    //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    //{1, 2, 4, 5, 89}, {8, 9, 45} → {}

    public static int [] intersection (int[] array1, int [] array2) {
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length ; j++) {
                if (array1[i] == array2[j]) {
                    count++;
                }
            }
        }

        int[] temp = new int[count];
        for (int i = 0, index = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length ; j++) {
                if (array1[i] == array2[j]) {
                    temp[index++] = array1[i];
                }
            }
        }

        int help = 0;
        for (int i = 0; i < temp.length - 1; i++) {
          if (temp[i] != temp[i + 1]) {
              help++;
          }
        }

        int[] temp1 = new int[help];
        for (int i = 0, index = 0; i < temp.length - 1; i++) {
            if (temp[i] != temp[i + 1]) {
                temp1[index++] = temp[i];
            }
        }

        System.out.println(help);
        System.out.println(Arrays.toString(temp));
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 5, 8, 9, 5, 5};
        int[] array2 = {8, 9, -4, -2, 5, 7, 8, 9};
        System.out.println(intersection(array1,array2));
    }
}
