package HW_Sergei.HW_7_3;

public class Main {
    public static void main(String[] args) {
        Employee employees = new Employee("Sergey", 31, 'm',500);
        Manager manager = new Manager("Sergey", 31, 'm',500, 3);

        IMonth[] months = {
                MonthUtils.getMonth(1),
                MonthUtils.getMonth(2)
        };

        System.out.println(employees.getSalary(months));
        System.out.println(manager.getSalary(months));
    }
}
