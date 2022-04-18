package HW_Sergei.HW_7_3;

public class MonthUtils {
    private static Month[] MONTH_ARRAY = {
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

    public static int getMonthsSize() {
        return MONTH_ARRAY.length;
    }

    public static Month[] getMonthArray() {
        return MONTH_ARRAY;
    }
}
