package HW_Irina;

public class HW4_21_Test {

    public static void main(String[] args) {
        short a = -25;
        System.out.println("Short " + a + numToWord(a) + " digit number.");
    }

    public static String numToWord (short a) {
        int num = Short.toString(a).length();
        if (num == 1) {
            return  " one";
        }if (num == 2){
            return " two";
        }if (num == 3){
            return " three";
        }if (num == 4) {
            return " four";
        }if (num == 5){
            return " five";
        }
        return null;

    }
}
