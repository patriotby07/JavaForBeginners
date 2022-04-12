package HW_Sergei.HW_3;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class QA_java_3_1 {

    public static void main(String[] args) {

        for (int i = 0; i < 16; i = i + 1) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 5; i >= 0 && i <= 10000; i = i * 5) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 40; i <= 60; i = i + 1) {
            if (i % 4 == 0)
                System.out.println(i);
        }

        System.out.println();                                         // 40, 44, 48, 52, 56, 60

        for (int i = 40; i <= 60; i = i + 4) {
            System.out.println(i);
        }

        System.out.println();

        int i2 = 0;
        do {
            System.out.println(i2);
            i2 = i2 + 1;
        } while (i2 < 16);

        System.out.println();

        int i3 = 5;
        do {
            System.out.println(i3);
            i3 = i3 * 5;
        } while (i3 >= 0 && i3 <= 10000);

        System.out.println();

        int i4 = 0;
        while (i4 < 16) {
            System.out.println(i4);
            i4 = i4 + 1;
        }

        System.out.println();

        int i5 = 5;
        while (i5 >= 0 && i5 <= 10000) {
            System.out.println(i5);
            i5 = i5 * 5;
        }

        System.out.println();

        int i6 = 40;
        do {
            System.out.println(i6);
            i6 = i6 + 4;
        } while (i6 >= 40 && i6 <= 60);
    }
}