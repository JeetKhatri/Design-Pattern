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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sendMessage(String msg){
		ChatRoom.showMsg(this,msg);
	}
}
