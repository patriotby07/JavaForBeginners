package Lesson;

public class Lesson4 {
    public static void print (String text){
        System.out.println(text);
    }

    public static void printLine(){
        System.out.println("------------------");
    }

    public static void  task (int number){
        System.out.println("Задача " + number);
    }

    static int number = 1;

    public static void  task (){

        printLine();
        System.out.println("Задача " + number);

        number ++;
    }

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
    }

    public static void main(String[] args) {

        task();

        //Квадрат - это !круг.
        String square = "Квадрат";
        String circle = "Круг";

        System.out.println(square != circle);

        task();
        //Если сегодня суббота, значит, завтра воскресенье.

        //варинат 1
        String today = "Суббота";

        if (today == "Суббота") {
            String tomorrow = "Воскресенье";
        }
        //вариант 2
        String tomorrow = "Воскресенье";

        if (today == "Суббота") {
            System.out.println(tomorrow);
        }
        //вариант 3
        String tomorrow1;

        if (today == "Суббота") {
            tomorrow1 = "Воскресенье";
        }

        task();

        int a = 9;
        int b = 12;
        int c = 2;

        if (a > b && b < c) {
            a = 7;
            int sum = b + c;
            System.out.println(a + " " + sum);
        } else {
            a = 10;
            System.out.println(a);
        }

        task();
        print("Hello!");
        print(tomorrow);

        task();

        int n = 0;
        int expectedResult = 0;

        if (n % 2 != 0) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                n = n * 3;
            }
        } else {
            n = n *(n / 2);
        }

        System.out.println("n = " + n);

        //Test
        if (expectedResult == n){
            System.out.println("\u001B[32m" + "Pass");
        } else {
            System.out.println("\u001B[31m" + "Fail");
        }
    }
}
