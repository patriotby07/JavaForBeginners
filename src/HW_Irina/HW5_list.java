package HW_Irina;

public class HW5_list {
    public static void main(String[] args) {
        HW5 Print = new HW5();

        Print.printNumber(2);
        System.out.println(Print.week(5));

        Print.printNumber(3);
        System.out.println("Максимальное значение = " + Print.returnMaxOfThree (5, 15, 22));

        Print.printNumber(4);
        System.out.println("Минимальное значение = " + Print.returnMinOfThree(2, 1, 4));

        Print.printNumber(5);
        System.out.println("Средняя температура вашего любимца = " + Print.tempCat(37.7, 36.8, 36.8, 39.8,
                37.8) + " ℃");

        Print.printNumber(6);
        System.out.println("Сумма к оплате: " + Print.cost(10.44));

        Print.printNumber(7);
        System.out.println("Вес товара: " + Print.weight(10.50));

        Print.printNumber(8);
        System.out.println("Сумма к оплате: " + Print.purchaseAmount(10.79, 5) + " $");

        Print.printNumber(9);
        System.out.println(Print.check("Цветочный горшок", 15.11, 3));

        Print.printNumber(10);
        System.out.println("Заработная плата = " + Print.salary(8.4,12.11) + " $");

        Print.printNumber(11);
        System.out.println("Март 2022 г." + Print.payrollStatement("Смирнов Иван Генадьевич", 124, 12.55)
                + Print.payrollStatement ("Клименко Игорь Олегович", 168,13.99));

        Print.printNumber(12);
        System.out.println(Print.task12(2));

        Print.printNumber(13);
        System.out.println("Счастливый номер = " + Print.luckyNumber(1990));
        System.out.println("Счастливый номер = " + Print.luckyNumber2(1990));

        Print.printNumber(14);
        System.out.println(Print.median(24, 3, 27));

        Print.printNumber(15);
        System.out.println("Сумма с округлением в пользу покупателя = " + Print.task15(12.01));

        Print.printNumber(16);
        System.out.println("Получаем число с округлением в большую сторону = " + Print.task16(3, 4, 20));

        Print.printNumber(17);
        int x = 15;
        int y = -15;

        if (y > 0) {
            x = 1;
        }else
            x = x;
        System.out.println("1 - " + x);

        double eval = 81;

        if (eval >= 80 && eval <= 90) {
            eval +=  5;

        }else
            eval = eval;

        System.out.println("2 - Ваша оценка: " + (int) eval);
        System.out.println("3 - item = (i >= 10 && v < 50)");

        boolean yes = true;
        boolean not = false;

        if (x > 0 && x % 2 != 0) {
            System.out.println("4 - " + yes);
        }else
            System.out.println("4 - " + not);

        if (x > 0 && y > 0) {
            System.out.println("5 - " + yes);
        }else
            System.out.println("5 - " + not);

        if (x > 0 && y > 0) {
            System.out.println("6 - " + yes);
        }else if (x < 0 && y < 0) {
            System.out.println("6 - " + yes);
        }else
            System.out.println("6 - " + not);

        Print.printNumber(18);
        System.out.println(Print.task18());

        Print.printNumber(19);
        System.out.println("Возврат случайных чисел в пределах от 1 до 99 включительно = " + Print.task19());

        Print.printNumber(20);
        System.out.println("Является ли указанный год високосным: " + Print.task20(2020));

    }
}
