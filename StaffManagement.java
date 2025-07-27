import java.util.ArrayList;
import java.util.List;

public class StaffManagement {
    public static void main(String[] args) {
        StaffSalary staff1 = new StaffSalary();
        staff1.setName("Sokha");
        staff1.setTax(12.0);
        staff1.setBaseSalary(300.0);

        StaffSalary staff2 = new StaffSalary();
        staff2.setName("Bopha");
        staff2.setTax(10.0);
        staff2.setBaseSalary(350.0);
        
        StaffSalary staff3 = new StaffSalary();
        staff3.setName("Chanty");
        staff3.setTax(7.0);
        staff3.setBaseSalary(650.0);

        List<StaffSalary> staffList = new ArrayList<StaffSalary>();
        staffList.add(staff1);
        staffList.add(staff2);
        staffList.add(staff3);
        
        CalculateUtil calculateUtil = new CalculateUtil();
        System.out.println(calculateUtil.sumBaseSalary(staffList));
    }
}
