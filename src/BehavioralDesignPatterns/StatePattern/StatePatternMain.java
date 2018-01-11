/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package BehavioralDesignPatterns.StatePattern;

public class StatePatternMain {

	public static void main(String[] args) {
		
		// creating object of the context
		Context context = new Context();
		
		// creating object of the StartState and call its method
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());

		System.out.println();
		
		// creating object of the StopState and call its method
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}
}
