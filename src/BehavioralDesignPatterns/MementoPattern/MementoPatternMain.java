/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package BehavioralDesignPatterns.MementoPattern;

public class MementoPatternMain {

	 public static void main(String[] args) {
		   
	      Originator originator = new Originator();
	      CareTaker careTaker = new CareTaker();
	      
	      // set the state
	      originator.setState("State #1");
	      originator.setState("State #2");
	      // add into mementoList
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("State #3");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("State #4");
	      System.out.println("Current State: " + originator.getState());		
	      
	      // It will set memnto state
	      originator.getStateFromMemento(careTaker.get(0));
	      
	      //print state
	      System.out.println("First saved State: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      System.out.println("Second saved State: " + originator.getState());
	   }

}
