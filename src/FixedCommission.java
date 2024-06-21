import java.time.LocalDate;

public class FixedCommission extends Commission
{
    // Variables
    private double fixedCommissionRate;

    // Constructor
    public FixedCommission(double FixedCommissionRate, double salary, double commissionRate, LocalDate startDate, LocalDate endDate, double managerFix, String salaryType)
    {
        super(salary, commissionRate, startDate, endDate, managerFix, salaryType);
        this.fixedCommissionRate = FixedCommissionRate;
    }

    @Override
    public double perMonthSalary()
    {
        return fixedCommissionRate + super.getSalary();
    }
}