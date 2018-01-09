/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

public abstract class AbstractPatternAbstractFactory {
	
	/***
	 * This method get the bank name as string and return the object of the particular bank
	 * @param bank - send the name of bank like icici, sbi etc.
	 * @return return of the object of the particular bank type
	 */
	public abstract AbstractPatternBank getBank(String bank);
	/***
	 * This method get the loan type as string and return the object of the particular loan
	 * @param loan - send the name of loan type like home, education etc.
	 * @return return of the object of the particular loan type
	 */
	public abstract AbstractPatternLoan getLoan(String loan);

}
