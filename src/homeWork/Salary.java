package homeWork;

/** Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray), метод должен возвращать сумму
 * зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
 */
public class Salary {

    public double getSum(Employee[] employeeArray) {
        double sum = 0;

        for (int i = 0; i < employeeArray.length ; i++) {
            sum += employeeArray[i].salary;
        }
        return sum;
    }

}
