package HW_Sergei.HW_7_1;

public class Manager extends Worker {

    /**
     * Необходимо создать класс Manager в который нужно добавить следующие методы:
     * getNumberOfSubordinates - получить количество подчиненных
     * setNumberOfSubordinates
     * <p>
     * В классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
     * Если количество подчиненных 0, то результат как у обычного рабочего.
     */

    int numberOfSubordinates;

    public Manager(int salary, String name, int numberOfSubordinates) {
        super(salary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        } else {
            return super.getSalary() + (int) (super.getSalary() * (numberOfSubordinates / 100.0 * 3));
        }
    }
}


