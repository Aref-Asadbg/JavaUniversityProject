import java.time.LocalDate;

public abstract class Salary
{
    // Variables
    private LocalDate startDate;
    private LocalDate endDate;
    private double managerFix;
    private String salaryType;

    // Constructor
    public Salary(LocalDate startDate, LocalDate endDate, double managerFix, String salaryType)
    {
        this.startDate = startDate;
        this.endDate = endDate;
        this.managerFix = managerFix;
        this.salaryType = salaryType;
    }

    // Methods
    // PerMonth Method
    public abstract double perMonthSalary();

    // StartDate Setter
    public void setStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }

    // EndDate Setter
    public void setEndDate(LocalDate endDate)
    {
        this.endDate = endDate;
    }

    // ManagerFix Setter
    public void setManagerFix(double managerFix)
    {
        this.managerFix = managerFix;
    }

    // SalaryType Setter
    public void setSalaryType(String salaryType)
    {
        this.salaryType = salaryType;
    }

    // StartDate Getter
    public LocalDate getStartDate() {
        return startDate;
    }

    // EndDate Getter
    public LocalDate getEndDate() {
        return endDate;
    }

    // ManagerFix Getter
    public double getManagerFix() {
        return managerFix;
    }

    // SalaryType Getter
    public String getSalaryType() {
        return salaryType;
    }
}