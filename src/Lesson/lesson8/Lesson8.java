package Lesson.lesson8;

import static Utils.Utils.verify;

public class Lesson8 {

    public static void main(String[] args) {


        int[] arr = new int[] {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        int[] arr4 = new int [0];
        int[] arr5 = {};

        int[] arr6 = new int [1];
        int[] arr7 = {0};

        int[] arr8 = new int [3];
        int[] arr9 = {0, 0, 0};


        int a = 4;
        double b = 5.5;

        Integer intReg = 4;
        Integer intReg1 = 4;
        Double doubReg = 5.5;

        Integer intObject = 4; //Integer intObject = new Integer(4);
        Double doubObject = 5.5; //Double doubObject = new Double(5.5);

        String str1 = "Hello";
        String str2 = "Hello";

        String strObject = new String("Hello");

//        Math math = new Math();


        String cat1 = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("Cat");
        String cat4 = new String("Cat");
        String dog1 = new String("Dog");
        String dog2 = "Dog";

        System.out.println(cat3 == cat4);

        System.out.println(str1 == str2);
        System.out.println(str1 == strObject);

        System.out.println("-----------------------");
        System.out.println(intReg == intReg1);
        System.out.println(intReg == intObject);
        System.out.println("Equals metod");
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
        System.out.println(intReg.equals(intReg1));
        System.out.println(intReg.equals(intObject));

        System.out.println(Lesson8_1.dog1_1);
        System.out.println(Lesson8_1.cat1_1);

        verify(cat1, cat2);
        verify(intReg, intObject);
        System.out.println(intReg == intObject);
        System.out.println(intReg.equals(intObject));

        verify(doubReg, doubObject);
    }
}
