package HW_Sergei.HW_9;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker(1000, "Sergey");
        Manager manager = new Manager(1000, "Anna", 0);
        Manager manager1 = new Manager(1000, "Milana", 50);
        Director director = new Director(1000, "Ivan", 20);

        Worker[] workers = {worker, manager, director};
        Manager[] managers = {manager, manager1};

        System.out.println(worker.getBaseSalary());
        System.out.println(manager.getSalary());
        System.out.println(manager1.getSalary());
        System.out.println(director.getSalary());
        System.out.println(Utils.salaryMin(workers));
        System.out.println(Utils.salaryMax(workers));
        System.out.println(Utils.salarySum(workers));
        System.out.println(Utils.findWorkerByName(workers,"Sergey"));
        System.out.println(Utils.findWorkerBySubName(workers, "An"));
        System.out.println(Utils.subMin(managers));
        System.out.println(Utils.subMax(managers));
        System.out.println("___________________");
        System.out.println(Utils.nadbMax(managers));
        System.out.println(Utils.nadbMin(managers));
        System.out.println("___________________");
        System.out.println(director.getSalary());
        System.out.println(manager1.getSalary());
    }
}
