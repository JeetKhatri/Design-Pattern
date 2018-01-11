/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package BehavioralDesignPatterns.StatePattern;

public class StopState implements State {

	/***
	 * This method will call when state stopped
	 */
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	/***
	 * override default method
	 */
	public String toString() {
		return "Stop State";
	}
}