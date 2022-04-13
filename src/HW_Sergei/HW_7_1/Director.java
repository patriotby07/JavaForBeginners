package HW_Sergei.HW_7_1;

public class Director extends Manager {
    /**
     * Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат по формуле -
     * <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
     */

    public Director(int salary, String name, int numberOfSubordinates) {
        super(salary, name, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return super.getSalary() + (int) (super.getSalary() * (getNumberOfSubordinates() / 100.0 * 9));
        }
    }
}
