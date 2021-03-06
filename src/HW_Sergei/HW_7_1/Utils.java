package HW_Sergei.HW_7_1;

public class Utils {

    /**необходимо создать утилитарный класс со следующими методами:
     поиск сотрудника в массиве по его имени
     поиск сотрудника в массиве по вхождению указанной строки в его имени
     подсчет зарплатного бюджета для всех сотрудников в массиве
     поиск наименьшей зарплаты в массиве
     поиск наибольшей зарплаты в массиве
     поиск наименьшего количества подчиненных в массиве менеджеров
     поиск наибольшего количества подчиненных в массиве менеджеров
     поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
     поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
     *
     */

    public static Employee searchName (Employee [] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName())) {
                return employees[i];
            }
        }
        return null;
    }
    public static Employee namePartSearch (Employee [] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(name)) {
                return employees[i];
            }
        }
        return null;
    }

    public static int budget (Employee [] employees) {
        int sum = 0;

        for (int i = 0; i < employees.length; i++) {
           sum += employees[i].getSalary();

        }
        return  sum;
    }

    public static int minSalary (Employee [] employees) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return  min;
    }
    public static int maxSalary (Employee [] employees) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return  max;
    }

    public static int minSubManager (Manager[] managers) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < managers.length; i++){
            if (managers[i].getNumberOfSubordinates() < min) {
                min = managers[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    public static int maxSubManager (Manager[] managers) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < managers.length; i++){
            if (managers[i].getNumberOfSubordinates() > max) {
                max = managers[i].getNumberOfSubordinates();
            }
        }
        return max;
    }
}

