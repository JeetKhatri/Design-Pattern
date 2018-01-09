/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */
public class AbstractPatternLoan4Home extends AbstractPatternLoan{

	/***
	 * @return rate of interest
	 */
	@Override
	public double getInterestRate() {
		return 15;
	} 
	
	public String getLoanType(){
		return "Home Loan";
	}

}
