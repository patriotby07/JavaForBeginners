package HW_Sergei.HW_7_2;

public class Utils {

    public static IEmployee findWorkerByName (IEmployee[] workers, String name) {
        for (int i = 0; i < workers.length; i++) {
            if (name.equals(workers[i].getName())) {
                return workers[i];
            }
        }
        return null;
    }

    public static IEmployee findWorkerBySubName (IEmployee[] workers, String subName) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(subName)) {
                return workers[i];
            }
        }
        return null;
    }

    public static double salarySum (IEmployee[] workers) {
        double sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        return sum;
    }

    public static double salaryMin (IEmployee[] workers) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() < min) {
                min = workers[i].getSalary();
            }
        }
        return min;
    }

    public static double salaryMax (IEmployee[] workers) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() > max) {
                max = workers[i].getSalary();
            }
        }
        return max;
    }

    public static int subMin (IManager[] managers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() < min) {
                min = managers[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    public static int subMax (IManager[] managers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() > max) {
                max = managers[i].getNumberOfSubordinates();
            }
        }
        return max;
    }

    public static double nadbMax (IManager[] managers) {
        double max = 0;
        for (int i = 0; i < managers.length; i++) {
            max = Utils.salaryMax(managers) - managers[i].getBaseSalary();
        }
        return max;
    }

    public static double nadbMin (IManager[] managers) {
        double min = 0;
        for (int i = 0; i < managers.length; i++) {
            min = Utils.salaryMin(managers) - managers[i].getBaseSalary();
        }
        return min;
    }
}
