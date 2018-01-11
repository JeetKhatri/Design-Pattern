/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package BehavioralDesignPatterns.NullObjectPattern;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomerFactory {

	// Default list of the customer 
	public static final ArrayList<String> names =  new ArrayList<String>(Arrays.asList( "Rob", "Joe", "Julie" ));

	/***
	 * 
	 * @param name of the customer
	 * @return object of the RealCustomer/NullCustomer based on the name available in the list or not
	 */
	public static AbstractCustomer getCustomer(String name) {
		if(names.contains(name))
				return new RealCustomer(name);
		return new NullCustomer();
	}
}