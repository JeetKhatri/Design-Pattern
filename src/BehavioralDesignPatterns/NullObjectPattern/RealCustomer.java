/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package BehavioralDesignPatterns.NullObjectPattern;

public class RealCustomer extends AbstractCustomer {

	/***
	 * set the name of the customer
	 * @param name of the customer
	 */
	   public RealCustomer(String name) {
	      this.name = name;		
	   }
	   
	   /***
		 * 
		 * @return name of the customer
		 */
	   @Override
	   public String getName() {
	      return "Name : "+name;
	   }
	   
	   
	}