/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */
public class AbstractPatternFactoryCreator {
	
	/***
	 * 
	 * @param choice recive the type like bank, loan etc.
	 * @return object of that type
	 */
	public static AbstractPatternAbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Bank")) {
			return new AbstractPatternBankFactory();
		} else if (choice.equalsIgnoreCase("Loan")) {
			return new AbstractPatternLoanFactory();
		}
		return null;
	}
}
