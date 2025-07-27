public class Adminitractor {
    public static void main(String[] args) {
        SumAmount sum = new SumAmount();

        Salary staffSalary = new Salary();
        staffSalary.setTax(120.0);
        staffSalary.setBaseSalary(490.0);

        Double balance = sum.payroll(staffSalary, 2.0);
        System.out.println("Balance ::: " + balance);
    }
}

// reusable 
// easy to manage
// follow framework