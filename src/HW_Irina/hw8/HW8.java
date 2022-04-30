package HW_Irina.hw8;

import Utils.Utils;

import java.util.Arrays;
import java.util.Random;
import java.util.SimpleTimeZone;
import java.util.SortedMap;

public class HW8 {

    public static Integer age = 31;
    public static Double salary = 999.99;
    public static String name = "Igor";

    private static <T> T[] createArray(T a, T b, T c, T d, T e) { // можно запихнуть разные типы данных (String, int и тд.)
        return (T[]) new Object[]{a, b, c, d, e};
    }

    public static int[] array(int a, int b, int c, int d, int e) {

        return new int[]{a, b, c, d, e};
    }

    public static double[] array(double a, double b, double c, double d, double e) {
        double[] array = {a, b, c, d, e};

        for (int i = 0; i < array.length; i++) {
            if (array.length != 0 && array.length < 6) {
            }
        }
        return array;
    }

    public static String[] array(String a, String b, String c, String d, String e) {
        String[] array = {a, b, c, d, e};
        if (array.length != 0 && array.length < 6) {
            for (int i = 0; i < array.length; i++) {
            }
        }
        return array;
    }

    public static double[] returnArrayDouble(int[] array) {
        double[] doubleArray = new double[array.length];

        if (array == null || array.length == 0) {
            return null;
        }
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                doubleArray[i] = array[i] * 2.5;
            }
        }
        return doubleArray;
    }

    public static int returnNumEven(int[] array) {
        int chet = 0;

        if (array == null || array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                chet++;
            }
        }
        return chet;
    }

    public static int returnNumOdd(int[] array) {
        int Nechet = 0;

        if (array == null || array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                Nechet++;
            }
        }
        return Nechet;
    }

    public static int[] returnArrayOdd(int[] array) {
        int odd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd++;
            }
        }

        int[] masNechet = new int[odd];
        int indexNechet = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                masNechet[indexNechet++] = array[i];
                indexNechet++;
            }
        }
        return masNechet;
    }

    public static int[] returnArrayEvan(int[] array) {
        int evan = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evan++;
            }
        }

        int[] chet = new int[evan];
        int indexchet = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                chet[indexchet] = array[i];
                indexchet++;
            }
        }
        return chet;
    }

    public static boolean[] returnArrayBoolean(int[] array) {
        boolean[] booleanArray = new boolean[array.length];

        if (array == null || array.length == 0) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                booleanArray[i] = true;
            } else
                booleanArray[i] = false;
        }

        return booleanArray;
    }

    public static String returnArrayString(String[] array) {

        if (array == null || array.length == 0) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {

        }
        return String.join(" ", array);
    }

    public static String returnArrayString1(String[] array) {
        String line = "";

        if (array == null || array.length == 0) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                line += array[i] + ".";
            } else {
                line += array[i] + " ";
            }
        }
        return line;
    }

    public static String returnArrayString2(String[] array) {
        StringBuilder line = new StringBuilder();

        if (array == null || array.length == 0) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            line.append(array[i] + " ");

        }
        return line.toString();
    }

    public static double returnHalfArray(int[] array) {
        double sum = 0;

        if (array == null || array.length == 0) {
            return 0;
        }
        for (int i = array.length / 2; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double returnHalfArray1(int[] array) {
        double sum1 = 0;
        double sum2 = 0;

        if (array == null || array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                sum1 += array[i];
            } else
                sum2 += array[i];

        }
        return sum2;
    }

    public static int[] returnMultTable(int number) {

        if (number <= 0 || number > 9) {
            return new int[]{};
        }

        int[] tabl = new int[11];

        for (int i = 0; i < 11; i++) {
            tabl[i] = number * i;
        }

        return tabl;
    }

    public static int[] returnOddEvan(int[] arr) {
        int countOdd = 0;
        int countEven = returnNumEven(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println(countOdd);
        System.out.println(countEven);
        int help = 0;

        if (countEven == countOdd) {
            return new int[0];
        } else {
            help = Math.max(countEven, countOdd);
        }

        int[] array = new int[help];
        int index = 0;

        if (countEven > countOdd) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    array[index++] = arr[i];
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    array[index++] = arr[i];
                }
            }
        }
        return array;
    }

    public static int[] task17(int[] arr) {
        if (returnNumOdd(arr) > returnNumEven(arr)) {
            return returnArrayOdd(arr);
        }else if (returnNumOdd(arr) < returnNumEven(arr)) {
            return returnArrayEvan(arr);
        }else {
            return new int[]{};
        }
    }

    public static int[] returnRandom(int lenght) {
        int[] arr = new int[lenght];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 99) + 1;
        }
        return arr;
    }

    public static int[] returnRandom1(int lenght, int from, int to) {
        int[] arr = new int[lenght];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = from + (int) (Math.random() * (to));
        }
        return arr;
    }

    public static int[] getArrayNumbers(int l, int c) {
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * ((Math.pow(10, c) - 1) - Math.pow(10, c - 1)) + Math.pow(10, c - 1));
        }
        return arr;
    }

    public static int[] returnTwoNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                count++;
            }
        }
        int[] help = new int[array.length - count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                help[index++] = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        return help;
    }

    public static int[] task21(int[] array) {
        int[] arr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i] / 10 * 10 - array[i] % 10;
