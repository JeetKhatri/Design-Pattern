/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *  
 */

package BehavioralDesignPatterns.StrategyPattern;

public class Context {
	   private Strategy strategy;

	   /***
	    * 
	    * @param strategy object of Strategy(Run time decide which object to call like add,sub,multiplication)
	    */
	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   /***
	    * This method execute the operation
	    * @param num1 number one
	    * @param num2 number two
	    * @return return answer
	    */
	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }
	}
