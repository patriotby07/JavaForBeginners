package homeWork;

import java.util.Scanner;

public class Snail {

    public static int snail(int column, int day, int night) {

        if (day >= column) {
            return 1;
        } else if (day <= night) {
            return 0;
        } else {
            int numberDays = (int) Math.ceil((double) (column - day) / (day - night)) + 1;

            return numberDays;
        }
    }
    public static void main(String[] args) {
        System.out.println(snail(21, 7, 4));
    }
}

