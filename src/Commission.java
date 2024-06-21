import java.time.LocalDate;

public class Commission extends Salary
{
    // Variables
    private double commissionRate;
    private double salary;

    // Constructor
    public Commission(double salary, double commissionRate, LocalDate startDate, LocalDate endDate, double managerFix, String salaryType)
    {
        super(startDate, endDate, managerFix, salaryType);
        this.salary = salary;
        this.commissionRate = commissionRate;
    }

    // Methods
    // CommissionRate Setter
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    // Salary Setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // CommissionRate Getter
    public double getCommissionRate() {
        return commissionRate;
    }

    // Salary Getter
    public double getSalary() {
        return salary;
    }

    @Override
    public double perMonthSalary()
    {
        return commissionRate * salary;
    }
}