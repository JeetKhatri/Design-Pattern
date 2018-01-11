/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * This is a chatroom class which shows all users message
 */

package BehavioralDesignPatterns.MediatorPattern;

import java.util.Date;

public class ChatRoom {
	
	/***
	 * This method display the message of the user on the screen
	 * @param user user who send message
	 * @param message content
	 */
	public static void showMsg(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName()
				+ "] : " + message);
	}
}
