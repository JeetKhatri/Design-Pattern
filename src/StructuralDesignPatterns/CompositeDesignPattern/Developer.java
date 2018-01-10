/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * This class implement Employee interface and implement showEmployeeDetails method
 * 
 */

package StructuralDesignPatterns.CompositeDesignPattern;

public class Developer implements Employee
{
    private String name;
    private long empId;
    private String position;
    /***
     *  
     * @param empId this will set employee id
     * @param name this will set employee name
     * @param position this will set employee position
     */
    public Developer(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
     
    /***
     * This method show the details of all the employees
     */
    @Override
    public void showEmployeeDetails() 
    {
        System.out.println(empId+"\t" +name+ "\t" + position );
    }
}
