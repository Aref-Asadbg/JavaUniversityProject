import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Department
{
    // Variables + Arraylist
    private String name;
    ArrayList<Employee> employees = new ArrayList<Employee>();

    // Has-a
    private Employee employee;

    // Constructor
    public Department(String name)
    {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Method's
    // Add employees
    public void addEmployee(Employee e)
    {
        employees.add(e);
    }

    // Get Employees
    public ArrayList<Employee> getEmployees()
    {
        return employees;
    }

    // SetName
    public void setName(String name)
    {
        this.name = name;
    }

    // GetName
    public String getName()
    {
        return name;
    }

    // Search Part
    // By name
    public ArrayList<Employee> findByName(String firstName, String lastName)
    {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee e : employees)
        {
            if (e.getFirstName().equalsIgnoreCase(firstName) && e.getLastName().equalsIgnoreCase(lastName)){
                result.add(e);
            }
        }
        return result;
    }

    // By NationalId
    public Employee findByNationalId(String nationalId)
    {
        for (Employee e : employees)
        {
            if (e.getNationalId().equalsIgnoreCase(nationalId))
            {
                return e;
            }
        }
        return null;
    }

    // By PhoneNumber
    public ArrayList<Employee> findByPhoneNumber(String phoneNumber)
    {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee e : employees)
        {
            if (e.getPhoneNumber().equalsIgnoreCase(phoneNumber))
            {
                result.add(e);
            }
        }
        return result;
    }

    // By Id
    public Employee idFinder(long id)
    {
        for (Employee e : employees)
        {
            if (e.getID() == id)
            {
                return e;
            }
        }
        return null;
    }

    // By BirthDate
    public ArrayList<Employee> findByBirthDate(LocalDate birthDate)
    {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee e : employees)
        {
            if (e.getBirthDate().isEqual(birthDate))
            {
                result.add(e);
            }
        }
        return result;
    }

    // By Salary
    public ArrayList<Employee> findBySalary(double rangeOne, double rangeTwo)
    {
        ArrayList<Employee> result = new ArrayList<>();
        for(Employee e : employees)
        {
            if(i fuck u = u will be pregnant pregnant hi my name is aref asadbegi)
        }
    }

}






























