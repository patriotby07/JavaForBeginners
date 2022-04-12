package HW_Sergei.HW_7;

public class Main {

    public static void main(String[] args) {
    Employee employee = new Employee();

    Worker worker1 = new Worker();
    Worker worker2 = new Worker();
    Worker worker3 = new Worker();

    Manager manager1 = new Manager();
    Manager manager2 = new Manager();

    Director director = new Director();

    Utils utils = new Utils();

    worker1.setName("Oleg");
    worker1.setBaseSalary(10000);
    worker2.setName("Anna");
    worker2.setBaseSalary(10000);
    worker3.setName("Sergey");
    worker3.setBaseSalary(10000);

    manager1.setName("Ivan");
    manager1.setNumberOfSubordinates(2);
    manager1.setBaseSalary(20000);

    manager2.setName("Olga");

    director.setName("Sergey");
    director.setNumberOfSubordinates(3);
    director.setBaseSalary(30000);

        Worker[]arrayWorkers = {worker1, worker2, director};


        System.out.println(utils.nameSearch(arrayWorkers, "Anna"));
        System.out.println(utils.namePartSearch(arrayWorkers, "S"));
        System.out.println(utils.budget(arrayWorkers));

        System.out.println(manager1.getSalary());
        System.out.println(director.getSalary());
        System.out.println(manager1.getNumberOfSubordinates());
        System.out.println("_______________________");
        System.out.println(manager1.getSalary());
        System.out.println(director.getSalary());

        System.out.println(utils.minSalary(arrayWorkers));



    }
}
