package HW_Irina;

public class HW5 {

    public static void  printIntLine1 () {
        System.out.print(" \u001B[31m----\uD83E\uDDEA----\uD83E\uDDEA----\u001B[0m ");
    }

    public static void  test () {
        System.out.print(" Test # ");
    }

    public static void  printIntLine2 () {
        System.out.print(" \u001B[32m----\uD83E\uDDEA----\uD83E\uDDEA----\u001B[0m ");
    }

    public static void  print (int number) {
        System.out.print(number);
    }

    public static void printTestNumber (int num) {
        printIntLine1();
        test();
        print(num);
        printIntLine2();
        System.out.println();
    }

    public static void line1 (){
        System.out.print("\u001B[33m↘⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜ ⓉⒶⓈⓀ #\u001B[0m ");
    }

    public static void line2 (){
        System.out.print(" \u001B[33m⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜↙\u001B[0m");
    }

    public static void number (int number) {
        System.out.print(number);
    }

    public void printNumber (int num) {
        line1();
        number(num);
        line2();
        System.out.println();
        return;
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

    public static String week (int day){
    String dayString;
    switch (day) {
        case 1:
            dayString = "Понедельник";
            break;
        case 2:
            dayString = "Вторник";
            break;
        case 3:
            dayString = "Среда";
            break;
        case 4:
            dayString = "Четверг";
            break;
        case 5:
            dayString = "Пятница";
            break;
        case 6:
            dayString = "Суббота";
            break;
        case 7:
            dayString = "Воскресенье";
            break;
        default:
            dayString = "EROR";
            break;
    }
        return dayString;
}

    public static int returnMaxOfThree(int x, int y, int z) {
        int max;

        if (x < y) {
            max = y;
        } else {
            max = x;
        }
        if (max > z) {
            return max;
        } else {
            max = z;
            return max;
        // return Math.max(Math.max(z, e), z); // короткий вариант!
        }
    }

    public static int returnMinOfThree(int a, int b, int c) {
        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min < c) {
            return min;
        } else {
            min = c;
            return min;
        // return Math.min(Math.max(a, b), c); // короткий вариант!
        }
    }

    public static double tempCat (double a, double b, double c, double d,double e) {
        double average = (a + b + c + d + e) / 5;

        return Math.round(average * 100.0) / 100.0;
    }

    public static String cost (double cost) {
        int rub = (int) Math.abs(cost);
        int kop = (int) (Math.round(((Math.abs(cost)) - rub) * 100));

        return rub + " руб. " + kop + " коп.";

//        return (int) cost + " руб. " + ((int) (cost * 100) - (int) cost * 100) + " коп.";
    }

    public static String weight (double weight) {
        int kg = (int) Math.abs(weight);
        int gr = (int) (Math.round(((Math.abs(weight)) - kg) * 1000));

        return kg + " кг. " + gr + " гр.";

    }

    public static Double purchaseAmount (double price, int quantity) {
        double amount = quantity * price;

        return (Math.abs(Math.round(amount * 100.0))) / 100.0;
    }

    public static String check (String name, double price, int quantity) {
        int rub = (int) Math.abs(price);
        int kop = (int) (Math.round(((Math.abs(price)) - rub) * 100));
        double total = quantity * price;
        int rub1 = (int) Math.abs(total);
        int kop1 = (int) (Math.round(((Math.abs(total)) - rub1) * 100));

        return name + "\n" + "Цена за 1 шт.           " + rub + " руб. " + kop + " коп." + "\n"
                + "Количество товара шт.   " + quantity + "\n" + "-----------------------------------------\n"
                    + "Сумма к оплате:         " + rub1 + " руб. " + kop1 + " коп.";
    }

    public static Double salary (double workingHours, double costHourWork) {
        double salary = (workingHours * costHourWork) * 22;

        return (Math.abs(Math.round(salary * 100.0))) / 100.0;

    }

    public static String payrollStatement (String name, double hoursWorked, double costHourWork) {
       double payrollStatement = (Math.abs(Math.round((hoursWorked * costHourWork) * 100.0))) / 100.0;

        return "\n" + name + "  " + payrollStatement + " $";
    }

    public static String task12 (int x) {

        if (x < 0) {
            return "x is negative";
        }else if (x > 0) {
            return "x is positive";
        }else
            return "x is zero";
    }

    public static int recursion (int n) {
        if (n < 10) {
            return n;
        }else {
            return n % 10 + recursion(n / 10);
        }
    }

