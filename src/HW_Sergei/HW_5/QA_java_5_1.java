package HW_Sergei.HW_5;

public class QA_java_5_1 {

    public static void main(String[] args) {

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++){

                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }


        for (int i = 9; i >= 0; i--) {
            for (int j = i; j < 9; j++) {

                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print(j);
                System.out.print(" ");

            }
            System.out.println();
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = i; j < 9; j++) {

                System.out.print("  ");
            }

            for (int j = i; j >= 0; j--) {

                System.out.print(j);
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++){

                System.out.print(j);
                System.out.print(" ");
            }

                System.out.println();
        }


    }
}

