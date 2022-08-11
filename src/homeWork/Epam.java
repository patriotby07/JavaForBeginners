package homeWork;

import static Utils.Utils.printArray;

public class Epam {

    static int binarySearch(int[] array, int key) {
        System.out.println("-------------binarySearch---------------");
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == key) {
                System.out.println("Key found");
                return middle;
            }

            if (array[middle] < key) {
                System.out.println("Cut left half");
                left = middle + 1;
            }

            if (array[middle] > key) {
                System.out.println("Cut right half");
                right = middle - 1;
            }
        }
        return -1;
    }

    static  void searchInArray (int[] array){
        int max = array[0];
        int maxIndex = 0;
        int comparisons = 0;
        int replacement = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
                replacement++;
            }
            comparisons++;
        }
        System.out.println("Max: " + max);
        System.out.println("MaxIndex: " + maxIndex);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacement: " + replacement);
    }

    static void bubbleSort(int[] array) {
        int comparisonsDone = 0; //количество сравнений
        int swapsDone = 0; //количество замен
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                printArray(array);
                if (array[i] > array[i + 1]) {
                    System.out.println("Swap " + array[i] + " and " + array[i + 1]);
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i+1] = temp;
                    swapsDone++;
                    sorted = false;
                }else {
                    System.out.println("No need to change elements " + i + " and " + (i + 1));
                }
                comparisonsDone++;
            }
        }
        System.out.println("Array size = " + array.length);
        System.out.println("Comparisons done = " + comparisonsDone);
        System.out.println("Swaps Done = " + swapsDone);
    }
    static void bubbleSortSmallVersion(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                int temp = array[i];
                temp = array[i];
                array[i] = array[i + 1];
                temp = array[i + 1];
            }
        }
        printArray(array);
    }


    public static void main(String[] args) {
        int[] sortedArray = {2, 8, 15, 17, 22, 32, 47, 58, 67};
        int[] bubbleArray = {15, 8, 2, 14, 99, 47, 67, 58};
//        Arrays.sort(sortedArray);
        int key = 15;
        int position = binarySearch(sortedArray, key);

        System.out.println(key + " position is " + position);

        System.out.println("-------------searchInArray---------------");
        searchInArray(sortedArray);

        System.out.println("--------------bubbleSort-----------------");
        bubbleSort(bubbleArray);

        System.out.println("---------bubbleSortSmallVersion-----------");
        bubbleSortSmallVersion(bubbleArray);

        int experience = 5;
        int requirements = 10;
        String result = (experience > requirements) ? "Accept to project" : "Learn more" ;
        System.out.println( result );
    }
}
