/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package CreationalDesignPatterns.AbstractFactoryDesignPattern;
public class AbstractPatternBankHDFC implements AbstractPatternBank{

	private String bankName = "";

	AbstractPatternBankHDFC() {
		bankName = "HDFC Bank";
	}

	/***
	 * @return bankName
	 */
	@Override
	public String getBankName() {
		return bankName;
	}

}
