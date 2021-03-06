package HW_Sergei.HW_7_1;

public class Main {

    /**Необходимо создать утилитарный класс со следующими методами:
     поиск сотрудника в массиве по его имени
     поиск сотрудника в массиве по вхождению указанной строки в его имени
     подсчет зарплатного бюджета для всех сотрудников в массиве
     поиск наименьшей зарплаты в массиве
     поиск наибольшей зарплаты в массиве
     поиск наименьшего количества подчиненных в массиве менеджеров
     поиск наибольшего количества подчиненных в массиве менеджеров
     поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
     поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
     */
    public static void main(String[] args) {

        Worker worker = new Worker(2000, "Vasia");
        Worker worker1 = new Worker(2000, "Igor");

        Manager manager = new Manager(5000, "Oleg", 2);
        Manager manager1 = new Manager(5000, "Petia",2);

        Director director = new Director(10000, "Sergei", 3);

        Employee[] employees = {worker, worker1, manager, manager1, director};
        Manager[] managers = {manager, manager1};


        System.out.println(Utils.searchName(employees, "Vasia"));
        System.out.println(Utils.namePartSearch(employees,"I"));
        System.out.println("Budget = " + Utils.budget(employees));
        System.out.println("MinSalary = " + Utils.minSalary(employees));
        System.out.println("MaxSalary = " + Utils.maxSalary(employees));
        System.out.println("MinSubManager = " + Utils.minSubManager(managers));
        System.out.println("MaxSubManager = " + Utils.maxSubManager(managers));

        System.out.println("SalaryManager = " + manager.getSalary());
        System.out.println("SalaryDirector = " + director.getSalary());

    }
}
