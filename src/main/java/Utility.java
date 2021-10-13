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

    static int getMinNumberOfSubordinates(Manager[] employeeArray) {
        int minValue = Integer.MAX_VALUE;
        String manager = "";
        for (int i = 0; i < employeeArray.length; i++) {
            if(minValue > employeeArray[i].getNumberOfSubordinates()) {

                minValue = employeeArray[i].getNumberOfSubordinates();
                manager = employeeArray[i].getName();
            }
        }
        System.out.println(manager);
        return minValue;
    }

    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.setName("Bob");
        worker.setBaseSalary(3000);
        Manager manager = new Manager();
        manager.setName("Ann");
        manager.setBaseSalary(5000);
        manager.setNumberOfSubordinates(1);
        Manager manager1 = new Manager();
        manager1.setName("Natalie");
        manager1.setBaseSalary(10000);
        manager1.setNumberOfSubordinates(6);
        Director director = new Director();
        director.setName("Phil");
        director.setBaseSalary(10000);
        director.setNumberOfSubordinates(3);

        Employee[] employees = new Employee[] {worker, manager, director};
        Manager[] managers = new Manager[] {manager1, manager};

        //Employee foundEmployee = findEmployeeByName(employees, "Phil");
        //System.out.println(foundEmployee.getSalary());
        //System.out.println(getSalaryBudget(employees));
        //System.out.println(getMaxSalary(employees));
        System.out.println(getMinNumberOfSubordinates(managers));
    }
}

