package HW_Irina;

public class HW6 {

    public static void line() {
        System.out.print(" \u001B[31m\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\u001B[0m ");
    }

    public static void task() {
        System.out.print(" Task № ");
    }

    public static void number(int number) {
        System.out.print(number);
    }

    public static void printTask(int num) {
        System.out.println();
        line();
        task();
        number(num);
        line();
        System.out.println();
    }

    public static String mark() {
        return "; ";
    }

    public static void task1() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + mark());
        }
    }

    public static void task2() {
        for (int i = 9; i > -1; i--) {
            System.out.print(i + mark());
        }
    }

    public static void task3() {
        for (int i = 50; i < 56; i += 2) {
            System.out.print(i + mark());
        }
    }

    public static void task4() {
        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + mark());
            }
        }
    }

    public static void task5() {
        for (double i = 12; i < 13; i += 0.1) {
            System.out.print(Math.round(i * 10) / 10D + mark());
        }
    }

    public static void task6() {
        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.print(i + mark());
            }
        }
    }

    public static void task7() {
        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i);
            }
        }
    }

    public static void task8() {
        for (Short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + mark());
            }
        }
    }

    public static void task9() {
        for (int i = -10; i < 34; i++) {
            if (i == 0) {
                System.out.print("\u001B[33m" + "ZERO" + mark() + "\u001B[0m");
            } else if (i % 12 == 0) {
                System.out.print("\u001B[31m" + i + mark() + "\u001B[0m");
            } else if (i % 11 == 0) {
                System.out.print("\u001B[34m" + i + mark() + "\u001B[0m");
            }
        }
    }

    public static void task10(double start, double step, double end) {
        for (start = start; start < end; start += step) {
            System.out.print(start + mark());
        }
    }

    public static void task10_1 (double start, double step, double end) {
       if (start < end && step > 0) {
           for (start = start;  start < end ; start += step) {
               System.out.print(start + mark());
               //System.out.format("%.1f", start);
           }
       }else if (start > end && step < 0) {
           for (start = start;  start > end ; start += step) {
               System.out.print(start + mark());
               //System.out.format("%.1f", start);
           }
       }else {
           System.out.print("Invalid data");
       }
    }

    public static void task11(int l) {
        int end = 0;

        for (int i = 0; end < l; i += 2) {
            System.out.print(i + mark());
            end++;
        }
    }

    public static void task12(int n) {

        for (int i = 1; i <= n; i = 2 * i) {
            System.out.print(i + mark());
        }
    }

    public static void task12_1(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print((int) Math.pow(2, i) + mark());
        }
    }

    public static void task13() {

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        for (int j = 0; j < 10; j++) {
            System.out.print(String.valueOf(j) + String.valueOf(j));
        }
        for (int k = 0; k < 10; k++) {
            System.out.print(String.valueOf(k) + String.valueOf(k) + String.valueOf(k));
        }
        for (int p = 0; p < 10; p++) {
            System.out.print(String.valueOf(p) + String.valueOf(p) + String.valueOf(p) + String.valueOf(p));
        }
    }

    public static void task13_1() {
        String str = "";
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j <= 9; j++) {
                str = str + (String.valueOf(j).repeat(i));
            }
        }
        System.out.print(str);
    }

    public static void task13_2() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <= i; k++) {
                    System.out.print(j);
                }
            }
    }

    public static void task13_3() {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 10; j++) {
                System.out.print(String.valueOf(j).repeat(i));
            }
    }

    public static String task13_4 () {
        String result = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";

        for (int i = 0; i < 10; i++) {
            result = result + i;
            result2 = result2 +  i + i;
            result3 = result3 + i + i + i;
            result4 = result4 + i + i + i + i;
        }
        return result + result2 + result3 + result4;
    }

    public static void task14() {
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.printf("%d", i);
            } else
                System.out.printf(", %d, %d", i, -i);
        }
    }

    public static void task14_1() {
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.print(i + mark());
            } else
                System.out.print(i + mark() + -i + mark());
//            System.out.print(String.valueOf(i + ", ") + String.valueOf(-i + ", ")); // еще можно так
        }
    }

    public static void task15() {
        for (int i = 0; i < 26; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + mark());
            }
        }
    }

    public static void task16(int n, int m, int l) {
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println(" Все числа четные, ошибка");
        }
        int end = 0;

        for (int i = n; end < l; i += m) {
            if (i % 2 != 0) {
                System.out.print(i + mark());
                end++;
            }
        }
    }

    public static void task17(int n) {
        int l = n + 5;
        for ( ; n < l ; n++) {
            System.out.print("[" + (n + 1) + "]" + " = " + (n + 2) + mark());
        }
    }

    public static void task18(int n, int l) {
        if (n < l) {
            System.out.print("[" + (n) + "]" + " = " + n + mark());
            for (; n < l ; n++) {
                System.out.print("[" + (n + 1) + "]" + " = " + (2 * n) + mark());
            }
        }else {
            System.out.println("Eror");
        }
    }

    public static void task19() {

        for (int i = 10; i < 100; i += 10) {
            for (int j = 0; j < 10; j++) {
                if (Math.abs(i / 10 - j) < 4) {
                    System.out.print(i + j + mark());
                }
            }
        }
    }

    public static void task19_1() {

        for (int i = 10; i <= 99; i++) {
            if (Math.abs((i / 10) - (i % 10)) <= 3) {
                System.out.print(i + mark());
            }
        }
    }

    public static void task20(double x) {

        if (x > 1.5) {
            System.out.println("y = " + (2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30));
        } else if (x >= 0 && x <= 1.5) {
            System.out.println("y = " + (x + 1));
        } else
            System.out.println("у = " + x);
    }

    public static void main(String[] args) {

        printTask(1);
        task1();

        printTask(2);
        task2();

        printTask(3);
        task3();

        printTask(4);
        task4();

        printTask(5);
        task5();

        printTask(6);
        task6();

        printTask(7);
        task7();

        printTask(8);
        task8();

        printTask(9);
        task9();

        printTask(10);
        task10(10, 5, 100);

        printTask(10);
        task10_1(10.5, 1.29, 20.75);

        printTask(10);
        task10_1(15.9, -1.45, 0);

        printTask(10);
        task10_1(15.9, 0, 0);

        printTask(11);
        task11(12);

        printTask(12);
        task12(20);

        printTask(12);
        task12_1(5);

        printTask(13);
        task13();

        printTask(13);
        task13_1();

        printTask(13);
        task13_2();

        printTask(13);
        task13_3();

        printTask(13);
        System.out.print(task13_4());

        printTask(14);
        task14();

        printTask(14);
        task14_1();

        printTask(15);
        task15();

        printTask(16);
        task16(1, 1, 10);

        printTask(17);
        task17(1);

        printTask(18);
        task18(1,10);

        printTask(19);
        task19();

        printTask(19);
        task19_1();

        printTask(20);
        task20(1.5);
    }
}
