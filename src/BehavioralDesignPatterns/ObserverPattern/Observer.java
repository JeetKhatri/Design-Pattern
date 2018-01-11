/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package BehavioralDesignPatterns.ObserverPattern;

public abstract class Observer {
	protected Subject subject;
	
	/***
	 * When the state changed at that time this method will be called
	 */
	public abstract void update();
}