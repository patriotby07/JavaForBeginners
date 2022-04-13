package HW_Sergei.HW_7_1;

public class Employee {

    /**Необходимо создать класс Employee со следующими методами:
     getBaseSalary - получить базовую ставку
     set Base Salary
     getName - получить имя
     setName
     getSalary - получить зарплату
     */
//    private int baseSalary;
    private int salary;
    private String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
//    public void setBaseSalary(int baseSalary) {
//        this.baseSalary = baseSalary;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getBaseSalary() {
//        return baseSalary;
//    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
