package HW_Sergei.HW_5;

public class QA_java_5_codewars {

    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return i * 2; // возвращает Integer  * на 2.
    }

    public static boolean isLove(final int flower1, final int flower2) {
        //Write a function that will take the number of petals of each flower and return true if they are in
        // love and false if they aren't.
        // return (flower1 % 2  == 0 && flower2 % 2 == 1) || (flowers % 2 == 1 && flowers % 2 == 0); // второй вариант.
        return flower1 % 2 != flower2 % 2; // возвращает и проверяет четное или нечетные друг другу числа.
    }

    public static String numberToString(int num) {
        // Return a string of the number here!
        return String.valueOf(num);   // возвращает Integer- в стринг
//        return Integer.toString(num);
//        return String.format("%d",num);
    }

    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for(int i = 1; i < args.length; i++){
            if(min > args[i]) {
                min = args[i];
            }
        }
        return min; // требовалось сделать [10, 15, 20, 144, 352]10
    }

    public static String countingSheep(int num) {
        //Add your code here //Заданное неотрицательное целое число, например 3 , возвращает строку, Входные данные
        // всегда будут допустимыми, "1 sheep...2 sheep...3 sheep..."
        String result = "";
        for (int i = 0; i < num; i++ ) {
        result += i + 1 + " sheep...";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(doubleInteger(4));
        System.out.println(isLove(15, 20));
        System.out.println(numberToString(22));
        System.out.println(countingSheep(3));

    }
}
