/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *  
 */

package BehavioralDesignPatterns.VisitorPattern;

public interface ComputerPart {
	   public void accept(ComputerPartVisitor computerPartVisitor);
	}