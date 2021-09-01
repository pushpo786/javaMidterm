package design;

public abstract class EmployeeFile implements Employee{

    public abstract int employeeId();
    public abstract void employeeName();
    public abstract void assignDepartment();
    public abstract double calculateSalary(double totalHoursWithOverTime);
    public abstract void benefitLayout();
    public abstract void socialSecurityNum();
    public abstract void phoneNum();




}
