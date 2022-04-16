package Lesson.lessons1to7;

public class Lesson5 {

    public static int returnMinOfThree(int a, int b, int c){
        int min;

        if (a < b){
            min = a;
        }else {
            min = b;
        }
        if(min < c){

            return min;
        } else {
            min = c;

            return min;
        }
    }
    public static double average(int a, int b, int c) {

        return ((double)a + b + c) / 3;

    }

    public static double returnAbs (double number) {
        if (number < 0) {
            number = number * (-1);
        }
        return number;
    }

    public static double countDifferenceBetweenAndAverage (int a, int b, int c) {

        int min = returnMinOfThree(a, b, c);
        double average = average(a, b, c);

        return returnAbs(min - average);
    }

    public static String displayMessage (int a, int b, int c){

        String message;

        if (countDifferenceBetweenAndAverage(a, b, c) > 3.51) {
            message ="Большой разброс чисел";
            System.out.println("Большой разброс чисел");
        }else {
            message = "Маленький разброс чисел";
            System.out.println("Маленький разброс чисел");
        }
        return message;
    }

    public static void main(String[] args) {

        // Даны 3 числа.
        // Необходимо найти максимально точную разницу
        // между минимальным числом и средним значением.
        // Если разница больше 3.51,
        // показать пользователю сообщение "Большой разброс чисел",
        // иначе показать сообщение "Маленький разброс чисел"

        int a = 5;
        int b = 2;
        int c = 10;

//        System.out.println(returnMinOfThree(a, b, c));
//        System.out.println(returnMinOfThree(12, 13, 4));
//        System.out.println(average(a, b, c));
        displayMessage(a, b, c);
    }
}