//            arr[i] = Math.abs(array[i] / 10 - array[i] % 10);
        }
        System.out.println(Arrays.toString(array));
        return arr;
    }

    public static String[] telNumber(int[] array, String coyntry) {
        String tel = "";
        for (int i = 0; i < array.length; i++) {
            tel += array[i];
            if (i == 0) {
                tel += "(";
            }
            if (i == 3) {
                tel += ")";
            }
            if (i == 6 || i == 8) {
                tel += "-";
            }
        }
        String[] arrNum = new String[2];
        arrNum[0] = tel;
        arrNum[1] = coyntry;
        return arrNum;
    }

    public static int[] returnUnikNumber(int[] array) {
        int[] arrayHelp = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int n = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    n++;
                }
            }
            if (n == 1) {
                arrayHelp[i] = array[i];
            }
        }
        int n = 0;
        for (int i = 0; i < arrayHelp.length; i++) {
            if (arrayHelp[i] == 0) {
                n++;
            }
        }
        int[] arrayNew = new int[arrayHelp.length - n];

        int k = 0;
        for (int i = 0; i < arrayHelp.length; i++) {
            if (arrayHelp[i] != 0) {
                arrayNew[k] = arrayHelp[i];
                k++;
            }
        }
        return arrayNew;
    }

    public static int[] returnUnikNumber1(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 0) {
                count++;
            }
        }
        int[] arr1 = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == arr.length - 2) {
                arr1[arr1.length - 1] = arr[arr.length - 1];
            }
            if (arr[i] - arr[i + 1] != 0) {
                arr1[index++] = arr[i];
            }
        }
        return arr1;
    }

    public static int[] task24 (int[] array) {
        int n = 0;

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    for (int j = i + 1; j < array.length ; j++) {
                        if (array[i] == array[j]) {
                            array[j] = -1;
                            n++;
                        }
                    }
                }
            }
            return new int[]{array.length - n, n};
        }
        return new int[]{0, 0};
    }

    public static int[] task25(int[] array, int a, int b) {
        int count = 0;

        for (int i = a; i <= b; i++) {
            count++;
        }

        int[] mass = new int[count];
        int help = 0;

        for (int i = a; i <= b; i++) {
            mass[help++] = array[i];
        }
        return mass;
    }

    public static int[] task26(int[] array, int[] array1) {
        int[] mass = new int[array.length + array1.length];
        int help = 0;
        int help2 = 0;

        for (int i = 0; i < mass.length; i++) {
            if (i < array.length) {
                mass[i] = array[help++];
            } else {
                mass[i] = array1[help2++];
            }
        }
        return returnUnikNumber1(mass);
    }

    public static void main(String[] args) {

        Utils.printPart("I");
        Utils.printNumber(6);

        /**Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и распечатать результат сравнения в виде таблички **/

        Utils.lineRepeat(65);
        System.out.println("HW8" + Utils.spaceFour(6) + Utils.separation()
                + " HW8_1" + Utils.spaceFour(6) + Utils.separation() + " areEquals?");

        Utils.lineRepeat(65);
        System.out.println("Integer age = " + age + Utils.spaceFour(2) + Utils.separation() + " Integer age_1 = "
                + HW8_1.age_1 + Utils.spaceFour(2) + Utils.separation() + Utils.space(1)
                + Utils.verifyBoolean(HW8_1.age_1, age));

        Utils.lineRepeat(65);
        System.out.println("Double salary = " + salary + Utils.spaceFour(1) + Utils.separation() + " Double salary_1 = "
                + HW8_1.salary_1 + Utils.spaceFour(1) + Utils.separation() + Utils.space(1)
                + Utils.verifyBoolean(HW8_1.salary_1, salary));

        Utils.lineRepeat(65);
        System.out.println("String name = " + name + Utils.spaceFour(2) + Utils.separation() + " String name_1 = "
                + HW8_1.name_1 + Utils.spaceFour(2) + Utils.separation() + Utils.space(1)
                + Utils.verifyBoolean(HW8_1.name_1, name));
        Utils.lineRepeat(65);

        /** Написать метод, который принимает на вход 5 целых чисел и возвращает массив из этих же чисел **/
        Utils.printNumber(7);
        Utils.printArray(array(5, 10, 15, 20, 52));


        /**Написать метод, который принимает на вход 5 чисел типа double и возвращает массив из этих же чисел **/
        Utils.printNumber(8);
        Utils.printArray(array(2.0, 33.44, 12.15, 0.1, 0.99));

        /** Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов **/
        Utils.printNumber(9);
        Utils.printArray(array("Hello", "World", "!", "!", "!"));

        /** Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел, умноженных на 2.5 **/
        Utils.printNumber(10);
        Utils.printArray(returnArrayDouble(HW8_1.massiv));


        /** Написать метод, который принимает на вход массив целых положительных чисел и возвращает количество четных чисел в этом массиве **/
        Utils.printNumber(11);
        System.out.print(returnNumEven(HW8_1.massiv));

        /** Написать метод, который принимает на вход массив целых положительных чисел и возвращает массив нечетных чисел **/
        Utils.printNumber(12);
        Utils.printArray(returnArrayOdd(HW8_1.massiv));

        System.out.println();
        Utils.printPart("II");

        /** Написать метод, который принимает на вход массив целых чисел и возвращает массив значений true или false, если числа больше 10 **/
        Utils.printNumber(13);
        Utils.printArray(returnArrayBoolean(HW8_1.massiv));

        /** Написать метод, который принимает на вход массив слов и возвращает строку, состоящую из этих слов **/
        Utils.printNumber(14);
        String[] test14 = {};
        System.out.println(returnArrayString(HW8_1.massivString));
        System.out.println(returnArrayString1(HW8_1.massivString));
        System.out.print(returnArrayString2(HW8_1.massivString));

        /** Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива **/
        Utils.printNumber(15);
        System.out.println(returnHalfArray(HW8_1.massiv));
        System.out.print(returnHalfArray1(HW8_1.massiv));

        /**Написать метод, который принимает на вход целое положительное число в пределах от 1 до 10 исключительно, и возвращает
         * таблицу умножения на это число в виде массива Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20} **/
        Utils.printNumber(16);
        System.out.print(Arrays.toString(returnMultTable(9)));

        /**Написать метод, который принимает массив целых чисел и возвращает массив четных чисел, если четных чисел больше,
         * или массив нечетных чисел, если нечетных чисел больше.**/
        Utils.printNumber(17);
        Utils.printArray(returnOddEvan(HW8_1.massiv));
        System.out.println();
        Utils.printArray(task17(HW8_1.massiv));

        /** Написать метод, который принимает на вход длину массива и генерирует массив случаейных положительных чисел
         * от 0 до 100 исключительно. **/
        Utils.printNumber(18);
        Utils.printArray(returnRandom(20));
        System.out.println();
        Utils.printArray(returnRandom1(20, 1, 99));

        /** Написать метод, который принимает на вход длину массива l и количество знаков d (однозначные, двузначные,
         * трехзначные и тд числа), и генерирует массив случайных целых положительных чисел длины l, в котором все
         * числа имеют количество знаков d **/
        Utils.printNumber(19);
        Utils.printArray(getArrayNumbers(5, 3));

        /** Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив только
         * двузначных чисел. Проверить работу метода на массиве из задания 18. **/
        Utils.printNumber(20);
        Utils.printArray(returnTwoNumber(returnRandom(20)));

        /** Написать метод, который принимает на вход массив целых положительных двузначных чисел, и возвращает массив
         * разниц между десятками и единицами **/
        Utils.printNumber(21);
        Utils.printArray(task21(returnTwoNumber(returnRandom(20))));

        /**Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9, и возвращает массив,
         * который содержит номер телефона, состоящий из этих чисел и название страны, которой номер принадлежит. **/
        Utils.printNumber(22);
        int[] task22 = {8, 0, 2, 9, 7, 3, 3, 6, 7, 9, 0};
        Utils.printArray(telNumber(task22, "Belarus"));

        /** Написать метод, который принимает массив целых положительных чисел больше 0, и возвращает массив уникальных чисел. **/
        Utils.printNumber(23);
        int[] test23 = {1, 2, 3, 4, 6, 4, 8, 3, 10};
        Utils.printArray(returnUnikNumber(test23));
        System.out.println();
        Utils.printArray(returnUnikNumber1(test23));

        /** Написать метод, который принимает на вход массив целых положительных чисел, и возвращает количество уникальных
         * и неуникальных элементов в этом массиве **/
        Utils.printNumber(24);
        Utils.printArray(task24(HW8_1.massiv));

        /**Написать метод, который принимает на вход массив целых положительных чисел, и 2 целых положительнх числа
         * (значения индексов). Метод возвращает массив, который содержит только числа из первого массива в промежутке
         * между индексами.**/
        Utils.printNumber(25);
        Utils.printArray(task25(HW8_1.massiv, 1, 3));

        /** Написать метод, который принимает на вход 2 массива int[] и возвращает объединенный массив уникальных
         * неповторяющихся элементов **/
        Utils.printNumber(26);
        Utils.printArray(HW8_1.massiv);
        System.out.println();
        Utils.printArray(new int[]{5, 12, 14, 36, 1, 2, 3});
        System.out.println();
        Utils.printArray(task26(HW8_1.massiv, new int[]{5, 12, 14, 36, 1, 2, 3}));
    }
}
