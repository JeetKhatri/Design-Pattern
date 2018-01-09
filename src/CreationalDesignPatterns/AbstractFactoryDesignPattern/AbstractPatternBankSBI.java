/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */
package CreationalDesignPatterns.AbstractFactoryDesignPattern;
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
