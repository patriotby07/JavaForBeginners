package homeWork;

public class Igor_metod {

//overlooding

    //method name
    //number of parametrs
    // type of parametrs
    //order of parametrs if type and numder of parameters is the same

    public static int number = 1;


    public static void m1 (){
        System.out.println("Hello");
    }

    public static void m1 (int number) {
        System.out.println("Hello " + number);
    }

    public static void m1 (int aaa, int bbb, int ccc, int xxx) {
        System.out.println(aaa + bbb + ccc + xxx);
    }

    public static void task (String str, int number) {
        System.out.println("This is " + str + ": " + number);

    }
    public static void task () {
        System.out.println("This is # " + number);
        number++;
    }
    public static void main(String[] args) {
      int a = 1;
      String str = "Task #";
      task(str, a); //This is task #: 1
        System.out.println(number);
        task();
        System.out.println(number);
        task();
        task(str, 5);
    }
}