    public static Integer luckyNumber (int year) {
        while (year > 9) {
            year = recursion(year);
        }
        return year;
    }

    public static Integer luckyNumber2 (int year) {
        if (year < 10) {
            return  year;
        }else {
            while (year > 9) {
                int sum = 0;
                for (int i = 0; i < String.valueOf(year).length(); i++) {
                    sum = sum + Integer.parseInt(String.valueOf(String.valueOf(year).charAt(i)));
                }
                year = sum;
            }
        }
        return year;
    }

    public static String median ( int a, int b, int c) {
        int max = Math.max(Math.max(a,b), c);  //17    //17  //27           // 17, 9, 14
        int min = Math.min(Math.min(a,b), c); //9     //15  //3           // 17, 16, 15 // Нужно приводить к абсолюту значения (в видео)!!!
        int med = a + b + c - (min + max);   //14    //16  // 24         // 24, 3, 27
        double average = Math.round((((double) a + b + c) / 3) * 100.0) / 100.0;

        if ((med - average) > 2 || (average - med) > 2 ) {
            return "Среднее значение " + average + " отличается от медианы " + med + " на " + (med - average);
        }else
            return "Среднее значение = " + average + ", медиана = " + med;
}

    public static String task15 (double sum) {
        int rub = (int) (Math.abs(Math.floor(sum)));
        int kop = (int) (((Math.abs(Math.floor(sum))) - rub) * 100);

        return rub + " руб. " + kop + " коп.";
    }

    public static Double task16 (int a, int b, int c) {

       return Math.ceil(Math.sqrt(((a * b + c) * Math.pow(a, b)))/ Math.PI);
    }

    public static String  task18 () {

        return "Число " + Math.random() + " в степени " + (int)(Math.random() * 11) + " = "
                + Math.round(Math.pow(Math.random(),(int)Math.random() * 11)) ;
    }

    public static Integer task19 () {

        return (int)(Math.random() * 99) + 1;
    }

