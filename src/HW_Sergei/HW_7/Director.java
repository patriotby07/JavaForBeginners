package HW_Sergei.HW_7;

/** Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат по формуле -
 <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
 */

public class Director extends Manager {

    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        }else {
            return super.getSalary() + super.getSalary()  * (numberOfSubordinates / 100 * 9);
        }
    }
}
