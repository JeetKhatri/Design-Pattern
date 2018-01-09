package CreationalDesignPatterns.AbstractFactoryDesignPattern;
/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */
public class AbstractPatternLoanFactory extends AbstractPatternAbstractFactory {

	// This is Loan Factory so no need to write code in getBank method
	@Override
	public AbstractPatternBank getBank(String bank) {
		return null;
	}

	/***
	 * This method get the loan type as string and return the object of the particular loan
	 * @param loan- send the name of loan type like home, education etc.
	 * @return return of the object of the particular loan type
	 */
	@Override
	public AbstractPatternLoan getLoan(String loan) {
		if (loan == null) {
		} else if (loan.equalsIgnoreCase("home")) {
			return new AbstractPatternLoan4Home();
		} else if (loan.equalsIgnoreCase("business")) {
			return new AbstractPatternLoan4Business();
		} else if (loan.equalsIgnoreCase("education")) {
			return new AbstractPatternLoan4Education();
		}
		return null;
	}
}
