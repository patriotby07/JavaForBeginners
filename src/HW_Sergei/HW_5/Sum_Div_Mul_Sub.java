package HW_Sergei.HW_5;

public class Sum_Div_Mul_Sub {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static double dev(double a, double b) {
        return a / b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }


    public static void main(String[] args) {
        System.out.println(dev(15, 10));
        System.out.println(mul(15, 10));
        System.out.println(sub(15, 10));
        System.out.println(sum(15, 10));
    }
}