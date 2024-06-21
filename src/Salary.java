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


class Commission extends Salary
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


class FixedCommission extends Commission
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
        return fixedCommissionRate * super.getSalary();
    }
}

class PerHour extends Salary
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

class Fixed extends Salary
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