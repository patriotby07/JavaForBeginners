package homeWork;


public class SalaryTest {

    public static void main(String[] args) {
        Employee[] employee = new Employee[3];

        Employee john = new Employee("John Doe", 30, "male", 200);
        Employee jone = new Employee("Jone Doe", 30, "female", 200);
        Employee vasia = new Employee("Vasia Terkin", 39, "male", 200);

        employee[0] = john;
        employee[1] = vasia;
        employee[2] = jone;

        Employee[] e = {john, jone, vasia};

        Salary salary = new Salary();
        System.out.println("sum of salaries = " + salary.getSum(employee));
        System.out.println("sum of salaries e = " + salary.getSum(e));

    }
}
