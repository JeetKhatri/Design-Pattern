/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *  
 */

package BehavioralDesignPatterns.StrategyPattern;

public class OperationAdd implements Strategy{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 + num2;
	   }
	}