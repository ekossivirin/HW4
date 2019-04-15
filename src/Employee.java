import java.util.Locale;

public class Employee implements Payable {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%s, %s, %.2f", getEmployeeId(), getName(), getAverageMonthlySalary());
    }

    @Override
    public void calculatePay() {
        System.out.println("Calculating");
    }
}
