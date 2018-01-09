/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

public class AbstractPatternBankSBI implements AbstractPatternBank{

	private String bankName = "";

	AbstractPatternBankSBI() {
		bankName = "SBI Bank";
	}

	/***
	 * @return bankName
	 */
	@Override
	public String getBankName() {
		return bankName;
	}
}
