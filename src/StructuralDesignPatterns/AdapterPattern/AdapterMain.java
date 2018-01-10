/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */


package StructuralDesignPatterns.AdapterPattern;

public class AdapterMain {

	public static void main(String[] args) {
		CreditCardInterface obj = new BankCustomer();
		obj.setBankDetails();
		System.out.println();
		System.out.println(obj.getBankDetails());
	}

}
