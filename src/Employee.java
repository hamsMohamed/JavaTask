public class Employee {
    private int ID ;
    private String Name;
    private double Salary;
    private int age ;
    private Department department;

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getID() {
        return ID;
    }

    public double getSalary() {
        return Salary;
    }

    public int getAge() {
        return age;
    }

    public String getName()
    {
        return Name;
    }

    public Department getDepartment() {
        return department;
    }
    public  String toString()
    {
      return "The Employee name is "+getName()+"/nthe Employee age is "+getAge()+"the Employee Salary is "+getSalary()+
              "the Employee department is"+getDepartment().getName();
    }
}
