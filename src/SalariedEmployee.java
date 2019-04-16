public class SalariedEmployee extends Employee {
    // TODO fix class declaration and declare variables here
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay(){
        return fixedMonthlyPayment;
    };
}
