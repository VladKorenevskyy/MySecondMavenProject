import java.util.Arrays;

public class Utility {

    static Employee employee;

    static Employee findEmployeeByName(Employee[] employeeArray, String name) {

        for (int i = 0; i < employeeArray.length; i++) {
            if (name.equals(employeeArray[i].name))
                employee = employeeArray[i];
        }

        return employee;
    }

    static double getSalaryBudget(Employee[] employeeArray) {
        double totalBudget = 0;

        for (int i = 0; i < employeeArray.length; i++) {

            totalBudget = totalBudget + employeeArray[i].getSalary();
        }

        return totalBudget;
    }

    static double getMinSalary(Employee[] employeeArray) {
        double minSalary = Integer.MAX_VALUE;

        for (int i = 0; i < employeeArray.length; i++) {
            if(minSalary > employeeArray[i].getBaseSalary()) {
                minSalary = employeeArray[i].getBaseSalary();
            }
        }

        return minSalary;
    }

    static double getMaxSalary(Employee[] employeeArray) {
        double maxSalary = Integer.MIN_VALUE;

        for (int i = 0; i < employeeArray.length; i++) {
            if(maxSalary < employeeArray[i].getBaseSalary()) {
                maxSalary = employeeArray[i].getBaseSalary();
            }
        }

        return maxSalary;
    }

    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.setName("Bob");
        worker.setBaseSalary(3000);
        Manager manager = new Manager();
        manager.setName("Ann");
        manager.setBaseSalary(5000);
        manager.setNumberOfSubordinates(1);
        Director director = new Director();
        director.setName("Phil");
        director.setBaseSalary(10000);

        Employee[] employees = new Employee[]{worker, manager, director};

        Employee foundEmployee = findEmployeeByName(employees, "Phil");
        //System.out.println(foundEmployee.getSalary());
        //System.out.println(getSalaryBudget(employees));
        System.out.println(getMaxSalary(employees));
    }
}

