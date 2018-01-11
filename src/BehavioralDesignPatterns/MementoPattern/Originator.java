/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * Use the memento object to restore its previous state.
 */

package BehavioralDesignPatterns.MementoPattern;

public class Originator {
	   private String state;

	   public void setState(String state){
	      this.state = state;
	   }

	   public String getState(){
	      return state;
	   }

	   /***
	    * 
	    * @return object of the momento
	    */
	   public Memento saveStateToMemento(){
	      return new Memento(state);
	   }

	   /***
	    * 
	    * @param memento It will set the state of the memento
	    */
	   public void getStateFromMemento(Memento memento){
	      state = memento.getState();
	   }
	}