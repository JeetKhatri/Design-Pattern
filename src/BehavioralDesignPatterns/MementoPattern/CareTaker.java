/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * This class used to store and retrive the momento from arraylist
 */

package BehavioralDesignPatterns.MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>();

   /***
    * This will add the memento into mementoList
    * @param state Momento
    */
   public void add(Memento state){
      mementoList.add(state);
   }

   /***
    * This will return the memento from mementoList
    * @param index based on the index it return object of the memento
    * @return Momento
    */
   public Memento get(int index){
      return mementoList.get(index);
   }
}