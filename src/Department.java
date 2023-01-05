import java.util.ArrayList;

public class Department {
    private int ID;
    private String Name ;


   public ArrayList<Employee>employeeList =new ArrayList<>();
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }
    public String toString()
    {
        return "the department name is "+getName();
    }
    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }
    public void removeEmployee(Employee employee)
    {
        employeeList.remove(employee);
    }
}