    public static Boolean task20 (int year) {
        boolean isLeapYear = true;
        boolean other = false;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return isLeapYear;
        }else
            return other;
    }

    public static void main(String[] args) {

    printTestNumber(2);

        System.out.println("Сегодня " + week(3));
        System.out.println("Позитивное тестирование = " + testString("Среда", week(3)));
        System.out.println("Негативное тестирование = " + testString("Среда", week(8)));

        printTestNumber(3);

        System.out.println("Максимальное число = "  + returnMaxOfThree(-2, 15, 0));
        System.out.println("Позитивное тестирование = " + testInteger(15, returnMaxOfThree(-2, 15, 0)));
        System.out.println("Негативное тестирование = " + testInteger(15, returnMaxOfThree(-2, 11, 0)));

        printTestNumber(4);

        System.out.println("Минимальное число = " + returnMinOfThree(-3, 0, 1));
        System.out.println("Позитивное тестирование = " + testInteger(-3, returnMinOfThree(-3, 0, 1)));
        System.out.println("Негативное тестирование = " + testInteger(-3, returnMinOfThree(12, 0, -1)));

        printTestNumber(5);
        System.out.println("Средняя температура вашего любимца = " + tempCat(38.8, 39.2, 37.4, 36.8, 36.9));
        System.out.println("Позитивное тестирование = " + testDouble(37.82, tempCat(38.8, 39.2, 37.4, 36.8, 36.9)));
        System.out.println("Негативное тестирование = " + testDouble(37.82, tempCat(37.8, 36.2, 37.8, 37.5, 37.9)));

        printTestNumber(6);
        System.out.println("Сумма к оплате: " + cost(15.44));
        System.out.println("Позитивное тестирование = " + testString(15 + " руб. " + 44 + " коп.", cost(15.44)));
        System.out.println("Негативное тестирование = " + testString(15 + " руб. " + 44 + " коп.", cost(15.43)));

        printTestNumber(7);
        System.out.println("Вес товара: " + weight(15.44));
        System.out.println("Позитивное тестирование = " + testString(15 + " кг. " + 440 + " гр.", weight(15.44)));
        System.out.println("Негативное тестирование = " + testString(15 + " кг. " + 440 + " гр.", weight(15.43)));

        printTestNumber(8);
        System.out.println("Сумма к оплате: " + purchaseAmount(17.11, 5) + " $");
        System.out.println("Позитивное тестирование = " + testDouble(85.55, purchaseAmount(17.11, 5)) );
        System.out.println("Негативное тестирование = " + testDouble(85.55, purchaseAmount(17.12, 5)));

        printTestNumber(9);
        System.out.println(check("Цветочный горшок", 11.11,3));
        System.out.println("Позитивное тестирование = " + testString("Цветочный горшок" + "\n" + "Цена за 1 шт.           " + 11 + " руб. " + 11 + " коп." + "\n"
                + "Количество товара шт.   " + 3 + "\n" + "-----------------------------------------\n"
                + "Сумма к оплате:         " + 33 + " руб. " + 33 + " коп.", check("Цветочный горшок", 11.11, 3)) );
        System.out.println("Негативное тестирование = " + testString("Цветочный горшок" + "\n" + "Цена за 1 шт.           " + 11 + " руб. " + 11 + " коп." + "\n"
                + "Количество товара шт.   " + 3 + "\n" + "-----------------------------------------\n"
                + "Сумма к оплате:         " + 33 + " руб. " + 33 + " коп.", check("Цветочный горшок", 12.11, 3)) );

        printTestNumber(10);
        System.out.println("Заработная плата = " + salary(8.4, 12.11) + " $");
        System.out.println("Позитивное тестирование = " + testDouble(2237.93, salary(8.4, 12.11)) );
        System.out.println("Негативное тестирование = " + testDouble(2237.93, salary(0.2, 12.11)));

        printTestNumber(11);
        System.out.println("Март 2022" + payrollStatement("Смирнов Иван Генадьевич", 124, 12.55)
                + payrollStatement("Клименко Игорь Олегович", 168,13.99));
        System.out.println("Позитивное тестирование = " + testString("\n" + "Смирнов Иван Генадьевич" + "  " + 1556.2 + " $",
                payrollStatement("Смирнов Иван Генадьевич", 124, 12.55)));
        System.out.println("Негативное тестирование = " + testString("\n" + "Смирнов Иван Генадьевич" + "  " + 1555.2 + " $",
                payrollStatement("Смирнов Иван Генадьевич", 124, 12.55)));

        printTestNumber(12);
        System.out.println(task12(2));
        System.out.println("Позитивное тестирование = " + testString("x is positive", task12(2)));
        System.out.println("Негативное тестирование = " + testString("x is positive", task12(0)));

        printTestNumber(13);
        System.out.println("Счастливый номер = " + luckyNumber(1990));
        System.out.println("Позитивное тестирование = " + testInteger(1, luckyNumber(1990)));
        System.out.println("Негативное тестирование = " + testInteger(2, luckyNumber(1990)));


        printTestNumber(14);
        System.out.println(median(24, 3, 27));
        System.out.println("Позитивное тестирование = " + testString("Среднее значение " + 18.0 + " отличается от медианы "
                + 24 + " на " + (24 - 18.0), median(24, 3, 27)));
        System.out.println("Негативное тестирование = " + testString("Среднее значение " + 18.0 + " отличается от медианы "
                + 24 + " на " + (24 - 18.0), median(24, 5, 27)));

        printTestNumber(15);
        System.out.println("Сумма с округлением в пользу покупателя = " + task15(12.01));
        System.out.println("Позитивное тестирование = " + testString(13 + " руб. " + 0 + " коп.", task15(12.01)));
        System.out.println("Негативное тестирование = " + testString(13 + " руб. " + 0 + " коп.", task15(12.00)));

        printTestNumber(16);
        System.out.println("Получаем число с округлением в большую сторону = " + task16(3, 4, 20));
        System.out.println("Позитивное тестирование = " + testDouble(17.0, task16(3, 4, 20)));
        System.out.println("Негативное тестирование = " + testDouble(17.0, task16(3, 4, 10)));

        printTestNumber(17);
        System.out.println("Было лень");

        printTestNumber(18);
        System.out.println("Проведение тестирования невозможно, в связи с присутствием рандомных чисел!");

        printTestNumber(19);
        System.out.println("Проведение тестирования невозможно, в связи с присутствием рандомных чисел!");

        printTestNumber(20);
        System.out.println("Является ли указанный год високосным: " + task20(2020));
        System.out.println("Позитивное тестирование = " + testBoolean(true, task20(2020)));
        System.out.println("Негативное тестирование = " + testBoolean(true, task20(2015)));

    }
}
