package Lesson.lessons1to7;

public class Lesson7 {

    public static void main(String[] args) {

    String catName = "Рыжик";
    String[] catsNames;

    catsNames = new String[8];
    catsNames[4] = "Рыжик";
    catsNames[1] = "Черныш";
    catsNames[6] = "Рыжик";

    int[] catsAges = new int[8];

        System.out.println(catName);
        System.out.println(catsNames);
        System.out.println(catsNames[0]);
        System.out.println(catsNames[7]);
        System.out.println(catsAges[2]);
        System.out.println(catsNames[4]);

        for (int i = 0; i <= 7; i++) {
            System.out.println(catsNames[i] + ", ");
        }

        System.out.println("___________");

        for (int i = 0; i < 8 ; i++) {
            if (catsNames[i] == "Рыжик") {
                System.out.println(catsNames[i]);
            }
        }

        System.out.println("___________");

        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "Рыжик") {
                System.out.println(i);
            }
        }

        System.out.println("___________");

        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "Черныш") {
                System.out.println(i);
            }
        }

        System.out.println(catsNames.length);
        System.out.println(catsAges.length);
    }
}
