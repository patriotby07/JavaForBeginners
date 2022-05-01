package HW_Irina;

public class HW10 {

    public static String capitalizeWords(String sentence) {


        if (sentence != null) {
            sentence = sentence.trim();
            if (sentence.length() != 0) {
//            Character.toString(sentence.charAt(0)).toUpperCase();
                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1); //в скобках диапазон какую букву или часть слова писать с большой буквы


                for (int i = 1; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1) + sentence.substring(i + 1, i + 2).toUpperCase()
                                + sentence.substring(i + 2);
                    }
                }
                return sentence;
            }
            return "";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println("           happy brithday!   ");
        System.out.println(capitalizeWords("           happy brithday!   "));
        System.out.println(capitalizeWords("")); // метод работает
        System.out.println(capitalizeWords(null));
        System.out.println(capitalizeWords("      john jacob smith jr."));
        System.out.println(capitalizeWords(" "));
    }
}
