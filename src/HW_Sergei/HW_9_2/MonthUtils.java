package HW_Sergei.HW_9_2;

public class MonthUtils {
    private final static Month[] MONTH_ARRAY = {
            new Month("Jan", 31, 21),
            new Month("Feb", 28, 20),
            new Month("Mar", 31, 23),
            new Month("Apr", 30, 22),
            new Month("May", 31, 21),
            new Month("Jun", 30, 22),
            new Month("Jul", 31, 22),
            new Month("Aug", 31, 22),
            new Month("Sep", 30, 22),
            new Month("Oct", 31, 21),
            new Month("Nov", 30, 22),
            new Month("Dec", 31, 23),
    };

    public static Month getMonth(int index) {
        return MONTH_ARRAY[index];
    }

    public static Month[] Quarter(int index) {
       if (index == 1) {
           return new Month[]{MONTH_ARRAY [0], MONTH_ARRAY [1], MONTH_ARRAY[2]};
       }else if (index == 2) {
           return new Month[]{MONTH_ARRAY [3], MONTH_ARRAY [4], MONTH_ARRAY[5]};
       }else if (index == 3) {
           return new Month[]{MONTH_ARRAY [6], MONTH_ARRAY [7], MONTH_ARRAY[8]};
       }else if (index == 4) {
           return new Month[]{MONTH_ARRAY [9], MONTH_ARRAY [10], MONTH_ARRAY[11]};
       }else {
           return new Month[]{};
       }
    }

    public static Month[] HalfYear(int index) {
        if (index == 1) {
            return new Month[]{MONTH_ARRAY [0], MONTH_ARRAY [1], MONTH_ARRAY[2], MONTH_ARRAY [3], MONTH_ARRAY [4], MONTH_ARRAY[5]};
        }else if (index == 2) {
            return new Month[]{MONTH_ARRAY [6], MONTH_ARRAY [7], MONTH_ARRAY[8],MONTH_ARRAY [9], MONTH_ARRAY [10], MONTH_ARRAY[11]};
        }else {
            return new Month[]{};
        }
    }
    public static Month[] getYear(){

        return MONTH_ARRAY;
    }


    public static int getMonthsSize() {
        return MONTH_ARRAY.length;
    }

    public static Month[] getMonthArray() {
        return MONTH_ARRAY;
    }
}

//   private static final Month JAN = new Month("Jan", 31, 21);  // ВАРИАНТ СЕРГЕЯ
//            private static final Month FEB = new Month("Feb", 28, 20);
//            private static final Month MAR = new Month("Mar", 31, 23);
//            private static final Month APR = new Month("Apr", 30, 22);
//            private static final Month MAY = new Month("May", 31, 21);
//            private static final Month JUN = new Month("Jun", 30, 22);
//            private static final Month JUL = new Month("Jul", 31, 22);
//            private static final Month AUG = new Month("Aug", 31, 22);
//            private static final Month SEP = new Month("Sep", 30, 22);
//            private static final Month OCT = new Month("Oct", 31, 21);
//            private static final Month NOV = new Month("Nov", 30, 22);
//            private static final Month DEC = new Month("Dec", 31, 23);
//
//
//    public static final Month [] YEAR = {
//            JAN , FEB, MAR, APR,MAY, JUN, JUL, AUG, SEP, OCT, NOV,DEC
//    };
