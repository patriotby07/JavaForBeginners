package HW_Sergei.HW_7_2;

public class Worker implements IEmployee {
    private double baseSalary;
    private String name;

    public Worker(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "baseSalary=" + baseSalary +
                ", name='" + name + '\'' +
                '}';
    }

    public double getSalary() {
        return baseSalary;
    }
}
