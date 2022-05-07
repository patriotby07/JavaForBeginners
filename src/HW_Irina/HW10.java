package HW_Irina;

import HW_Irina.hw8.HW8;
import HW_Sergei.HW_9.BaseAbstract;
import Utils.Utils;

import java.util.Arrays;
import java.util.Locale;

public class HW10 {
    Utils utils = new Utils();

    public static String removingAndCheckingSpaces(String str) {
        String message = "";

        if (str.length() > str.trim().length()) {
            message = "Лишние пробелы удалены";
        } else if (str.length() == str.trim().length() && str.length() != 0) {
            message = "Пробелов не было";
        } else if (str.length() == 0) {
            message = "Строка пустая";
        }

        return message;
    }

    public static String removeAlla(String str) {

        return str.strip().replace("a", "");
    }

    public static String removeAllZeros(String str) {

        return str.replace(" ", "").replace("0", "");
    }

    public static String removeAllSpaces(String str) {

        return str.replace(" ", "");
    }

    public static int returnNumberOfLetters(String str) {
        int countA = 0;

        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                if (str.toLowerCase().charAt(i) == 'a') {
                    countA++;
                }
            }
            return countA;
        }
        return 0;
    }

    public static boolean findEverythingJava(String str) {

        return str.toLowerCase().contains("java");
    }

    public static String addQuotesAndDot(String str) {
        String mark1 = "\"";
        String mark2 = ".\"";

        return mark1.concat(str.trim()).concat(mark2);
    }

    public static String fixNameCity(String str) {
        char part = str.trim().toUpperCase().charAt(0);
        String part1 = str.trim().substring(1).toLowerCase();

        return part + part1;
    }

    public static String returnPartText(String str, char chr) {
        int a = str.indexOf(chr);
        int b = str.lastIndexOf(chr);

        return str.substring(a, b + 1);
    }

    public static boolean returnSameLetter(String str) {

        if (str == null || str.length() == 0) {

            return false;
        } else

            return str.trim().toLowerCase().substring(0, 1).equals(str.trim().substring(str.trim().length() - 1));
    }

    public static String[] returnArrayText(String str) {

        return str.split(" ");
    }

    public static String[] returnFullName(String str) {
        String fio = "Имя: Фамилия: Отчество:";
        String[] fullname = fio.split(" ");
        String[] s = str.split(" ");

        String[] arr = new String[fullname.length];

        for (int i = 0; i < fullname.length; i++) {
            arr[i] = fullname[i].concat(" ").concat(s[i]);
        }
        return arr;
    }

    public static int returnSumASCII(String str) {
        byte[] bytes = str.getBytes();
        int sum = 0;

        for (int i = 0; i < bytes.length; i++) {
            sum += bytes[i];
            if ((bytes[i] < 65 || bytes[i] > 90) && (bytes[i] < 97 || bytes[i] > 122)) {
                return 0;
            }
        }
        return sum;
    }

    public static boolean returnWhatFirstLetter(String a, String b) {
        boolean result = false;
        if (a.length() != 0 && b.length() != 0 && a != null && b != null && a.length() == 1 && b.length() == 1){
            if ((int)a.charAt(0) < (int)b.charAt(0)){
                return result = true;
            }else
                return result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        Utils.printNumber(1);
        /** 1. Написать метод, который принимает на вход строку.
         * Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и в конце строки.
         * Догадаться, каким методом из видео можно проверить, были ли пробелы.
         * Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
         * Если пробелов не было, вернуть сообщение “Пробелов не было”.
         * Если строка пустая, вернуть сообщение “Строка пустая”.
         * Test Data:
         * “    QA4Everyone   “ → “Лишние пробелы удалены”
         * “QA4Everyone“ → “Пробелов не было”
         * “” → “Строка пустая” **/
        System.out.println(removingAndCheckingSpaces("    QA4Everyone   "));
        System.out.println(removingAndCheckingSpaces("QA4Everyone"));
        System.out.println(removingAndCheckingSpaces(""));
        System.out.println();

        System.out.println("----Дополнительный материал----");
        String str = "  Hello  ";

        System.out.println("Проверка наличия текста в передаваемом String, если при наличии текста - " + str.isEmpty());
        System.out.println("Проверка, что строка не пустая - " + str.length());
        System.out.println("Проверка длинны после удаления пробелов - " + str.trim().length());
        System.out.println("Удаление пробелов в начале и конце текста - " + str.trim());
        System.out.println("Проверка наличия пробелов - " + str.replace(" ", "_"));
        System.out.println("Вариант удаления пробелов - " + str.replace(" ", ""));
        System.out.print("Замена указанной буквы - " + str.replace("l", "o"));

        Utils.printNumber(2);
        /** 2. Написать алгоритм RemoveAlla.
         * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
         * то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
         * Test Data:
         *  “    QA4Everyone   “ →  “QA4Everyone“
         * “panda   “ → “pnd” **/
        System.out.println(removeAlla("    QA4Everyone   "));
        System.out.print(removeAlla("panda   "));

        Utils.printNumber(3);
        /** 3. Написать алгоритм RemoveAllZeros.
         * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
         * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную
         * строку, в которой нет нулей.
         * Test Data:
         *  “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
         * “ 0000000111“ → “111” **/
        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.print(removeAllZeros(" 0000000111"));

        Utils.printNumber(4);
        /** 4. Написать алгоритм RemoveAllSpaces.
         * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
         * то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
         * Test Data:
         *  “    QA   4  Everyone   “ →  “QA4Everyone“
         * “p a     n d a   “ → “panda” **/
        System.out.println(removeAllSpaces("    QA   4  Everyone   "));
        System.out.print(removeAllSpaces("p a     n d a   "));

        Utils.printNumber(5);
        /** 5. Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
         * Test Data:
         * “Abracadabra” → 5
         * “Homenum Revelio” → 0 **/
        System.out.println(returnNumberOfLetters("Abracadabra"));
        System.out.println(returnNumberOfLetters("Homenum Revelio"));
        System.out.println(returnNumberOfLetters(null));
        System.out.println(returnNumberOfLetters(""));
        System.out.println();

        System.out.println("----Дополнительный материал----");
        String test = "Hello";
        String test2 = "Java";

        System.out.println("Объединяет в одну строку несколько слов - ВАР № 1 - " + test.concat("World"));
        System.out.println("Объединяет в одну строку несколько слов - ВАР № 2 - " + test.concat(test2));
        System.out.println("Объединяет в одну строку несколько слов - ВАР № 3 - " + test + test2);
        System.out.println("Проверяет строку на наличие символа или последовательности символов, возврат boolean - " + test.contains("h"));
        System.out.println("Перевод всех букв в строчные - " + test.toLowerCase());
        System.out.println("Перевод всех букв в заглавные - " + test.toUpperCase());
        System.out.println("Поиск букв в тексте(важен регистр букв) - " + test.contains("h"));
        System.out.println("Поиск букв в тексте(важен регистр букв) - " + test.toLowerCase().contains("h"));
        System.out.println("Получение символа из строки - " + test.charAt(1));
        System.out.println("Получение части текста из строки, начиная с указанного индекса - " + test.substring(2));
        System.out.print("Получение части текста от и до указанного элемента - " + test.substring(2, 4));

        Utils.printNumber(6);
        /** 6. Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java. **/
        System.out.println(findEverythingJava("As of March 2022, Java 18 is the latest version, while Java 17, 11 " +
                "and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public " +
                "update for the legacy version Java 8 LTS in January 2019 for commercial use, although it will " +
                "otherwise still support Java 8 with public updates for personal use indefinitely. Other " +
                "vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving " +
                "security and other upgrades."));
        System.out.print(findEverythingJava("As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me."));

        Utils.printNumber(7);
        /** 7. Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки, точку и кавычки в
         *  конце строки с помощью метода concat()
         * Test Data:
         * “One” → ““One.””
         * “    TWO  “ → ““TWO.”” **/
        System.out.println(addQuotesAndDot("One"));
        System.out.print(addQuotesAndDot("    TWO Three  "));

        Utils.printNumber(8);
        /** 8. Напишите метод, который принимает на вход название города и исправляет написание:
         * Test Data:
         * “ташкент” → “Ташкент”
         * “ЧикаГО” → “Чикаго” **/

        System.out.println(fixNameCity("ЧикаГО"));
        System.out.println(fixNameCity("  БуХаЛоВкА   "));
        System.out.print(fixNameCity("ташкент"));

        Utils.printNumber(9);
        /** 9. Напишите метод, который принимает на вход строку, и возвращает все, что находится между первой и последней буквой-параметром:
         * Test Data:
         * “Abracadabra”, “b” → “bracadab”
         * “Whippersnapper”, “p” → “ppersnapp”
         */
        System.out.println(returnPartText("Abracadabra", 'b'));
        System.out.println(returnPartText("Whippersnapper", 'p'));
        System.out.println();

        System.out.println("----Дополнительный материал----");
        String test3 = "Chembacco is a good co-pilot,";

        System.out.println(test3.substring(9));
        System.out.println(test3.substring(15, 19));
        System.out.println("Возврат всего текста - " + test3.substring(0, test3.length() - 1));
        System.out.println("Проверка длинны текста - " + "I'm a string".length());
        System.out.println("Проверка длинны текста - " + new String().length());
        System.out.println("Проверка с какого элемента начинается опред. часть текста - " + test3.indexOf("good"));
        System.out.println("Печать определенной части текста - " + test3.substring(test3.indexOf("good"), test3.indexOf("good") + 4));
        System.out.println("При отсутствии в тексте передаваемых букв - " + test3.indexOf("zz"));
        System.out.print("Поиск последней встречающейся буквы - " + test3.lastIndexOf("a"));

        Utils.printNumber(10);
        /** 10. Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и заканчивается на
         * одинаковую букву, и false иначе
         * Test Data:
         * 	“Abracadabra” → true
         * 	“Whippersnapper” → false **/

        System.out.println(returnSameLetter("Abracadabra"));
        System.out.println(returnSameLetter("   Abracadabra   "));
        System.out.println(returnSameLetter("Whippersnapper"));
        System.out.println(returnSameLetter(null));
        System.out.print(returnSameLetter(""));

        Utils.printNumber(11);
        /** 11. Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
         * Test Data:
         * “QA for Everyone” → {“QA”, “for”, “Everyone”} **/
        System.out.println(Arrays.toString(returnArrayText("QA for Everyone")));
        System.out.println(Arrays.toString(returnArrayText("Александр Сергеевич Пушкин")));
        System.out.println();

        System.out.println("----Дополнительный материал----");
        String test4 = "Chembacco is a good co-pilot";
        String test5 = "Просто, строка в,      java";
        String test6 = "Просто-строка-в-java";
        String[] words = test4.split(" ");
        String[] words1 = test4.split(" ", 2);
        String[] words2 = test5.split("\\s+|,\\s*");
        String[] words3 = test6.split("-");

        System.out.println("Разделителем выступает пробел - " + Arrays.toString(words));
        System.out.println("Разделителем выступает пробел, делим только на 2 элемента - " + Arrays.toString(words1));
        System.out.println("Если нужно разделить сложное предложение - " + Arrays.toString(words2));
        System.out.print("Разделителем выступает тире - " + Arrays.toString(words3));

        Utils.printNumber(12);
        /** 12. Написать метод, который принимает на вход предложение, которое состоит Ф.И.О и возвращает массив строк:
         * Test Data:
         * “Александр Сергеевич Пушкин” →
         * {“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”} **/

        System.out.print(Arrays.toString(returnFullName("Александр Сергеевич Пушкин")));

        Utils.printNumber(13);
        /** 13. Написать метод, который возвращает сумму всех букв слова
         * Test Data:
         * “abc” → 294
         * “ABC” → 198
         * “123” → 0 (это не буквы) **/
        System.out.println(returnSumASCII("abc"));
        System.out.println(returnSumASCII("ABC"));
        System.out.println(returnSumASCII("123"));
        System.out.println(returnSumASCII("abc{"));

        String strs = "abc";
        int ascii = strs.charAt(2);
        System.out.print("Получение номера ASCII - " + ascii);

        Utils.printNumber(14);
        /** 14. Написать метод, который принимает на вход 2 буквы и возвращает true, если первая буква встречается раньше
         * второй, иначе метод возвращает false
         * method(“a”, “m”) → true
         * method(“m”, “l”) → false **/
        System.out.println(returnWhatFirstLetter("a", "m"));
        System.out.println(returnWhatFirstLetter("m", "l"));


    }
}
