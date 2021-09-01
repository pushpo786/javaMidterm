package design;

public interface Employee {
	
	/*
	Employee is an Interface which contains multiple unimplemented methods.
	A few methods have been declared below. You need to come up with more methods to meet business requirements of this
	    application
	*/

    /*
     Please read the following methods and understand the business requirements of these following methods
        and then implement these in a concrete class.
     */

    // employeeId() will return employee id.
    int employeeId();

    //employeeName() will return employee name
   void employeeName();

    //assignDepartment() will assign employee to departments
    void assignDepartment();

    //calculate employee salary
    double calculateSalary(double totalHoursWithOverTime);

    //employee benefit
    void benefitLayout();

    //employee ssn
    void socialSecurityNum();

    //employee phone number
    void phoneNum();

}
