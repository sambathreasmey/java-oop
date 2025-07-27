public class Accounting {
    public static void main(String[] args) {
        SumAmount sum = new SumAmount();

        Salary staffSalary = new Salary();
        staffSalary.tax = 10.0;
        staffSalary.baseSalary = 500.0;

        Double baseSalary = sum.payroll(staffSalary);

        System.out.println("PayRoll ::: " + baseSalary);
    }
}
