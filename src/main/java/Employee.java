public class Employee {

    double baseSalary;
    double salary;
    String name;

    public double getBaseSalary() {
        return baseSalary;
    }

    protected double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
}

