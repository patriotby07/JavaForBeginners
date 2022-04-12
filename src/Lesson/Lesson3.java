package Lesson;

public class Lesson3 {

//    static int a; //примитивная
//    static Integer A; //референсная
//    static double d;
//    static double D;
//    static String S;

    public static void main (String[] args){

        int a; //примитивная
        Integer A; //референсная

        a = 10;
        A = 0;
        A = null;
        A = 15;

        A.toString(); // перевод в String

        System.out.println(A.toString());

        System.out.println(A + A);
        System.out.println(A.toString() + A);

//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        Integer.sum(5, 10);
//        System.out.println(Integer.sum(5, 10));
        int sum = Integer.sum(5, 10);
        System.out.println(sum);

        int c = 5;
        Integer.valueOf(c);
        System.out.println(Integer.valueOf(c));


//        System.out.println(a);
//        System.out.println(A);
//
//        System.out.println(d);
//        System.out.println(D);
//
//        System.out.println(S);
    }
}
