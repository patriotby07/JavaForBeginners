package HW_Irina;

public class Teacher {

    public static void main(String[] args) {

        String firstName = "Мария Ивановна";
        String lastName = "Смирнова";
        int age = 35;
        String subject = "Русский Язык и Литература";
        String line = "_______________________________";

        System.out.println(line);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age + " лет");
        System.out.println(subject);
        System.out.println(line);

        firstName = "Иван Петрович";
        lastName = "Серебряков";
        int age1 = 55;
        subject = "Математика";
        String line1 = "꧁☕☕☕☕☕☕☕☕☕\uD83E\uDD73☕☕☕☕☕☕☕☕☕☕☕☕꧂";
        String line2 = "꧁☕☕☕☕☕☕☕☕☕☕\uD83E\uDD73☕☕☕☕☕☕☕☕☕☕☕꧂";

        System.out.println();
        System.out.println(line1);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age1 + " лет");
        System.out.println(subject);
        System.out.println(line2);
    }
}
