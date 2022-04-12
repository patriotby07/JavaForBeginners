package HW_Irina;

import java.util.SortedMap;

public class HW3_1 {

    public static void main(String[] args) {

        Short short1 = 12000;
        Short short2 = 12300;
        int numberTask = 18;
        String task = " ---------- ";

        System.out.println(task + (numberTask++) + task);
        System.out.println("12000 - 12300 = " + short1.compareTo(short2));

        short1 = 12500;
        short2 = 12300;

        System.out.println("12500 - 12300 = " + short1.compareTo(short2));

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(task + (numberTask++) + task);
        System.out.println(doub1 - doub2);
        System.out.println(Double.sum(doub1,-doub2));
        System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));
        System.out.println(Float.parseFloat(str1) - Float.parseFloat(str2));
        System.out.println(Float.valueOf(str1) - Float.valueOf(str2));
        /** учтонить в чем разника если вводить это же но выбрать в скобках стринг, в чем разница двух методов?
         * т.к значение String с точкой, то и методы подходят только с точкой дабл и флоат???
         * КАК Правильно ИСКАТЬ В ОРАКЛЕ? ЕСЛИ НУЖНО ПЕРЕВЕСТИ СТРИНГ В ДАБЛ ТО ИЩЕМ МЕТОД В ДАБЛ ИЛИ СТРИНГ?
         */

        Float temp;
        temp = 37.5F;
        Float average;
        average = temp;
        temp = 35.6F;

        System.out.println(task + (numberTask++) + task);
        System.out.println(Math.round(average));

        Number n = Double.MAX_VALUE;

        System.out.println(task + (numberTask++) + task);
        System.out.println ("Переменная n может принимать значения: \n"
                + "n = " + n);

        n = 10;

        System.out.println( "n = " + n.intValue());

        n = 10.999999999;

        System.out.println("n = " + n.doubleValue() +  "\n" + "Это возможно, "
                + "потому что Number оберточный тип и включает в себя "
                    + "все числовые типы переменных.");
        /** Узнать про правило переноса лесенкой и про значение \n как его писать правильно
         */

        int value = 15;

        Integer numberInteger = 100;
        System.out.println(task + (numberTask++) + task);
        System.out.println(numberInteger.TYPE);
        System.out.println(numberInteger + value); // доказали через сложение
        System.out.println(numberInteger.toString() + value); // доказали через сложение
        System.out.println(numberInteger.getClass().getSimpleName());
        System.out.println(numberInteger.getClass());
        System.out.println(numberInteger.toString().getClass().getSimpleName());
//        String as = numberInteger.toString();
//        System.out.println(as.getClass().getSimpleName()); // вывели отдельную переменную, а не в саут

        Float tC = 36.6F;
        Float form = (tC * 9/5) + 32;
        String text = tC + " градусов(а) по Цельсию = " + Math.round(form
                * 100.0) / 100.0 + " градусов(а) по Фаренгейту.";

        System.out.println(task + (numberTask++) + task);
        System.out.println(text);
        /**Конкретно в этом случае используем Float, если это будут приемлемые для человека температуры.
         */

        Integer kg = 50;
        Integer lb = 50;
        Double formula1 = kg * 2.2046;
        Double formula2 = lb * 0.45359237;
        String translation = (kg + " kilogram = " + String.format("%.2f",
                formula1) + " lbs, " + lb + " lb = " + String.format("%.2f",
                    formula2) + " kg.");

        System.out.println(translation);
        /** В задаче круглое число без граммов и тд., значит берем Integer, если нужна с граммами берем Double.
         */
    }
}
