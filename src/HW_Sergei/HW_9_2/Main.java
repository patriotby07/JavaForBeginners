package HW_Sergei.HW_9_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employees = new Employee("Sergey", 31, 'm',500);
        Manager manager = new Manager("Sergey", 31, 'm',500, 3);

        Month[] months = {
                new Month("Jan", 31, 21),
                new Month("Feb", 28, 20),
        };
        System.out.println(employees.getSalary(months));
        System.out.println(manager.getSalary(months));
        System.out.println(Arrays.deepToString(MonthUtils.Quarter(2)));
        System.out.println(Arrays.deepToString(MonthUtils.HalfYear(3)));
        System.out.println(Arrays.deepToString(MonthUtils.getYear()));

    }
}
