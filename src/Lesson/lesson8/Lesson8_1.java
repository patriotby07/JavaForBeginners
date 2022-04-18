package Lesson.lesson8;

import static Utils.Utils.verify;

public class Lesson8_1 {

    protected static String cat1_1 = "Cat"; // только в пакете
    public static String dog1_1 = "Dog"; // везде
    private static String horse1_1 = "Horse"; //Только здесь


    public static void line() {
        System.out.println("________________________");
    }

    public static void main(String[] args) {
        line();
        horse1_1 = "Конь";


    }
}
