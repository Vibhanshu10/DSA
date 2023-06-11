package ArrayRecursion;
public class salary {
   
    public static double[] calculateTax(double[] salaries, int index) {
        if (index >= salaries.length) {
            return new double[0];
        }
        double tax = salaries[index] * 0.1;
        double newSalary = salaries[index] + tax;
        double[] remainingSalaries = calculateTax(salaries, index + 1);
        double[] updatedSalaries = new double[remainingSalaries.length + 1];
        updatedSalaries[0] = newSalary;
        System.arraycopy(remainingSalaries, 0, updatedSalaries, 1, remainingSalaries.length);
        return updatedSalaries;
    }
        public static void main(String[] args) {
        double[] salaries = {1000.0, 2000.0, 3000.0, 4000.0};
        double[] updatedSalaries = calculateTax(salaries, 0);
        for (double salary : updatedSalaries) {
            System.out.println(salary);
        }
    }
}




