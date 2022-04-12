package HW_Sergei.HW_4;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class QA_java_4 {

    public static void  printIntLine () {
        System.out.print(" ----------- ");
    }

    public static void  print (int number) {
        System.out.print(number);
    }

    public static void printTaskNumber (int num) {
        printIntLine();
        print(num);
        printIntLine();
        System.out.println();
    }

    public static void main(String[] args){

        printTaskNumber(1);

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            sum = sum + array[i];
        }
//        int sum1 = IntStream.of(array).sum();
//
//            System.out.println(Arrays.stream(array).sum()); //через Arrays
//            System.out.println(sum1); //через Stream.sum
            System.out.println(sum); //через цикл

        printTaskNumber(2);

        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i = i + 1){
            if (array[i] > maxNum)
                maxNum = array[i];
        }
        OptionalInt max = IntStream.of(array).max();

            System.out.println(maxNum);//через цикл
            System.out.println(Arrays.stream(array).max());//через Arrays
            System.out.println(max);//через Stream.max

        printTaskNumber(3);

        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i = i + 1){
            if (array[i] < minNum)
                minNum = array[i];
        }
        OptionalInt min = IntStream.of(array).min();

            System.out.println(minNum);//через цикл
            System.out.println(Arrays.stream(array).min());//через Arrays
            System.out.println(min);//через Stream.min

        printTaskNumber(4);

        double[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int aver = 0;
        for(int i = 0; i < array.length; i = i + 1){
            aver += array1 [i];
        }
        System.out.println(aver / array1.length);//через цикл

        System.out.println(Arrays.stream(array1).average());//через Arrays

        printTaskNumber(5);

        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4},
                {-5, -6}};
        int summ = 0;
        for (int i = 0; i < array2.length; i = i + 1) {
            for (int j = 0; j < array2[i].length; j = j + 1) {
                summ = summ + array2[i][j];
            }
        }

        System.out.println(summ);//через цикл

        printTaskNumber(6);

        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4},
                {-5, -6}};
        int maxNum1 = array3 [0][0];
        for (int i = 0; i < array3.length; i = i + 1){
            for (int j = 0; j < array3[i].length; j = j + 1){
                if (array3[i][j] > maxNum1)
                    maxNum1 = array3[i][j];
            }
        }

        System.out.println(maxNum1);//через цикл

        printTaskNumber(7);

        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4},
                {-5, -6}};
        int result = 0;
        for(int i = 0; i < array4.length; i = i + 1){
            result += array4[i].length;
        }

        int quantity = Stream.of(array4).mapToInt(m -> m.length).sum();

        System.out.println(result);
        System.out.println(quantity);

        printTaskNumber(8);

        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i = i + 1){
            if (s.charAt(i) == 'о'){

                System.out.println(s.charAt(i));
            }
        }

        printTaskNumber(9);

        String text = "Перевыборы выбранного президента";

        int count = 0;
        for (int i = 0; i < text.length(); i = i + 1){
            if (text.charAt(i) == 'е'){
            count = count + 1;
            }
        }
        System.out.println(count);

        printTaskNumber(10);

        String text1 = "Посмотрите как Рите нравится ритм";
        text1 = text1.toLowerCase(); // приведение всех букв в строчные

        int index = text1.indexOf("рит");
        while (index != - 1){ // индекс не равен минус 1
            System.out.println(index);

            index = text1.indexOf("рит", index + 1); // это функция позволяет крутить String со след буквы т.е с 7 ищет со смещением
        }

        printTaskNumber(11);

        String[][] arr = {{"Привет", "всем", "кто"}, {"изучает", "язык",
                "программирования"}, {"java"}};

        int cou = 0;
        for (int i = 0; i < arr.length; i = i + 1) {
            for (int j = 0; j < arr[i].length; j = j + 1) {
                if (!arr[i][j].contains("е")) {
                    cou = cou + 1;
                }
            }
        }
        System.out.println(cou);



    }
}
