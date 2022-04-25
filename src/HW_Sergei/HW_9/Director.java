package HW_Sergei.HW_9;

public final class Director extends BaseAbstract {

    private static final int INDEX = 9;

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }


    @Override
    public int getIndex() {
        return INDEX;
    }
}
