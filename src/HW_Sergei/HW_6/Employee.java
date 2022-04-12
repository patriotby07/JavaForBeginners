package HW_Sergei.HW_6;

public class Employee {

    Person person;

    int salary;

    public Employee(Person person, int salary) {
        this.person = person;
        this.salary = salary;
    }

    public Employee (Person person) {
        this.person = person;
    }

    boolean isSameName (Employee employee) {
//    if (person.name.equals(employee.person.name)) {
//        return true;
//    }else {
//        return false;
//    }
        return person.name.equals(employee.person.name);
    }
}
