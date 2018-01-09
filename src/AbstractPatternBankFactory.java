/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

public class AbstractPatternBankFactory extends AbstractPatternAbstractFactory {

	/***
	 * This method get the bank name as string and return the object of the particular bank
	 * @param bank - send the name of bank like icici, sbi etc.
	 * @return return of the object of the particular bank type
	 */
	@Override
	public AbstractPatternBank getBank(String bank) {
		if (bank == null) {
		} else if (bank.equalsIgnoreCase("hdfc")) {
			return new AbstractPatternBankHDFC();
		} else if (bank.equalsIgnoreCase("icici")) {
			return new AbstractPatternBankICICI();
		} else if (bank.equalsIgnoreCase("sbi")) {
			return new AbstractPatternBankSBI();
		}
		return null;
	}

	// This is Bank Factory so no need to write code in getLoan method
	@Override
	public AbstractPatternLoan getLoan(String loan) {
		return null;
	}
}
