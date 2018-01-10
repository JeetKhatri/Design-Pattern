package StructuralDesignPatterns.CompositeDesignPattern;

import java.util.ArrayList;
/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * This class implement Employee interface and implement showEmployeeDetails method
 *
 */

import java.util.List;

public class CompanyDirectory implements Employee
{
    private List<Employee> employeeList = new ArrayList<Employee>();
       
    /***
     * This methods display all the records of employee
     */
    @Override
    public void showEmployeeDetails() 
    {
        for(Employee emp:employeeList)
        {
            emp.showEmployeeDetails();
        }
    }
       
    /***
     * 
     * @param emp add employee
     */
    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }
       
    /***
     * 
     * @param emp remove employee
     */
    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }
}
