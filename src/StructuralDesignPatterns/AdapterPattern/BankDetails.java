/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */


package StructuralDesignPatterns.AdapterPattern;

public class BankDetails {

	private String bankName;
	private String acOwnerName;
	private long acNumber;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAcOwnerName() {
		return acOwnerName;
	}

	public void setAcOwnerName(String acOwnerName) {
		this.acOwnerName = acOwnerName;
	}

	public long getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(long acNumber) {
		this.acNumber = acNumber;
	}

}
