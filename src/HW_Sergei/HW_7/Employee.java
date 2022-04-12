package HW_Sergei.HW_7;

/** Необходимо создать класс Employee со следующими методами:
 getBaseSalary - получить базовую ставку
 setBaseSalary
 getName - получить имя
 setName
 getSalary - получить зарплату
 *
 */
public class Employee {

    private int baseSalary = 10000;
    private int salary;
    private String name;


    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getSalary () {
        return baseSalary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "baseSalary=" + baseSalary +
                ", name='" + name + '\'' +
                '}';
    }
}
