/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.MediatorPattern;

public class MediatorMain {

	public static void main(String[] args) {
		// Creating object of the users
		User jeet = new User("Jeet");
		User sharvil = new User("Sharvil");
		
		// send message
		jeet.sendMessage("Hello");
		sharvil.sendMessage("Hi");
	}
	
}
