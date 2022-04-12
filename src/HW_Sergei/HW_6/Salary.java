package HW_Sergei.HW_6;

public class Salary {
    /**
     *    Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
     *    метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве
     *    аргумента вызова метода.
     */
    public int getSum (Employee[] employeeArray) {
        int result = 0;

        for (int i = 0; i < employeeArray.length; i++) {
            result += employeeArray[i].salary;
        }
        return result;
    }
}
