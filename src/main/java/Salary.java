public class Salary {

    static double sum = 0;
    static double getSum(Employee[] employeeArray){

        for (int i = 0; i < employeeArray.length; i++) {
            sum = sum + employeeArray[i].salary;
        }

        return sum;
    }
}
