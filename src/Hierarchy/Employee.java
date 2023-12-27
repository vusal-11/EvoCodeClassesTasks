package Hierarchy;

import java.util.Date;

public class Employee extends Worker{

    private int employeeId;

    private Date hireDate;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Employee(String name, int age) {
        super(name, age);
    }


}
