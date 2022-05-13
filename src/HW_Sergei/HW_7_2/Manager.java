package HW_Sergei.HW_7_2;

public class Manager extends Worker implements IManager{

    private int numberOfSubordinates;

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        }else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3);
        }
    }
}
