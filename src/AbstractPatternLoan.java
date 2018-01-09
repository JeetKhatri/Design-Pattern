/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

public abstract class AbstractPatternLoan {
	protected double rate;

	/***
	 * @return rate of interest
	 */
	abstract double getInterestRate();
	/***
	 * 
	 * @return name of the loan type
	 */
	abstract String getLoanType();
	/***
	 * 
	 * @param amount  Loan amount
	 * @param year  No of years
	 * @return  Interest
	 */
	public double calculateLoanInterest(double amount,double year){
		return (amount * year * getInterestRate())/100;
	}
}
