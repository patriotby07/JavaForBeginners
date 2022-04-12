package HW_Irina;

public class HW4_1 {

    public static int number = 11;

    public static void hw2(int k, int l, int m){
        int devKL = k / l;
        int devKM = k / m;
        int devKK = k / k;
        int devLM = l / m;
        int devLK = l / k;
        int devLL = l / l;
        int devMK = m / k;
        int devML = m / l;
        int devMM = m / m;
        System.out.println("Результат деления k на l = " + devKL + ","
                + " а остаток от деления = " + (k % l));
        System.out.println("Результат деления k на m = " + devKM + ","
                + " а остаток от деления = " + (k % m));
        System.out.println("Результат деления k на k = " + devKK + ","
                + " а остаток от деления = " + (k % k));
        System.out.println("Результат деления l на m = " + devLM + ","
                + " а остаток от деления = " + (l % m));
        System.out.println("Результат деления l на k = " + devLK + ","
                + " а остаток от деления = " + (l % k));
        System.out.println("Результат деления l на l = " + devLL + ","
                + " а остаток от деления = " + (l % l));
        System.out.println("Результат деления m на k = " + devMK + ","
                + " а остаток от деления = " + (m % k));
        System.out.println("Результат деления m на l = " + devML + ","
                + " а остаток от деления = " + (m % l));
        System.out.println("Результат деления m на m = " + devMM + ","
                + " а остаток от деления = " + (m % m));
    }

    public static void hw2_1 (int apple, int student) {

        System.out.println("Если " + apple + " яблок поделить на " + student
                + " ученика(ов), " + "то каждый ученик получит по "
                + apple / student + " яблок(а), и "
                + apple % student + " яблок(а) останется учителю.");
    }

    public static void hw2_1_1 (int apple, int student){
        int devAppleStudent = apple / student;
        int mod = apple % student;

   if (apple == 42 && student == 42) {
            System.out.println("Если " + apple + " яблока поделить на " + student
                    + " ученика, " + "то каждый ученик получит по "
                    + devAppleStudent + " яблокy, и "
                    + mod + " яблок останется учителю.");
        }else if (apple == 55 && student == 5) {
            System.out.println("Если " + apple + " яблок поделить на " + student
                    + " учеников, " + "то каждый ученик получит по "
                    + devAppleStudent + " яблок, и "
                    + mod + " яблок останется учителю.");
        }else {
            System.out.println("Если " + apple + " яблоко поделить на " + student
                    + " ученика, " + "то каждый ученик получит по "
                    + devAppleStudent + " яблок, и "
                    + mod + " яблоко останется учителю.");
        }
    }

    public static String apples (int num) {

        String apples = "";
        int lastDigit = num % 10;
        if (num > 10 && num < 21) {
            apples = " яблок";
        }else if (num == 1) {
            apples = " яблоку";
        }else if (lastDigit == 0 || lastDigit >= 5) {
            apples = " яблок";
        }else if (lastDigit == 1) {
            apples = " яблоко";
        }else if (lastDigit > 1 && lastDigit < 5) {
            apples = " яблока";
        }
        return apples;
    }

    public static String howManyApples (int apple, int student) {
        int devAppleStudent = apple / student;
        int mod = apple % student;

        return ("Если " + apple + apples(apple) + " поделить на " + student
                + " учеников, то каждый ученик получит по " + devAppleStudent + apples(devAppleStudent) + " , и "
                    + mod + apples(mod) + " останется учителю.");
    }

    public static void tC (Double tC){
        Double form = (tC * 9/5) + 32;
        String text = tC + " градусов(а) по Цельсию";
        String text1 = Math.round(form * 100.0) / 100.0 + " градусов(а) по Фаренгейту";

        System.out.println(text);
        System.out.println(text1);
    }

