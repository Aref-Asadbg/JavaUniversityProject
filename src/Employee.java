import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee
{
    // Enums
    public enum Activity
    {
        ACTIVE,
        NOPAYOFF,
        FIRED,
        RETIREMENT,
        TERMINATION,
        VACATION;
    }

    public enum Gender
    {
        MAN,
        WOMAN;
    }

    // Variables
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private final String nationalId;
    private final LocalDate birthDate;
    private final Gender gender;
    private final long ID;
    private static long idNumber = 0;
    private Boolean manager;
    private Activity status;
    private double salary;
    private String userName;
    private String password;

    // Has-a
    History history;

    // Constructor
    public Employee(String name, String lastName, String phoneNumber, String nationalId, LocalDate birthDate, Gender gender, String userName, String password, Boolean manager, Activity status)
    {
        this.firstName = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.nationalId = nationalId;
        this.birthDate = birthDate;
        this.gender = gender;
        this.manager = manager;
        this.status = status;
        idNumber++;
        this.ID = idNumber;
        this.history = new History();
        this.userName = userName;
        this.password = password;
    }

    // Salary In A Specific Date
    public double totalSalaryCalc(LocalDate startDate, LocalDate endDate)
    {
        double totalIncome = 0.0;
        for(Salary salary : history.salaries)
        {
            LocalDate salaryStart = salary.getStartDate();
            LocalDate salaryEnd = salary.getEndDate();

            if((salaryStart.isBefore(endDate) || salaryStart.isEqual(endDate)) &&
                    (salaryEnd.isAfter(startDate) || salaryEnd.isEqual(startDate)))
            {
                LocalDate effectiveStart = salaryStart.isBefore(startDate) ? startDate : salaryStart;
                LocalDate effectiveEnd = salaryEnd.isAfter(endDate) ? endDate : salaryEnd;

                long monthsBetween = ChronoUnit.MONTHS.between(effectiveStart.withDayOfMonth(1), effectiveEnd.withDayOfMonth(1)) + 1;
                totalIncome += monthsBetween * salary.perMonthSalary();
            }
        }
        return totalIncome;
    }

    // Setter methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setManager(Boolean manager) {
        this.manager = manager;
    }

    public void setStatus(Activity status) {
        this.status = status;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public long getID() {
        return ID;
    }

    public Boolean getManager() {
        return manager;
    }

    public Activity getStatus() {
        return status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public long getIdNumber()
    {
        return idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // toString method
    @Override
    public String toString() {
        if (manager == Boolean.TRUE)
        {
            return "Manager{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", PhoneNumber='" + phoneNumber + '\'' +
                    ", nationalId='" + nationalId + '\'' +
                    ", userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    ", birthDate=" + birthDate +
                    ", gender=" + gender +
                    ", ID=" + ID +
                    ", status=" + status +
                    '}';
        }
        else {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", PhoneNumber='" + phoneNumber + '\'' +
                    ", nationalId='" + nationalId + '\'' +
                    ", userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    ", birthDate=" + birthDate +
                    ", gender=" + gender +
                    ", ID=" + ID +
                    ", status=" + status +
                    '}';
        }
    }
}