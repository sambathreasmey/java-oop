public class Salary {
    private String name;
    private Double tax;
    private Double payroll;
    private Double baseSalary;

    public String getName() {
        return this.name;
    }
    public Double getTax() {
        return this.tax;
    }
    public Double getPayroll() {
        return this.payroll;
    }
    public Double getBassSalary() {
        return this.baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }
    public void setPayroll(Double payroll) {
        this.payroll = payroll;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
}