import java.util.List;

public class CalculateUtil {
    
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    public Double sum(Double a, Double b) {
        return a + b;
    }

    public Double payroll(StaffSalary salary) {
        return salary.getBassSalary() - salary.getTax();
    }

    public Double payroll(StaffSalary salary, Double secondTax) {
        return salary.getBassSalary() - salary.getTax() - secondTax;
    }

    public Double sumBaseSalary(List<StaffSalary> staffList) {
        Double totalBaseSalary = 0.0;
        for (StaffSalary staffSalary : staffList) {
            totalBaseSalary = totalBaseSalary + staffSalary.getBassSalary();
        }
        return totalBaseSalary;
    }
}
