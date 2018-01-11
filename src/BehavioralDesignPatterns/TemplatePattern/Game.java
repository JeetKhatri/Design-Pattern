/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *  Game structure made by Template class
 */

package BehavioralDesignPatterns.TemplatePattern;

public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	/***
	 * template method
	 */
	public final void play() {

		// initialize the game
		initialize();

		// start game
		startPlay();

		// end game
		endPlay();
	}
}