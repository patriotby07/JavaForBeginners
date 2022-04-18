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

    public static int[] task21 (int[] array) {

        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int aver;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < mini) {
                mini = array[i];
            }
            if (array[i] > maxi) {
                maxi = array[i];
            }
            sum += array[i];
        }
        aver = sum / array.length;

        int[] arr = {mini, maxi, aver};

        return arr;
    }

    public static void main(String[] args) {
        printPart("I");
        HW6.printTask(1);

        String[] catNames = {"Филин", "Сипуха", "Мурзик", "Сова", "Гранатомет", "Бластер", "Торпеда", "Базука"};
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

        String [] converted = new String[catsAges.length];
        for (int i = 0; i < catsAges.length; i++) {
            converted[i] = String.valueOf(catsAges[i]);
        }

        String[] catsAgesString = {"1", "12", "10", "2", "8", "7", "13", "9"};

        for (int i = 0; i < catNames.length; i++) {
            System.out.print(catsAges[i] + HW6.mark());
        }

        HW6.printTask(5);
        int a = 0;
        for (int i = 0; i < catColors.length ; i++) {
            a++;
            System.out.print(a + HW6.mark());
        }
        System.out.println();

        boolean[] isCatRed = new boolean[a];
        for (int i = 0; i < a; i++) {
//            catColors[i].equals(String.valueOf(Colors.RED)); //метод enum
            if (catColors[i].equals("Рыжий")) {
                System.out.println(isCatRed[i] = true);
            }else  {
                System.out.println(isCatRed[i] = false);
            }
        }
        System.out.print(Arrays.toString(isCatRed));

//        boolean[] isCatRedd = {false, false, false, false, true, false, false, false};
//        for (int i = 0; i < isCatRedd.length; i++) {
//            isCatRedd[i] = catColors[i].equals("Рыжий");
//        }
//        System.out.print(Arrays.toString(isCatRedd));

        HW6.printTask(6);

        System.out.println(catNames[6]);

        for (int i = 0; i < catNames.length; i++) {
            if (i % 2 == 0) {
               System.out.print(i + dash() + catNames[i] + HW6.mark());
            }
        }
        System.out.println();

        for (int i = 0; i < catNames.length; i++) {
            if (i % 4 == 0) {
                System.out.print(i + dash() + catNames[i] + HW6.mark());
            }
        }
        System.out.println();

        for (int i = 0; i < catColors.length; i++) {
            if (i % 2 != 0) {
                System.out.print(i + dash() + catColors[i] + HW6.mark());
            }
        }
        System.out.println();

        for (int i = 0; i < catColors.length; i++) {
            if (i % 3 == 0) {
                System.out.print(i + dash() + catColors[i] + HW6.mark());
            }
        }

        HW6.printTask(7);

        for (int i = 0; i < catColors.length; i++) {
            if (catColors[i].equals("Серый")) {
                System.out.print(i + dash() + "Накорми Кота!" + HW6.mark());
            } else
                System.out.print(i + dash() + "Не серый!" + HW6.mark());
        }

        HW6.printTask(8);

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.print(i + dash() + "Отнеси кота на прививку!");
            }else if (catsAges[i] < 0 || catsAges[i] > 50) {
                System.out.println("EROR");
            }
        }

        HW6.printTask(9);
        for (int i = 0; i < catNames.length ; i++) {
            if (catNames.length == catColors.length && catNames.length == catsAges.length) {
                if (i == (catNames.length - 1)) {
                    System.out.print("Имя - " + catNames[i] + HW6.mark() + "Цвет - " + catColors[i] + HW6.mark()
                            + "Возраст - " + catsAges[i] + " лет");
                }
            }
        }

        HW6.printTask(10);

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > 2) {
                System.out.print(i + dash() + catNames[i] + HW6.mark());
            }
        }

        HW6.printTask(11);
        if (catNames.length == isCatRed.length && catNames.length != 0) {
            for (int i = 0; i < catNames.length; i++) {
                if (isCatRed[i] == true && catNames[i].equals("Рыжик")) {
                    System.out.print(i + dash() + "Накорми кота!");
                    System.out.println();
                }
            }
        }

        System.out.println();
        printPart("II");
        HW6.printTask(12);

        double averageAges = 0;
        for (int i = 0; i < catsAges.length; i++) {
            averageAges += catsAges[i];
        }
        System.out.printf("%.2f%n",averageAges / catsAges.length); // формат запятой!
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
            }
        }
        System.out.print("Количество серых котов = " + counter);

        HW6.printTask(16);

        for (int i = 0; i < catNames.length; i++) {
            if (i % 2 == 0 && catsAges[i] < 3) {
                System.out.print(i + dash() + catNames[i]);
            }
        }

        HW6.printTask(17);  // V_1

        int task17 = 0;
        for (int i = 0; i < 11 ; i++) {
            if (i % 2 == 0) {
                task17 ++;
            }
        }
        System.out.print("Количество индексов = " + task17);
        System.out.println();

        int[] arrays = new int [task17];
        int numb = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (numb >= 0 && numb < 11 && numb % 2 == 0){
                arrays[i] = numb;
                numb += 2;
            }
        }
        System.out.print(Arrays.toString(arrays));

        // умножение индекса i
        int[] arrays1 = new int [task17];
        for (int i = 0; i < arrays1.length; i++) {
            if (i >= 0 && i < 11 && i % 2 == 0) {
                arrays[i] = i * 2;
            }
        }
        System.out.print(Arrays.toString(arrays));


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

        int task19 = 0;
        for (int i = -1000; i < -900 ; i++) {
            if (i % 2 != 0) {
                task19 ++;
            }
        }
        System.out.print(task19);

        int[] arrayodd = new int[task19];
        int q = 0;
        for (int i = 0; i < arrayodd.length; i++) {
            arrayodd[i] = i - 999 + q;
            q++;
        }
        System.out.print(Arrays.toString(arrayodd));

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
        System.out.println();
        System.out.print(Arrays.toString(task21(random)));

        HW6.printTask(22);

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < random.length; i++){
            if (random[i] % 2 == 0) {
                evenCount++;
            }else
                oddCount++;
        }

        int [] odd1 = new int[oddCount];
        int [] even = new int[evenCount];
        int indexEven = 0;
        int indexOdd = 0;

        for (int i = 0; i < random.length; i++){
            if (random[i] % 2 == 0 && indexEven < even.length) {
                even[indexEven] = random[i];
                indexEven++;
            } else if (indexOdd < odd1.length) {
                odd1[indexOdd] = random[i];
                indexOdd++;
            }
        }
        System.out.println(Arrays.toString(random));
        System.out.println(evenCount);
        System.out.println(oddCount);
        System.out.println(Arrays.toString(even));
        System.out.print(Arrays.toString(odd1));

        HW6.printTask(22);

        int chet = 0;
        int nechet = 0;

        for (int i = 0; i < random.length ; i++) {
            if (random[i] % 2 == 0) {
                chet++;
            }else
                nechet++;
        }

        int[] masChet = new int[chet];
        int[] masNechet = new int[nechet];
        int indexChet = 0;
        int indexNechet = 0;

        for (int i = 0; i < random.length; i++) {
            if (random[i] % 2 == 0) {
                masChet[indexChet] = random[i];
                indexChet++;
            } else {
                masNechet[indexNechet] = random[i];
                indexNechet++;
            }
        }
        System.out.println(Arrays.toString(random));
        System.out.println(chet);
        System.out.println(nechet);
        System.out.println(Arrays.toString(masChet));
        System.out.print(Arrays.toString(masNechet));

        HW6.printTask(23);

        String[][] catData1 = {catNames, converted, catColors};
        String sum = "";

            for (int l = 0; l < catData1[0].length; l++) {
                if (l % 2 == 0) {
                    for (int i = 0; i < catData1.length; i++) {
                        sum += catData1[i][l] + "\n";
                    }
                }
            }

        System.out.print(sum);

        HW6.printTask(23);
        String[][] catData = new String[3][8];

        for (int i = 0; i < catData.length; i++) {
            for (int l = 0; l < catData[0].length; l++) {
                if (i == 0) {
                    catData[i][l] = catNames[l];
                }else if (i == 1) {
                    catData[i][l] = converted[l];
                }else {
                    catData[i][l] = catColors[l];
                }
            }
        }
        System.out.print(Arrays.deepToString(catData));
        System.out.println();

        for (int i = 0; i < catData.length ; i++) {
            for (int f = 0; f < catData[0].length ; f++) {
                if (f % 2 == 0) {
                    System.out.println(Arrays.toString(new String[]{catData[i][f]}));
                }
            }
        }

//        for (int l = 0; l < catData1[0].length; l++) {
//            if (l % 2 == 0) {
//                for (int i = 0; i < catData1.length; i++) {
//                    sum += catData1[i][l] + "\n";
//                }
//            }
//        }
//
//        System.out.print(sum);

        HW6.printTask(24);

        int[][] task24 = new int[4][8];

        for (int i = 0; i < task24.length; i++) {
            for (int l = 0; l < task24[i].length; l++) {
                task24[i][l] = r.nextInt(10) + 1;

            }
        }
        System.out.print(Arrays.deepToString(task24));

        HW6.printTask(25);

        int summ = 0;

        for (int i = 0; i < task24.length; i++) {
            for (int l = 0; l < task24[i].length; l++) {
                if (task24[i][l] % 2 == 0) {
                    summ += task24[i][l];
                }
            }
        }

        System.out.println("Cумма всех четных чисел массива = " + summ);
        System.out.println(Arrays.deepToString(task24));
    }
}
