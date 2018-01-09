/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package CreationalDesignPatterns.AbstractFactoryDesignPattern;
public class AbstractPatternBankICICI implements AbstractPatternBank{

	private String bankName = "";

	AbstractPatternBankICICI() {
		bankName = "ICICI Bank";
	}

	/***
	 * @return bankName
	 */
	@Override
	public String getBankName() {
		return bankName;
	}
}
