package HW_Sergei.HW_7_1;

public class Director extends Worker {
    /**
     * Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат по формуле -
     * <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
     */
    int numberOfSubordinates;

    public Director(int salary, String name, int numberOfSubordinates) {
        super(salary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        } else {
            return super.getSalary() * (int) (super.getSalary() * (numberOfSubordinates / 100.0 * 9));
        }
    }
}
