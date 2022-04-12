package HW_Irina;

public class HW2 {

    public static void main(String[] args) {

        int k = 5;
        int l = 10;
        int m = 15;
        int sumKL = k + l;
        int multKM = k * m;
        int subLM = l - m;
        int devKL = k / l;
        int devKM = k / m;
        int devKK = k / k;
        int devLM = l / m;
        int devLK = l / k;
        int devLL = l / l;
        int devMK = m / k;
        int devML = m / l;
        int devMM = m / m;

        System.out.println(" --------- # 12 ---------");
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(" --------- # 13 ---------");
        System.out.println("" + k + " " + l + " " + m);
        System.out.println(" --------- # 14 ---------");
        System.out.println("" + k + "," + l + "," + m);
        System.out.println(" --------- # 15 ---------");
        System.out.println("k = " + k + ";");
        System.out.println("l = " + l + ";");
        System.out.println("m = " + m + ";");
        System.out.println(" --------- # 16 ---------");
        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k * m = " + multKM);
        System.out.println("Разность переменных l и m = " + subLM);
        System.out.println(" --------- # 17 ---------");
        System.out.println("Результат деления k на l = " + devKL + ","
                + " а остаток от деления = " + (k % l));
        System.out.println("Результат деления k на m = " + devKM + ","
                + " а остаток от деления = " + (k % m));
        System.out.println("Результат деления k на k = " + devKK + ","
                + " а остаток от деления = " + (k % k));
        System.out.println("Результат деления l на m = " + devLM + ","
                + " а остаток от деления = " + (l % m));
        System.out.println("Результат деления l на k = " + devLK + ","
                + " а остаток от деления = " + (l % k));
        System.out.println("Результат деления l на l = " + devLL + ","
                + " а остаток от деления = " + (l % l));
        System.out.println("Результат деления m на k = " + devMK + ","
                + " а остаток от деления = " + (m % k));
        System.out.println("Результат деления m на l = " + devML + ","
                + " а остаток от деления = " + (m % l));
        System.out.println("Результат деления m на m = " + devMM + ","
                + " а остаток от деления = " + (m % m));

        int apple = 100;
        int student = 21;
        int devAppleStudent = apple / student;
        int mod = apple % student;

        System.out.println(" --------- # 18 ---------");
        System.out.println("Если " + apple + " яблок поделить на " + student
                + " ученика(ов), " + "то каждый ученик получит по "
                    + devAppleStudent + " яблок(а), и "
                        + mod + " яблок(а) останется учителю.");

        int sumKLM = k + l + m;
        int sumLKM = l + k + m;
        m++;
        sumKLM--;

        System.out.println(" --------- # 19 ---------");
        System.out.println("Вычисление m++ = " + m);
        System.out.println("Вычисление сумму чисел k, l, m++ = " + (k + l + m));
        System.out.println("Вычисление sumKLM-- = " + sumKLM);
        System.out.println("Итоговый результат = " + ((k +l + m) + (sumKLM)));
        System.out.println("Вычисление sumLKM = " + sumLKM);
        System.out.println("Итоговый результат = " + (m - sumLKM));

        System.out.println(" --------- # 20 ---------");

        String text = "Является ли число четным: ";

        System.out.println("Является ли число кратным = " + 48 % 8);
        System.out.println(text + 48 % 2);
        System.out.println(text + 8 % 2);
        System.out.println(text + 47 % 2);
        System.out.println(text + 49 % 2);

        double x = 2;
        double y = 3;
        double a = k;
        double b = l;
        double c = m;
        double d = y - x;
        double result21 = (x + 3) * (x + 3);
        double result21v2 = Math.pow(x + 3, 2);
        double result22 = (((3 + (4 * x))/ 5) - ((10 * (y - 5) * (a + b + c))
                / x) + 9 * ((4 / x) + (9 + x) / y));
        double result23 = (((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y)
                / (x + y))) / (a + b + c / d + (a + b) / (c + d) + a * b);
        result23 = Math.round(result23 * 1000000.0) / 1000000.0;

        //String result = String.format("%.6f",result23);
        System.out.println();
        System.out.println(" --------- # 21 ---------");
        System.out.println(result21);
        System.out.println(result21v2);
        System.out.println(" --------- # 22 ---------");
        System.out.println(result22);
        System.out.println(" --------- # 23 ---------");
        System.out.println(result23);
        System.out.println(" --------- # b ---------");
        System.out.println("------------------------");
        System.out.println("|  task  |    result   |");
        System.out.println("------------------------");
        System.out.println("|   21   |" + "   "+ result21 + "      |");
        System.out.println("------------------------");
        System.out.println("|   22   |" + "   "+ result22 + "     |");
        System.out.println("------------------------");
        System.out.println("|   23   |" + "   "+ result23 + "  |");
        System.out.println("------------------------");
    }
}
