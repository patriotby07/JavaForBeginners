package HW_Sergei.HW_9;

public abstract class BaseAbstract extends Worker {

    private int numberOfSubordinates;

    protected abstract int getIndex();

    public BaseAbstract(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        }else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100.0 * getIndex());
        }
    }
}
