/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package BehavioralDesignPatterns.NullObjectPattern;

public class NullCustomer extends AbstractCustomer {

	/***
	 * 
	 * @return name of the customer
	 */
	@Override
	public String getName() {
		return "Name Not Available in Customer List";
	}

}