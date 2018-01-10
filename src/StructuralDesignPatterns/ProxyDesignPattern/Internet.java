/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * This is a Internet interface which has 1 method called as connectTo
 */

package StructuralDesignPatterns.ProxyDesignPattern;

public interface Internet
{
	/***
	 * 
	 * @param site Name of the website which client want to visit
	 */
    public String connectTo(String site);
}
