/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.AdapterPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCardInterface {
	/***
	 * This method set bankName, acOwnerName and acNumber
	 */
	@Override
	public void setBankDetails() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the Bank name :");
			String bankName = br.readLine();
			System.out.print("Enter the account holder name :");
			String acOwnerName = br.readLine();
			System.out.print("Enter the account number :");
			long acNumber = Long.parseLong(br.readLine());
			setAcNumber(acNumber);
			setAcOwnerName(acOwnerName);
			setBankName(bankName);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * 
	 * @return String that contain bankName, acOwnerName and acNumber
	 */
	@Override
	public String getBankDetails() {
		return "Bank Name : "+getBankName()+"\nA/C Owner Name : "+getAcOwnerName()+"\nA/C Number : "+getAcNumber();
	}

}
