/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.IteratorPattern;

public interface Iterator {
	
	/***
	 * 
	 * @return true /false
	 */
	public boolean hasNext();
	
	/***
	 * 
	 * @return next object
	 */
	public Object next();

}
