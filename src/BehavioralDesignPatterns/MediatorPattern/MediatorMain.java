/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.MediatorPattern;

public class MediatorMain {

	public static void main(String[] args) {
		User jeet = new User("Jeet");
		User sharvil = new User("Sharvil");
		
		jeet.sendMessage("Hello");
		sharvil.sendMessage("Hi");
	}
	
}
