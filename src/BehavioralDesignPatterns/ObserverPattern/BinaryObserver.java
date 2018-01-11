/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package BehavioralDesignPatterns.ObserverPattern;

public class BinaryObserver extends Observer {

	/***
	 * Attach method is used for adding a observer into observerList
	 */
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/***
	 * When the state changed at that time this method will be called
	 */
	@Override
	public void update() {
		System.out.println("Binary String: "
				+ Integer.toBinaryString(subject.getState()));
	}
}