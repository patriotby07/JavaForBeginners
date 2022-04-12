package HW_Irina;

import java.util.concurrent.Flow;

public class HW3 {

    public static void main(String[] args) {

        byte a = Byte.MIN_VALUE;
        byte b = Byte.MAX_VALUE;
        short s = - 30000 ;
        short t = 30000;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int numberTask = 2;
        String task = " ---------- ";

        System.out.println(task + (numberTask++) + task);
        System.out.println(a);
        System.out.println(b);
        System.out.println(task + (numberTask++) + task);
        System.out.println(s);
        System.out.println(t);
        System.out.println(task + (numberTask++) + task);
        System.out.println("+--------------------------+");
        System.out.println("|int min   |" + "  "+ min + "  |");
        System.out.println("+--------------------------+");
        System.out.println("|int max   |" + "   "+ max + "  |");
        System.out.println("+--------------------------+");

        long phoneNumber = 80297336790L;

        System.out.println(task + (numberTask++) + task);
        System.out.println(phoneNumber);

        float f = 100.101101F;
        double d = 100.101101;
        double dd = 10.09999 + 20.099999;
        float ff = 10.09999F + 20.099999F;

        System.out.println(task + (numberTask++) + "-" + (numberTask++) + task);
        System.out.println("+--------------------------------------------------"
                + "-------+");
        System.out.println("|float f = 100.101101               |" + "  "+ f
                + "         |");
        System.out.println("+--------------------------------------------------"
                + "-------+");
        System.out.println("|double d = 100.101101              |" + "  "+ d
                + "         |");
        System.out.println("+--------------------------------------------------"
                + "-------+");
        System.out.println("|float ff  = 10.09999 + 20.099999   |" + "  "+ ff
                + "           |");
        System.out.println("+--------------------------------------------------"
                + "-------+");
        System.out.println("|double dd = 10.09999 + 20.099999   |" + "  "+ dd
                + " |");
        System.out.println("+--------------------------------------------------"
                + "-------+");
        /**Точность дробных чисел типа float составляет 6-7 десятичных знаков. Здесь имеется ввиду общее количество цифр, а не
         * количество знаков после запятой. В отличие от других платформ, где более в высокойточности можно добиться за счет
         * использования типа double (до 15 знаков), в Ардуино тип double имеет такую же размерность, как и float.
         */

        double result = 10 / 3.0;

        System.out.println(task + (numberTask++) + task);
        System.out.println(result);

        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;
        /** Идет потеря точности значения
         */

        System.out.println(task + (numberTask++) + task);
        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);

        System.out.println(task + (numberTask++) + task);
        System.out.println(".  . .... .     .    ...");
        System.out.println(".  . .    .     .   .   .");
        System.out.println(".... .... .     .   .   .");
        System.out.println(".  . .    .     .   .   .");
        System.out.println(".  . .... ..... .... ...");

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = - 505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = - 1000000.001;
        Short t9 = 1010;

        System.out.println(task + (numberTask++) + task);
        System.out.println("Byte = " + t1);
        System.out.println("Short = " + t2);
        System.out.println("Byte = " + t3);
        System.out.println("Float = " + t4);
        System.out.println("Integer = " + t5);
        System.out.println("Long = " + t6);
        System.out.println("Double = " + t7);
        System.out.println("Double = " + t8);
        System.out.println("Short = " + t9);

        String line = "─".repeat(73);

        System.out.println(task + (numberTask++) + task);
        System.out.println(line);
        System.out.println("| Type   | Size in Bits | min                  "
                + "| max                    |");
        System.out.println(line);
        System.out.println("| " + Byte.TYPE + "   | " + Byte.SIZE
                + "            | " + Byte.MIN_VALUE + "                 "
                    + "| " + Byte.MAX_VALUE + "                    |");
        System.out.println(line);
        System.out.println("| " + Short.TYPE + "  | " + Short.SIZE
                + "           | " + Short.MIN_VALUE + "               "
                    + "| " + Short.MAX_VALUE + "                  |");
        System.out.println(line);
        System.out.println("| " + Integer.TYPE + "    | " + Integer.SIZE
                + "           | " + Integer.MIN_VALUE + "          | "
                    + Integer.MAX_VALUE + "             |");
        System.out.println(line);
        System.out.println("| " + Long.TYPE + "   | " + Long.SIZE
                + "           | " + Long.MIN_VALUE + " | " + Long.MAX_VALUE
                    + "    |");
        System.out.println(line);
        System.out.println("| " + Float.TYPE + "  | " + Float.SIZE
                + "           | " + Float.MIN_VALUE + "              "
                    + "| " + Float.MAX_VALUE + "           |");
        System.out.println(line);
        System.out.println("| " + Double.TYPE + " | " + Double.SIZE
                + "           | " + Double.MIN_VALUE + "             "
                    + "| " + Double.MAX_VALUE + " |");
        System.out.println(line);

        Integer num1 = 15;
        Integer num2 = 15;

        System.out.println(task + (numberTask++) + task);
        System.out.println("Если num1 = num2, то результат сравнения методом "
                + ".equal = " + num1.equals(num2));

        num1 = 15;
        num2 = 17;

        System.out.println("Если num1 не равно num2, то результат сравнения "
                + "методом .equal = " + num1.equals(num2));

        int number1 = 12;
        int number2 = 12;

        System.out.println(task + (numberTask++) + task);
        System.out.println("Если number1 = number2, то результат сравнения "
                + "методом compare = " + (Integer.compare(number1, number2)));

        number1 = 12;
        number2 = 13;

        System.out.println("Если number1 < number2, то результат сравнения "
                + "методом compare = " + (Integer.compare(number1, number2)));

        number1 = 13;
        number2 = 12;

        System.out.println("Если number1 > number2, то результат сравнения "
                + "методом compare = " + (Integer.compare(number1, number2)));
        /** Float numberFloat = 234.9999F;
         * int numberInt = Math.round(numberFloat);  округление до ближайшего
         * float numberFloat = 234.9999F;            работает только с мал. float
         * int numberInt = (int)numberFloat;
         */

        Float numberFloat = 234.9999F;
        int numberInt = numberFloat.intValue();

        System.out.println(task + (numberTask++) + task);
        System.out.println(numberInt);

        Double numbD = Double.sum(250.255, 250.255);

        System.out.println(task + (numberTask++) + task);
        System.out.println(numbD);
        System.out.println(Double.sum(250.255, 250.255));

        Float first = 2.58F;
        Float second = 2.44F;

        System.out.println(task + (numberTask++) + task);
        System.out.println(Integer.sum(first.intValue(), second.intValue()));
        System.out.println("-- " + "Continued in HW3_1" + " --");
    }
}
