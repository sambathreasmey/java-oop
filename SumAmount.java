public class SumAmount {
    
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    public Double sum(Double a, Double b) {
        return a + b;
    }

    public Double payroll(Salary salary) {
        return salary.getBassSalary() - salary.getTax();
    }

    public Double payroll(Salary salary, Double secondTax) {
        return salary.getBassSalary() - salary.getTax() - secondTax;
    }
}
