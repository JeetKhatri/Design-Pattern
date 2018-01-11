/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * In this class state are set using constructor and return using getState method
 */

package BehavioralDesignPatterns.MementoPattern;

public class Memento {
	   private String state;

	   /***
	    * This constructor set the state of the object
	    * @param state of the object
	    */
	   public Memento(String state){
	      this.state = state;
	   }

	   /***
	    * 
	    * @return state of object as string format
	    */
	   public String getState(){
	      return state;
	   }	
	}