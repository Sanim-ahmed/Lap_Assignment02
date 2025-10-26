class Employee 
{
    private int employee_id;
    private String employee_name;
    private double employee_salary;
    
    public void setEmployeeId(int id)
    {
        employee_id = id;
    }
    public int getEmployeeId()
    {
        return employee_id;
    }
    public void setEmployeeName(String name)
    {
        employee_name = name;
    }
    public String getEmployeeName()
    {
        return employee_name;
    }
    public void setEmployeeSalary(double salary)
    {
        employee_salary = salary;
    }
    public String getEmployeeSalary()
    {
        return String.format("TK-%.2f", employee_salary); 
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();

        emp.setEmployeeId(101);
        emp.setEmployeeName("Sifat Hossain");
        emp.setEmployeeSalary(45000.75);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Salary: " + emp.getEmployeeSalary());
    }
}
