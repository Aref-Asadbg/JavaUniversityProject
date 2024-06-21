import java.time.LocalDate;

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

    // Constructor
    public Employee(String name, String lastName, String phoneNumber, String nationalId, LocalDate birthDate, Gender gender, Boolean manager, Activity status)
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
                    ", birthDate=" + birthDate +
                    ", gender=" + gender +
                    ", ID=" + ID +
                    ", status=" + status +
                    '}';
        }
    }
}