package chapter9;

public class Employee extends Person {

    private String employeeId;
    private String department;

    public Employee() {
        super("Angie" , 30, "Female");
        System.out.println("Employee constructor called");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
