package HW_Irina;

import java.util.Arrays;
import java.util.Random;

public class HW7 {
    HW6 print = new HW6();

    public static void line1() {
        System.out.print("\u001B[33m↘⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜ PART #\u001B[0m ");
    }

    public static void line2() {
        System.out.print(" \u001B[33m⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜↙\u001B[0m");
    }

    public static void number(String number) {
        System.out.print(number);
    }

    public static void printPart(String num) {
        line1();
        number(num);
        line2();
        return;
    }

    public static String dash() {
        return " - ";
    }

    public static Double aver (int[] aver) {
        int average = 0;
        for (int i = 0; i < aver.length ; i++) {
            average += aver[i];
        }
        return (double) average /aver.length;
    }

    public static String testDouble (double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            return ("\u001B[32m" + "Pass" + "\u001b[0m");
        }else return ("\u001B[31m" + "Fail" + "\u001b[0m");
    }

    public static String miMaxAver (int[] miMaxAver) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < miMaxAver.length; i++) {
            if (miMaxAver[i] < min) {
                min = miMaxAver[i];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < miMaxAver.length; i++) {
            if (miMaxAver[i] > max) {
                max = miMaxAver[i];
            }
        }

        double averageAges = 0;
        for (int i = 0; i < miMaxAver.length; i++) {
            averageAges += miMaxAver[i];
        }
        return "Минимальное значение = " + min + "\n" + "Максимальное значение = " + max + "\n" + "Среднее значение = "
                + averageAges / miMaxAver.length;
    }

    public static void main(String[] args) {
        printPart("I");
        HW6.printTask(1);

        String[] catNames = {"Филин", "Сипуха", "Сыч", "Сова", "Гранатомет", "Бластер", "Торпеда", "Базука"};
        catNames[4] = "Рыжик";
        catNames[1] = "Черныш";
        for (int i = 0; i < catNames.length; i++) {
            System.out.print(i + dash() + catNames[i] + HW6.mark());
        }

        HW6.printTask(2);

        System.out.print("4 - " + catNames[4] + HW6.mark() + "1 - " + catNames[1]); // Узнать как можно отдельно распечатать номер элемента массива

        HW6.printTask(3);

        String[] catColors = {"Серый", "Последний вздох жако", "Маркизы Помпадур", "Сюрприз дофина", "Рыжий", "Парижской грязи",
                "Лягушки в обмороке", "Испуганной мыши",};

        for (int i = 0; i < catNames.length; i++) {
            System.out.print(i + dash() + catColors[i] + HW6.mark());
        }

        HW6.printTask(4);

        int[] catsAges = {1, 12, 10, 2, 8, 7, 13, 9};
        for (int i = 0; i < catNames.length; i++) {
            System.out.print(catsAges[i] + HW6.mark());
        }

        HW6.printTask(5);

        boolean[] isCatRed = {false, false, false, false, true, false, false, false};
        for (int i = 0; i < isCatRed.length; i++) {
            isCatRed[i] = catColors[i].equals("Рыжий");
        }
        System.out.print(Arrays.toString(isCatRed));

        HW6.printTask(6);

        System.out.println(catNames[6]);
        System.out.println(catNames[0] + HW6.mark() + catNames[2] + HW6.mark() + catNames[4] + HW6.mark() + catNames[6]);
        System.out.println(catNames[0] + HW6.mark() + catNames[4] + HW6.mark());
        System.out.println(catColors[1] + HW6.mark() + catColors[3] + HW6.mark() + catColors[5] + HW6.mark() + catColors[7]);
        System.out.print(catColors[0] + HW6.mark() + catColors[3] + HW6.mark() + catColors[6] + HW6.mark());

        HW6.printTask(7);

        for (int i = 0; i < catColors.length; i++) {
            if (catColors[i].equals("Серый")) {
                System.out.print(i + dash() + "Накорми Кота" + HW6.mark());
            } else
                System.out.print(i + dash() + "Не серый!" + HW6.mark());
        }

        HW6.printTask(8);

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.print(i + dash() + "Отнеси кота на прививку!");
            }
        }

        HW6.printTask(9);

        System.out.print("Имя - " + catNames[7] + HW6.mark() + "Цвет - " + catColors[7] + HW6.mark() + "Возраст - "
                + catsAges[7] + " лет");

        HW6.printTask(10);

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > 2) {
                System.out.print(i + dash() + catNames[i] + HW6.mark());
            }
        }

        HW6.printTask(11);

        for (int i = 0; i < catNames.length; i++) {
            if (isCatRed[i] && catNames[i].equals("Рыжик")) {
                System.out.print(i + dash() + "Накорми кота!");
                System.out.println();
            }
        }

        System.out.println();
        printPart("II");
        HW6.printTask(12);

        double averageAges = 0;
        for (int i = 0; i < catsAges.length; i++) {
            averageAges += catsAges[i];
        }
        System.out.print("Средний возраст = " + averageAges / catsAges.length + " лет");

        HW6.printTask(13);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < min) {
                min = catsAges[i];
            }
        }
        System.out.print("Возраст самого молодого кота = " + min + " год");

        HW6.printTask(14);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > max) {
                max = catsAges[i];
            }
        }
        System.out.print("Возраст самого старого кота = " + max + " лет");

        HW6.printTask(15);

        int counter = 0;
        for (int i = 0; i < catColors.length; i++) {
            if (catColors[i].equals("Серый")) {
                counter++;
                System.out.print("Количество серых котов = " + counter);
            }
        }

        HW6.printTask(16);
        for (int i = 0; i < catNames.length; i++) {
            if (i % 2 == 0 && catsAges[i] < 3) {
                System.out.print(i + dash() + catNames[i]);
            }
        }

        HW6.printTask(17);  // V_1


        int[] arrays = new int [20];   //как решить проблему заполнения массива? Если указать длину массива 10, то он дальше идет печатать!!!
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i * 2;
            System.out.print(arrays[i] + HW6.mark());
        }

        HW6.printTask(17); // V_2

        int[] arr = new int [20];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
          if (k > 10) {
              k = 0;
          }
          arr[i] = k;
          k += 2;
        }
        System.out.print(Arrays.toString(arr));

        HW6.printTask(17); // V_3

        int index = 0;
        int end = 10;
        for (int i = 0; i <= end; i++) {
            if (i % 2 == 0)
                index++;
            }

        int[] arrEvenPos = new int[index];
        int j = 0;
        for (int i = 0; i <= end; i++) {
            if (i % 2 == 0) {
                arrEvenPos[j] = i;
                j++;
            }
        }
        System.out.print(Arrays.toString(arrEvenPos));

        HW6.printTask(18);
        System.out.println("Среднее значение = " + aver(catsAges));

        System.out.println("Позитивное тестирование = " + testDouble(7.75, aver(catsAges)));
        int[] catsAges1 = {10, 12, 10, 2, 8, 7, 13, 9};
        System.out.print("Негативное тестирование = " + testDouble(7.75, aver(catsAges1)));

        HW6.printTask(19); // V_1

        int[] odd = new int[60];
        int d = - 1000;
        for (int i = 0; i < odd.length ; i++) {
            if (d < -999 || d > -900) {
                d = -999;
            }
            odd[i] = d;
            d +=  2;
        }
            System.out.print(Arrays.toString(odd));

        HW6.printTask(19); // V_2

        int start = -1000;
        int enD = -900;
        int array = (Math.abs(start) - Math.abs(enD)) / 2;
        int[] arrayOdd = new  int[array];
        int c = start + 1;

        for (int i = 0; i < arrayOdd.length; i++) {
            arrayOdd[i] = c;
            c += 2;
        }
        System.out.print(Arrays.toString(arrayOdd));

        HW6.printTask(19); // V_3

        int start1 = -1000;
        int enD1 = -900;
        int[] arrayOdd1 = new int[50];
        for (int i = 0; i < arrayOdd1.length; i++) {
            arrayOdd1[i] = start1 + 1;
            start1 += 2;
        }
        System.out.print(Arrays.toString(arrayOdd1));

        HW6.printTask(20);

        Random r = new Random();

        int[] random = new int[10];

        for (int i = 0; i < random.length; i++) {
//            random[i] = ((int)(Math.random() * 10) + 1); // вместо этого можно использовать метод nextInt!!!!!
            random[i] = r.nextInt(10) + 1;
            System.out.print(random[i] + HW6.mark());
        }

        System.out.println();

        System.out.println();
        printPart("III");
        HW6.printTask(21);

        System.out.print(miMaxAver(random)); //как вывести random[i] сюда, за пределы цикла????????

        HW6.printTask(22);
//        int [] evenOdd = new int[random];
//
//        for (int i = 0; i < random.length; i++) {
//            if (random[i] % 2 == 0){
//                random[i] = even;
//
//            }else if (random[i] % 2 != 0) {
//                random[i] = odd1;
//                System.out.println(Arrays.toString(even) + Arrays.toString(odd1));
//            }
//        }
        int [] num =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int oddCount = 0, evenCount = 0;
        int oddPos = 0, evenPos = 0;
        //get the count of each type
        for (int i = 0; i < num.length; i++){
            if (num[i] % 2 == 0)
                oddCount++;
            else
                evenCount++;
        }
        //define arrays in correct sizes
        int [] odd1 = new int[oddCount];
        int [] even = new int[evenCount];
        //put values in arrays
        for (int i = 0; i < num.length; i++){
            if (num[i] % 2 == 0) {
                even[evenPos] = num[i];
                evenPos++;
            } else {
                odd[oddPos] = num[i];
                oddPos++;

            }
        }

    }
}
