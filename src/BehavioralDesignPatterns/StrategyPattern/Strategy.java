/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *  
 */

package BehavioralDesignPatterns.StrategyPattern;

public interface Strategy {
	/***
	 * 
	 * @param num1 number one
	 * @param num2 number two
	 * @return return answer
	 * 
	 */
	public int doOperation(int num1, int num2);
}