/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.InterpreterPattern;

public interface Pattern {
	
	/***
	 * This method convert Infix expression into Postfix expression
	 * @param exp expression which we want to convert
	 */
	public String conversion(String exp);

}
