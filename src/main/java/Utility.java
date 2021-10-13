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
        director.setNumberOfSubordinates(1);

        Employee[] employees = new Employee[]{worker, manager, director};

        Employee foundEmployee = findEmployeeByName(employees, "Phil");
        //System.out.println(foundEmployee.getSalary());

        System.out.println(getSalaryBudget(employees));
    }
}

