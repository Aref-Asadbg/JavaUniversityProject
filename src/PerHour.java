import java.time.LocalDate;

public class PerHour extends Salary
{
    // Variables
    private double perHourSalary;

    // Constructor
    public PerHour(double perHourSalary, LocalDate startDate, LocalDate endDate, double managerFix, String salaryType)
    {
        super(startDate, endDate, managerFix, salaryType);
        this.perHourSalary = perHourSalary;
    }

    // Methods
    // PerHourSalary Setter
    public void setPerHourSalary(double perHourSalary) {
        this.perHourSalary = perHourSalary;
    }

    // PerHourSalary Getter
    public double getPerHourSalary() {
        return perHourSalary;
    }

    @Override
    public double perMonthSalary()
    {
        return perHourSalary;
    }
}