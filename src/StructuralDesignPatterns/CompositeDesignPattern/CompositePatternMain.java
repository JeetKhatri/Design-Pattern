/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.CompositeDesignPattern;

public class CompositePatternMain {
	public static void main (String[] args)
    {
		// creating object of developers 
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
        
        // creating object of CompanyDirectory and add developers into it.
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);
          
        // creating object of developers 
        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");
          
        // creating object of CompanyDirectory and add Managers into it.
        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);
      
        // creating object of CompanyDirectory and add accDirectory,engDirectory into it.
        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        
        // Display all record
        directory.showEmployeeDetails();
    }
}
