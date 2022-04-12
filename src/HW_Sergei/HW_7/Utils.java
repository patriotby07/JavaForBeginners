package HW_Sergei.HW_7;

/**Необходимо создать утилитарный класс со следующими методами:
 поиск сотрудника в массиве по его имени /+
 поиск сотрудника в массиве по вхождению указанной строки в его имени /+
 подсчет зарплатного бюджета для всех сотрудников в массиве /+
 поиск наименьшей зарплаты в массиве /+
 поиск наибольшей зарплаты в массиве /+
 поиск наименьшего количества подчиненных в массиве менеджеров /+
 поиск наибольшего количества подчиненных в массиве менеджеров /+
 поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров /+
 поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров /+
 */

public class Utils {

    Employee nameSearch (Employee[] employees, String name) {

        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
              return  employee;
            }
        }
        return null;
    }


    Employee namePartSearch (Employee[] employees, String namePart) {

        for (Employee employee : employees) {
            if (employee.getName().contains(namePart)) {
                return  employee;
            }
        }
        return null;
    }

    int budget (Employee [] employees) {
        int sum = 0;

        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    int minSalary (Employee [] employees) {
        int min = Integer.MAX_VALUE;

        for (Employee employee : employees) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        return min;
    }


    int maxSalary (Employee [] employees) {
        int max = Integer.MIN_VALUE;

        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    int minSubortinates (Manager[] managers) {
        int min = Integer.MAX_VALUE;

        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() < min) {
                min = manager.getNumberOfSubordinates();
            }
        }
        return min;
    }

    int maxSubortinates (Manager[] managers) {
        int max = Integer.MIN_VALUE;

        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > max) {
                max = manager.getNumberOfSubordinates();
            }
        }
        return max;
    }

    int maxBaseSalary (Manager [] managers) {
        int max = Integer.MIN_VALUE;

        for (Manager manager : managers) {
            if (manager.getSalary() - manager.getBaseSalary() > max) {
                max = manager.getSalary() - manager.getBaseSalary();
            }
        }
        return max;
    }

    int minBaseSalary (Manager [] managers) {
        int min = Integer.MAX_VALUE;

        for (Manager manager : managers) {
            if (manager.getSalary() - manager.getBaseSalary() < min) {
                min = manager.getSalary() - manager.getBaseSalary();
            }
        }
        return min;
    }
}
