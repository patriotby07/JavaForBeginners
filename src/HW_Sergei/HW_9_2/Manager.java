package HW_Sergei.HW_9_2;

public final class Manager extends BaseEmployee {

    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, double salary, int numberOfSubordinates) {
        super(name, age, gender, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            if (numberOfSubordinates == 0) {
                result += getSalary() * monthArray[i].getWorkDays();
            } else
                result += ((getSalary() * monthArray[i].getWorkDays()) * (numberOfSubordinates * 0.01)
                        + (getSalary() * monthArray[i].getWorkDays()));
        }
        return result;
    }
}
