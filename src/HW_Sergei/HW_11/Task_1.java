package HW_Sergei.HW_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_1 {

    public static void main(String[] args) {
        List<String> listOfColors = new ArrayList<>();

        listOfColors.add("White");
        listOfColors.add("Tan");
        listOfColors.add("Yellow");
        listOfColors.add("Red");
        listOfColors.add("Pink");
        listOfColors.add("Purple");
        listOfColors.add("Blue");

        Iterator<String> iterator = listOfColors.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().contains("l")) {
                iterator.remove();
            }
        }
        System.out.println(listOfColors);

//        for (int i = listOfColors.size(); --i > 0;) //вариант написания
            for (int i = listOfColors.size() - 1; i >= 0; i--) {
                if (listOfColors.get(i).contains("l")) {
                    listOfColors.remove(i);
                }
            }
        System.out.println(listOfColors);
    }
}
