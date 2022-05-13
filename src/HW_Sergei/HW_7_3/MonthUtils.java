package HW_Sergei.HW_7_3;

public class MonthUtils {
    private static class MonthImpl implements IMonth {

        private String name;
        private int days;
        private int workDays;

        public MonthImpl(String name, int days, int workDays) {
            this.name = name;
            this.days = days;
            this.workDays = workDays;
        }

        public String getName() {
            return name;
        }

        public int getDays() {
            return days;
        }

        public int getWorkDays() {
            return workDays;
        }
    }

    private static IMonth[] MONTH_ARRAY = {
            new MonthImpl("Jan", 31, 21),
            new MonthImpl("Feb", 28, 20),
            new MonthImpl("Mar", 31, 23),
            new MonthImpl("Apr", 30, 22),
            new MonthImpl("May", 31, 21),
            new MonthImpl("Jun", 30, 22),
            new MonthImpl("Jul", 31, 22),
            new MonthImpl("Aug", 31, 22),
            new MonthImpl("Sep", 30, 22),
            new MonthImpl("Oct", 31, 21),
            new MonthImpl("Nov", 30, 22),
            new MonthImpl("Dec", 31, 23),
    };

    public static IMonth getMonth(int index) {
        return MONTH_ARRAY[index];
    }

    public static int getMonthsSize() {
        return MONTH_ARRAY.length;
    }

    public static IMonth[] getMonthArray() {
        return MONTH_ARRAY;
    }
}
