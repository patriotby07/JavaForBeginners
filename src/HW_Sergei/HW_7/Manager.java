package HW_Sergei.HW_7;

/** Необходимо создать класс Manager в который нужно добавить следующие методы:
 getNumberOfSubordinates - получить количество подчиненных
 setNumberOfSubordinates

 *  в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
 *  Если количество подчиненных 0, то результат как у обычного рабочего.
 */

public class Manager extends Worker {
    int numberOfSubordinates;

    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        }else {
            return super.getSalary() + super.getSalary() * (numberOfSubordinates / 100 * 3);
        }
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
}
