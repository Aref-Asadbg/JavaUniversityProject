import java.time.LocalDate;

public class Fixed extends Salary
{
    // Variables
    private double fixedSalary;

    // Constructor
    public Fixed(double perHourSalary, LocalDate startDate, LocalDate endDate, double managerFix, String salaryType)
    {
        super(startDate, endDate, managerFix, salaryType);
        this.fixedSalary = fixedSalary;
    }

    // Methods
    // FixedSalary Setter
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    // FixedSalary Getter
    public double getFixedSalary() {
        return fixedSalary;
    }

    @Override
    public double perMonthSalary()
    {
        return fixedSalary;
    }
}