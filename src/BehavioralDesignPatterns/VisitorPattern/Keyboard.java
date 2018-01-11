/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *  
 */

package BehavioralDesignPatterns.VisitorPattern;

public class Keyboard implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}