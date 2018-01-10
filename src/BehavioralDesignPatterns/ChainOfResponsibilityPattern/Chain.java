/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.ChainOfResponsibilityPattern;

public interface Chain
{
	/***
	 * 
	 * @param nextInChain set next object which we want to call
	 */
    public abstract void setNext(Chain nextInChain);
    
    /***
     * 
     * @param request check for number if condition are not fulfill then process to the next  
     */
    public abstract void process(Number request);
}
