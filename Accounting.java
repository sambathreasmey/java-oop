public class Accounting {
    public static void main(String[] args) {
        CalculateUtil sum = new CalculateUtil();

        StaffSalary staffSalary = new StaffSalary();
        staffSalary.setTax(10.0);
        staffSalary.setBaseSalary(500.0);

        Double baseSalary = sum.payroll(staffSalary);

        System.out.println("PayRoll ::: " + baseSalary);
    }
}
