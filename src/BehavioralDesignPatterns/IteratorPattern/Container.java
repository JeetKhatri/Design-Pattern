/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.IteratorPattern;

public interface Container {

	/***
	 * 
	 * @return Object of CollectionofNamesIterate
	 */
	public Iterator getIterator();
	
}
