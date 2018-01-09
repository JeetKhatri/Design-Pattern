/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */
package CreationalDesignPatterns.BuilderDesignPattern;

public interface Packing {
	/***
	 * @return Name of the CD like Samsung, Sony etc.
	 */
	public String pack();

	/***
	 * @return price of CD
	 */
	public int price();
}