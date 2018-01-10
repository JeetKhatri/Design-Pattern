/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.AdapterPattern;

public interface CreditCardInterface {

	/***
	 * This method set bankName, acOwnerName and acNumber
	 */
	public void setBankDetails();
	
	/***
	 * 
	 * @return String that contain bankName, acOwnerName and acNumber
	 */
	public String getBankDetails();
}
