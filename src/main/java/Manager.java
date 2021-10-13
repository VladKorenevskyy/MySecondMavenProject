public class Manager extends Employee{

    int numberOfSubordinates = 0;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary() {
        if(numberOfSubordinates == 0) {

            return baseSalary;
        } else

        return baseSalary + (baseSalary * numberOfSubordinates * 0.03);
    }
}
