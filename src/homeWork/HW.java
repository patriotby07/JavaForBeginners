package homeWork;

import java.util.Arrays;

public class HW {

    /**
     * Реализуйте функцию, которая для данного массива целых чисел (int) возвращает значение наиболее близкое к 10.
     * Если существует два одинаково близких значения (например, 8 и 12), считайте больше значение.
     */

    public static int arrayAlgorithms(int[] array) {
        int delta = 0;
        int array0 = array[0];
        int array1 = array[1];
        int closestNumber = 0;

        if (Math.abs(array0 - 10) > Math.abs(array1 - 10)) { //ищем из двух чисел ближайшее к 10,
            // даны числа 9 11, 9 - 10 = -1,     11 - 10 = 1
            delta = Math.abs(array1 - 10); //запоминаем число с наименьшей дельтой
            closestNumber = array1; //запоминаем число
        } else {
            delta = Math.abs(array0 - 10); //запоминаем число с наименьшей дельтой
            closestNumber = array0; //запоминаем число
        }
        if (Math.abs(array0 - 10) == Math.abs(array1 - 10)) { // если два числа стоят на одинаковом расстоянии от 10 по модулю
            delta = Math.abs(array0 - 10);
            closestNumber = Math.max(array1, array0); // сравниваем и большее запоминаем
        }

        for (int i = 2; i < array.length; i++) { //пробегаем по всему массиву
            if (Math.abs(array[i] - 10) < delta) { //сравниваем новое и старое как близко оно расположенно к 10
                int delta2 = delta; //запоминаем старую дельту
                delta = Math.abs(array[i] - 10); //мин новая дельта, которая теперь еще ближе к 10
                int newClosestNumber = array[i]; // нашли новое ближайшее число
            }else if (Math.abs(array[i] - 10) == delta){ //если новая и старая дельта равны, например 9 и 11
                if (closestNumber < array[i]) { //сравниваем числа, например 9 и 11
                    closestNumber = array[i]; // стираем 9 и запоминаем 11 как по условию
                }
            }
        }
        return closestNumber;
    }
    public static int arrayAlgorithms1(int[] array, int num) {
       int [] massive = new int[array.length];
       int result = 0;
       int delta = 0;

       for (int i = 0; i < massive.length; i++) {
           massive[i] = Math.abs(array[i] - num); //заполнили массив теперь здесь дельты
       }
           delta = massive[0];
       for (int i = 1; i < massive.length; i++) {
            if (massive[i] < delta && array[i] > array[i - 1]) {
                result = array[i];
                delta = massive[i];
            }
       }

       return result;
    }


    public static void main(String[] args) {
        int[] array = {9, 15, 11, 2, 17, 99};
        int[] array1 = {-2, 14, 0, 15, 99};
        System.out.println(arrayAlgorithms1(array,10));

    }
}
