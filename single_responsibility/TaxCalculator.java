package single_responsibility;

public class TaxCalculator {

    public void calculateEmployeeTax(Employee employee)
    {
        
        if (employee.getEmployeeType().equals("fulltime"))
        {
            // calc tax for fulltime employee
        }
        if (employee.getEmployeeType().equals("contract"))
        {
            // calc tax for contract employee
        }

    }
    
}
