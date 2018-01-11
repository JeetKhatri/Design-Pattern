/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *  Set the object of stopState/startStart at runtime and return that object
 */

package BehavioralDesignPatterns.StatePattern;

public class Context {
	private State state;

	public Context() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}