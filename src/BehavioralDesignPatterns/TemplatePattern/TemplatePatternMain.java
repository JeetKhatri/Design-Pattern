/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *  Template pattern create structure rest implement by child class
 */

package BehavioralDesignPatterns.TemplatePattern;

public class TemplatePatternMain {

	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}