    public static void i (int i) {
        Integer min = Integer.MIN_VALUE;
        Integer max = Integer.MAX_VALUE;

        System.out.println("+--------------------------+");
        System.out.println("|int min   |" + "  "+ min);
        System.out.println("+--------------------------+");
        System.out.println("|int max   |" + "   "+ max);
        System.out.println("+--------------------------+");
        System.out.println("|i²        |" + "   " + Math.pow(i, 2));
        System.out.println("+--------------------------+");
    }

    public static void task (){
        System.out.println("\u001B[31m⮮⬇⬇⬇⬇⬇ TASK # " + number + " ⬇⬇⬇⬇⬇⮯\u001B[0m");
        number++;
    }

    public static void main(String[] args) {

        task();

        int age = 4;
        if (age >= 18) {
            System.out.println("Можно голосовать и водить машину");
        } else if (age >= 16) {
            System.out.println("Можно водить машину");
        } else {
            System.out.println("В школу можно идти с 5 лет"); // else-if ladder
        }

        task();

        int evaluation = 5;

        if (evaluation == 5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс");
        } else if (evaluation == 4) {
            System.out.println("перевести в следующий класс");
        } else if (evaluation == 3) {
            System.out.println("дать задание на лето и перевести в следующий класс");
        } else if (evaluation == 2) {
            System.out.println("вызвать родителей и оставить в текущем классе на второй год");
        } else {
            System.out.println("Проверьте введенные данные");
        }

        task();

        int i = 12;
        int j = 10;
        int result = 0;

        if ((i % 3 == 0) && (j % 3 == 0)) {
            System.out.println(result = i + j);
        }
        if ((i % 5 == 0) && (j % 5 == 0)) {
            System.out.println(result = i - j);
        } 
        if ((i % 2 == 0) && (j % 2 == 0)) {
            System.out.println(result = i * j);
        }else {
            System.out.println("Невозможно произвести действия");
        }
        if ((j < 0) || (i < 0)) {
            result = result * -1;
                System.out.println(result);
        }

        task();

        hw2(5, 10, 15);

        task();

        hw2_1(40, 6);
        hw2_1(100,21);

        task();

        hw2_1_1(42, 42);
        hw2_1_1(55, 5);
        hw2_1_1(1, 2);

        System.out.println(howManyApples (42, 42));
        System.out.println(howManyApples(55, 5));
        System.out.println(howManyApples(1, 2));
        System.out.println(howManyApples(40, 21));
        System.out.println(howManyApples(11, 21));

        task();

        tC(35.2);

        task();

        i(5);

        task();

        int a = 5;
        int expectedResult = 25; //2,5,0

        if ((a % 2) == 0) {
             a = a * 2;
        }else {
           a *= a; // метод If else
        }
            System.out.println("a = " + a);

        //Тест
        if(expectedResult == a) {
            System.out.println("\u001B[32m" + "Pass");
        }else {
            System.out.println("\u001B[31m" + "Fail");
        }

        task();

        //Тест //Проверить грамматику написания или можно пограничные значения.
        String expectedResult1 = "Можно голосовать и водить машину";

        if (expectedResult1 == "Можно голосовать и водить машину") {
            System.out.println("\u001B[32m" + "Pass " + "Можно голосовать и водить машину");
        }else if (expectedResult1 == "Можно водить машину") {
            System.out.println("\u001B[32m" + "Pass " + "Можно водить машину");
        }else if (expectedResult1 == "В школу можно идти с 5 лет" ) {
            System.out.println("\u001B[32m" + "Pass " + "В школу можно идти с 5 лет");
        }else {
            System.out.println("\u001B[31m" + "Fail");
        }

        task();

        Short s = 15;

        if (s < 9 && s > - 9) {
            System.out.println("It’s a one-digit number.");
        }else if (s < 99 && s > - 99) {
            System.out.println("It’s a two-digit number.");
        }else if (s < 999 && s > - 999) {
            System.out.println("It’s a three-digit number.");
        }else if (s < 9999 && s > - 9999) {
            System.out.println("It’s a four-digit number.");
        }else {
            System.out.println("It’s a five-digit number.");
        }
    }
}
