package HW_Sergei.HW_7_3;

public class Manager extends Employee{

    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, double salary, int numberOfSubordinates) {
        super(name, age, gender, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(IMonth[] monthArray) {
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
