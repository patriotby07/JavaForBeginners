package HW_Sergei.HW_9;

public final class Manager extends BaseAbstract {

    private static final int INDEX = 3;

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }


    @Override
    public int getIndex() {
        return INDEX;
    }
}
