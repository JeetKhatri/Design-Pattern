/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */
public class AbstractPatternLoan4Business extends AbstractPatternLoan{

	/***
	 * @return rate of interest
	 */
	@Override
	public double getInterestRate() {
		return 30;
	}

	public String getLoanType(){
		return "Business Loan";
	}

}
