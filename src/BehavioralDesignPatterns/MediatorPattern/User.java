/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */
/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package BehavioralDesignPatterns.MediatorPattern;

public class User {

	private String name;
	User(){}
	public User(String name) {
		this.name = name;
	}
	/***
	 * 
	 * @return name of the user
	 */
	public String getName() {
		return name;
	}

	/***
	 * This method set name of the user
	 * @param name of the user
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/***
	 * This method call the showMsg method of the ChatRoom class
	 * @param msg content
	 */
	public void sendMessage(String msg){
		ChatRoom.showMsg(this,msg);
	}
}
