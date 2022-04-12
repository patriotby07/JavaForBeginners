package HW_Irina;

import java.util.stream.Stream;

public class HW4 {

    public static int number = 3;

    public static void task () {
        System.out.println("\u001B[31m⮮⬇⬇⬇⬇⬇ TASK # " + number + " ⬇⬇⬇⬇⬇⮯\u001B[0m");
        number++;
    }

    public static void subItem(double number) {
        System.out.print(number + " - ");

    }
    public static void main(String[] args) {

        task();

        String sosna = "Cосна";
        String dyb = "Дуб";
        String vishnia = "Вишня";
        String klen = "Клен";
        String text = "Глаза даны, чтобы видеть";
        String text1 = "Под третьим этажом находится второй этаж";
        String text2 = "Глаза даны, чтобы видеть";
        String text3 = "Под третьим этажом находится второй этаж";

        System.out.println("1 - " + ((2 == 2) && (7 == 7)));
        System.out.println("2 - " + !(15 < 3));
        System.out.println("3 - " + (sosna.equals(dyb) || vishnia.equals(klen)));
        System.out.println("4 - " + !(sosna == dyb));
        System.out.println("5 - " + ((!(15 < 3)) && (10 > 20)));
        System.out.println("6 - " +(text.equals(text2) && text1.equals(text3)));
        System.out.println("7 - " + ((6 / 2 == 3) && (7 * 5 == 20)));

        task();

        String min = "В минуте 70 секунд";
        String min1 = "В минуте 60 секунд";
        String watch = "Работающие часы показывают время";
        String watch1 = "Работающие часы показывают время";
        String tv = "Телевизор - электрический прибор";
        String tv1 = "Телевизор - электрический прибор";
        String  glass = "Стекло";
        String  tree = "Дерево";

        System.out.println("1 - " + (min.equals(min1) || watch.equals(watch1)));
        System.out.println("2 - " + (!(28 > 7) && !(300 / 5 == 60)));
        System.out.println("3 - " + (tv.equals(tv1) && glass.equals(tree)));
        System.out.println("4 - " + (!(300 < 100)) + " Жажду можно утолить водой");
        System.out.println("5 - " + (75 < 81) + " (88 == 88)");

        task();

        int andrei = 30;
        int sveta = 20;
        int natasha = 25;
        boolean result = (andrei > sveta) && (natasha > sveta);

        System.out.println("a) - " + result);

        int shelf = 1;
        int  textBook = 1;
        int  table = 0;
        int guide = 0;
        result = (shelf == textBook) || (table == guide);

        System.out.println("б) - " + result);

        int girls = 1;
        int boys = 0;
        result = (girls > boys); // лучше через If else

        System.out.println("в) - " + result);

        task();

        int age = 16;
        if ( age >= 16) {
            System.out.println("Ты смело можешь получать водительские права!");
        }else {
            System.out.println("Водительские права можно получить, только когда исполнится 16 лет.");
        }

        task();

    String petia = "Bus";
    if (petia == "NoBus") {
        System.out.println("Петя едет в автобусе");
    }else if (!("читает книгу".equals("не смотрит в окно"))) {
        System.out.println("читает книгу или не смотрит в окно");
    }

        task();

        String you = "с другом";
        if (you == "с другом"){
            System.out.println("это хорошо");
        }else {
            System.out.println("это плохо");
        }

        task();

        subItem(9.1);

        age = 12;
        if (age >= 18){
            System.out.println("Ты взрослый");
        }else if (age < 1) {
            System.out.println("Не верный возраст");
        }else{
            System.out.println("Ты - ребенок");
        }


        subItem(9.2);
        String dry = "сухая";
        String wet = "мокрая";
        String other = "Метелица";
        String clouds = "тучи";
        String earth = dry;

        if (earth == "сухая"){
            System.out.println("нет дождя");
        }else {
            System.out.println("идет дождь");
        }

        subItem(9.3);


        earth = other ;

        if (earth == "сухая"){
            System.out.println("нет дождя");
        }else if (earth == "мокрая"){
            System.out.println("идет дождь");
        }else {
            System.out.println("идет снег");
        }

        subItem(9.4);

        String sky = other;

        if (sky == "тучи"){
            System.out.println("идет дождь");
        }else {
            System.out.println("идет “слепой” дождь");
        }

        subItem(9.5);

        String today = "Пятница";

        if(today == "Суббота") {
            System.out.println("завтра воскресенье");
        }else if (today == "Пятница") {
            System.out.println("вчера был четверг");
        }else {
            System.out.println("вчера был не четверг, а завтра - не воскресенье");
        }

        subItem(9.6);

        String yes = "свинсун";
        String no = "нет";
        String cancer = no;

        if (cancer == yes){
            System.out.println("прошла вечность");
        }else {
            System.out.println("ждите дальше");
        }

        subItem(9.7);

        age = 12;
        boolean schols = false;

        if (age >= 18 || schols) {
            System.out.println("ты можешь не жить с родителями");
        }else {
            System.out.println("живи с родителями");
        }

        task();

        int a = 13;

        if ((a % 2) == 0) {
            System.out.println(a * 2);
        }else {
            System.out.println(Math.pow(a, 2)); // метод If else
        }
    }
}







