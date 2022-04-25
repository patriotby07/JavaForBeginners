package HW_Sergei.HW_9_2;

public final class Month {

    private String name;
    private int days;
    private int workDays;

    public  Month(String name, int days, int workDays) {
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

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", workDays=" + workDays +
                '}';
    }
}
