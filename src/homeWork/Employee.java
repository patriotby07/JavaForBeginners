package homeWork;

/** Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата. Класс должен иметь
 * метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого был вызван метод и сотрудника
 * который был передан как параметр, одинаковое имя.
 */

public class Employee {

    Person person;

    String name;
    int age;
    String gender;
    double salary;

    public Employee(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    boolean isSameName(Employee employee){
        return name.equals(employee.name);
    }
}
