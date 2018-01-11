/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *  child class implement it
 */

package BehavioralDesignPatterns.TemplatePattern;

public class Cricket extends Game {

	   @Override
	   void endPlay() {
	      System.out.println("Cricket Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Cricket Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Cricket Game Started. Enjoy the game!");
	   }
	}
