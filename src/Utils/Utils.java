package Utils;

import java.util.Objects;

public class Utils {

    public static void line() {
        System.out.println("-------------------------------------------");
    }

    public static void lineRepeat(int numder) {
        String line = "─".repeat(numder);
        System.out.println(line);
    }

    public static String lineRepeatSout(int numder) {

        return  "─".repeat(numder);
    }

    public static String space (int numder){
        return " ".repeat(numder);
    }

    public static String spaceFour (int numder){
        return "\t".repeat(numder);
    }

    public static String separation (){
        return "|";
    }

    public static void line1() {
        System.out.print("\u001B[41m↘ꔞꔞꔞꔞꔞꔞꔞꔞꔞ  PART #\u001B[0m");
    }

    public static void line2() {
        System.out.print("\u001B[41mꔞꔞꔞꔞꔞꔞꔞꔞꔞ↙ \u001B[0m");
    }

    public static void number(String number) {
        System.out.print("\u001B[41m " + number + " \u001B[0m");
    }

    public static void printPart(String num) {
        System.out.println();
        line1();
        number(num);
        line2();

    }

    public static void line3 (){
        System.out.print("\u001B[33m꧁꧅꧅꧅꧅꧅꧅\u001B[0m TASK № ");
    }

    public static void line4 (){
        System.out.print(" \u001B[33m꧅꧅꧅꧅꧅꧅꧂\u001B[0m");
    }

    public static void number (int number) {
        System.out.print(number);
    }

    public static void printNumber (int num) {
        System.out.println();
        line3();
        number(num);
        line4();
        System.out.println();
        System.out.println();
    }

    public static String testString (String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            return ("\u001B[32m" + "Pass" + "\u001b[0m");
        }else return ("\u001B[31m" + "Fail" + "\u001b[0m");
    }

    public static String testInteger (int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            return ("\u001B[32m" + "Pass" + "\u001b[0m");
        }else return ("\u001B[31m" + "Fail" + "\u001b[0m");
    }

    public static String testDouble (double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            return ("\u001B[32m" + "Pass" + "\u001b[0m");
        }else return ("\u001B[31m" + "Fail" + "\u001b[0m");
    }

    public static String testBoolean (boolean expectedResult, boolean actualResult) {
        if (expectedResult == actualResult) {
            return ("\u001B[32m" + "Pass" + "\u001b[0m");
        }else return ("\u001B[31m" + "Fail" + "\u001b[0m");
    }

    public static String verify (int a, int b) {
        if (a == b) {
            System.out.println("\u001B[32m" + "Pass" + "\u001b[0m");
            return "\u001B[32m" + "Pass" + "\u001b[0m";
        }else {
            System.out.println("\u001B[31m" + "Fail" + "\u001b[0m");
            return "\u001B[31m" + "Fail" + "\u001b[0m";
        }
    }

    public static String verify (double a, double b) {
        if (a == b) {
            System.out.println("\u001B[32m" + "Pass" + "\u001b[0m");
            return "\u001B[32m" + "Pass" + "\u001b[0m";
        }else {
            System.out.println("\u001B[31m" + "Fail" + "\u001b[0m");
            return "\u001B[31m" + "Fail" + "\u001b[0m";
        }
    }

    public static String verify (String string1, String string2) {
        if (string1.equals(string2)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001b[0m");
            return "\u001B[32m" + "Pass" + "\u001b[0m";
        }else {
            System.out.println("\u001B[31m" + "Fail" + "\u001b[0m");
            return "\u001B[31m" + "Fail" + "\u001b[0m";
        }
    }

    public static String verifyBoolean (int a, int b) {
        if (a == b) {
            return "\u001B[32m" + true + "\u001b[0m";
        }else {
            return "\u001B[31m" + false + "\u001b[0m";
        }
    }

    public static String verifyBoolean (double a, double b) {
        if (a == b) {
            return "\u001B[32m" + true + "\u001b[0m";
        }else {
            return "\u001B[31m" + false + "\u001b[0m";
        }
    }

    public static String verifyBoolean (String a, String b) {
        if (a.equals(b)) {
            return "\u001B[32m" + true + "\u001b[0m";
        }else {
            return "\u001B[31m" + false + "\u001b[0m";
        }
    }

    public static void printArray (int [] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[array.length - 1] + "]");
            } else
                System.out.print(array[i] + ", ");
        }
    }

    public static void printArray (double [] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[array.length - 1] + "]");
            } else
                System.out.print(array[i] + ", ");
        }
    }

    public static void printArray (String [] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[array.length - 1] + "]");
            } else
                System.out.print(array[i] + ", ");
        }
    }

    public static void printArray (boolean [] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[array.length - 1] + "]");
            } else
                System.out.print(array[i] + ", ");
        }
    }

    public static boolean checkForEmptyArray (int[] array) {
        if (array.length != 0) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkForEmptyArray (double[] array) {
        if (array.length != 0) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkForEmptyArray (String[] array) {
        if (array.length != 0) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkForEmptyArray (boolean[] array) {
        if (array.length != 0) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkPositiveNumbers (double[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0.0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPositiveNumbers (int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return false;
            }
        }
        return true;
    }

    public static int giveMeAmountOfEvenNumbersIfNoNegatives (int[] array) {
        if (!containsNegativeNumbers(array) && array.length != 0) {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    counter++;
                }
            }
            return counter;
        }
        return Integer.MIN_VALUE;
    } //проверка на наличие негативных, что массив не пустой и выводит только четные числа.

    public static boolean containsNegativeNumbers (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                return true;
            }
        }
        return false;
    }

    public static Object[] allDataType (Object ... v) {
        Object[] arr = new Object[v.length];
        for (int i = 0; i < v.length; i++) {
            arr[i] = v[i];
        }
        return arr;
    } // можно всунуть любой тип данных любой длинны
}
