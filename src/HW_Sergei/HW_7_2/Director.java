package HW_Sergei.HW_7_2;

public class Director extends Manager {

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        }else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9);
        }
    }
}
