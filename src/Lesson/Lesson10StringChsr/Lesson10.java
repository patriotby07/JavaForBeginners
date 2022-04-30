package Lesson.Lesson10StringChsr;

import java.util.Arrays;

public class Lesson10 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

        char a = 'a';
        Character aa = 'a';
        Character aaa = new Character('a');

        System.out.println(a == aa);         //true
        System.out.println(aa == aaa);      //false
        System.out.println(aa.equals(aa)); //true

        String strA = "a";
        //System.out.println(a == strA); //несравнимые вещи

        System.out.println(str1 + space + str2 + space + str3);

        String str4 = str1 + space + str2 + space + str3;

        System.out.println(str4);


        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(4)); //пробел
//        System.out.println(str1.charAt(4)); //StringIndexOutOfBoundsException

        System.out.println("____________________________");
        for (int i = 0; i <= 4; i++) {
            System.out.println(str4.charAt(i));
        }

        System.out.println("____________________________");
        for (int i = 0; i < str4.length() ; i++) {
            if (str4.charAt(i) == 'a') {
                //array[i]

                System.out.println(i); //индексы
                System.out.println(str4.charAt(i)); //буквы
            }else {
                System.out.println("Letter in not a");
            }

        }
        System.out.println("____________________________");
        for (int i = 0; i < str4.length() ; i++) {
            if (str4.charAt(i) >= 'i') {
                System.out.println(str4.charAt(i)); //буквы
            }else {
                System.out.println(" < i");
            }
        }
        System.out.println("____________________________");
        System.out.println('i' - 1);
        System.out.println('i');
        System.out.println('i' + 1);

        System.out.println(Character.toString('i' - 1));
        System.out.println('i');
        System.out.println((char) ('i' + 1));
        System.out.println("____________________________");

        //перевод строки в массив
        String[] arrayStr = new String[str4.length()];

        for (int i = 0; i < str4.length(); i++) {
           arrayStr[i] = Character.toString(str4.charAt(i));
        }

        System.out.println(Arrays.toString(arrayStr));

        System.out.println(str4.toCharArray());
        System.out.println(Arrays.toString(str4.toCharArray()));

        char[] arrayChar = str4.toCharArray();
        System.out.println(arrayStr[0].equals(arrayChar[0]));
        System.out.println(arrayStr[0].compareTo(Character.toString(arrayChar[0])));
        if (arrayStr[0].compareTo(Character.toString(arrayChar[0])) == 0) {
        }

        System.out.println(str4);
        System.out.println(str4.toLowerCase()); //перевод в строчные
        System.out.println(str4.toUpperCase()); //перевод в заглавные

        String str5 = str4.toUpperCase();
        System.out.println(str4.compareToIgnoreCase(str5)); //строки равны

    }
}
