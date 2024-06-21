import java.util.ArrayList;

public class History
{
    // Arraylist and Variables
    ArrayList<Salary> salaries = new ArrayList();
    ArrayList<Employee.Activity> activities = new ArrayList();
    ArrayList<Boolean> manager = new ArrayList();

    // Methods
    // To Add Salary
    public void setSalary(Salary salary)
    {
        salaries.add(salary);
    }

    // To Add Activity
    public void setActivity(Employee.Activity activity)
    {
        activities.add(activity);
    }

    // To Add Manager Status
    public void setManager(boolean manager)
    {
        this.manager.add(manager);
    }
}