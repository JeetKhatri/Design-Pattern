/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * We only implement 1 method of Packing interface so we have to make this class as abstract. 
 */

package CreationalDesignPatterns.BuilderDesignPattern;

public abstract class CD implements Packing {
	
	/***
	 * @return Name of the CD like Samsung, Sony etc.
	 */
	public abstract String pack();
}
