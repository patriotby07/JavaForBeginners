package Lesson.lesson13;

public class Lesson13StringBuilder {
    public static void main(String[] args) {
        String line = "_____________________________________________________";
        String ll = "|\t";
        String lr = "\t|";

        String str1 = "QA";
        int num1 = 4;
        String str2 = "Every";
        int num2 = 1;

        long start = 0;
        long end = 0;

        String resultPlus = "";


        StringBuilder resultSB = new StringBuilder();

        start = System.nanoTime();

        resultSB
                .append(str1)
                .append(num1)
                .append(str2)
                .append(num2);

        end = System.nanoTime();

        System.out.println(ll + "resultSB" + "\t" + lr + ll + resultSB + "\t" + lr + ll + (end - start) + lr);
        System.out.println(line);

        StringBuffer resultSBuf = new StringBuffer();
        start =System.nanoTime();

        resultSBuf
                .append(str1)
                .append(num1)
                .append(str2)
                .append(num2);

        end = System.nanoTime();

        System.out.println(ll + "resultSBuf" + "\t" + lr + ll + resultSB + "\t" + lr + ll + (end - start) + lr);
        System.out.println(line);

    }
}
