/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */
public class AbstractPatternLoan4Education extends AbstractPatternLoan{

	/***
	 * @return rate of interest
	 */
	@Override
	public double getInterestRate() {
		return 5;
	}

	public String getLoanType(){
		return "Education Loan";
	}

}
