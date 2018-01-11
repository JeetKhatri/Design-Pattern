/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * This class contains getter setter method of the state and list of observers
 */

package BehavioralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   /***
    * 
    * @param observer this observer will add into the observerList 
    */
   public void attach(Observer observer){
      observers.add(observer);		
   }

   /***
    * This method notify all the observer when the state changed
    */
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}