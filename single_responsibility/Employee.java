package single_responsibility;

public class Employee {

    private String employeeId;
    private String employeeName;
    private String employeeAddress;
    private String contactNumber;
    private String employeeType;

    public void save()
    {
        new EmployeeModel().save(this);
    }

    public void calculateTax()
    {

        new TaxCalculator().calculateEmployeeTax(this);

    }

    public String getEmployeeId()
    {

        return employeeId;

    }

    public void setEmployeeId(String employeeId)
    {

        this.employeeId = employeeId;

    }

    public String getEmployeeName()
    {

        return employeeName;

    }

    public void setEmployeeName(String employeeName)
    {

        this.employeeName = employeeName;

    }

    public String getEmployeeAddress()
    {

        return employeeAddress;

    }

    public void setEmployeeAddress(String employeeAddress)
    {

        this.employeeAddress = employeeAddress;

    }

    public String getEmployeeContactNumber()
    {

        return contactNumber;

    }

    public void setEmployeeContactNumber(String contactNumber)
    {

        this.contactNumber = contactNumber;

    }


    public String getEmployeeType()
    {

        return employeeType;

    }

    public void setEmployeeType(String type)
    {

        this.employeeType = type;

    }
    
}
