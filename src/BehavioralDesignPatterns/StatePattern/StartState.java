/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package BehavioralDesignPatterns.StatePattern;

public class StartState implements State {

	/***
	 * This method will call when state started
	 */
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	/***
	 * override default method
	 */
	public String toString() {
		return "Start State";
	}
}