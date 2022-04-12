package HW_Sergei.HW_6;


public class Main {

    public static void main(String[] args) {
        Person person = new Person("Igor Klimenko", 31, "male");
        Person person1 = new Person("Maryna Shubianok", 30, "female");

        Employee employee = new Employee(person,13500);
        Employee employee1 = new Employee(person1, 15200);
        Employee employee2 = new Employee(new Person("Vasia Trus", 25, "male"), 15200);

        Employee[] employees = {employee, employee1, employee2};
        Salary salary = new Salary();

        person.getPerson();
        person1.getPerson();
        System.out.println(employee.isSameName(employee));
        System.out.println(salary.getSum(employees) + " $");
        System.out.println(new Salary().getSum(employees) + " $");
    }
}
//        person.name = "Igor Klimenko";
//        person.age = 31;
//        person.gender = "male";
//
//        person1.name = "Maryna Shubianok";
//        person1.age = 30;
//        person1.gender = "female";
//
//        employee.name = "Maryna Shubianok";
//        employee.age = 30;
//        employee.gender = "female";
//        employee.salary = 1550;