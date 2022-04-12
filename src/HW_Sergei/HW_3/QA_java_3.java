package HW_Sergei.HW_3;

public class QA_java_3 {

    public static void main(String[] args) {

        int a = 13;
        int b = 17;

        if (a == b) {
            System.out.println("a = b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }

        int sumAB = a + b;

        if (sumAB % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        int c = 41;

        if (c > 10) {
            System.out.println("> 10");
        }
        if (c < 100) {
            System.out.println("< 100");
        }
        if (c / 2.0 > 20) {
            System.out.println("True");
        }
        if (c >= 5 && c <= 40) {
            System.out.println("True");
        } else
            System.out.println("False");
    }
}



