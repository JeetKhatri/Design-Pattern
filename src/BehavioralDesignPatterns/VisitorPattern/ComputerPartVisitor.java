/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *  
 */

package BehavioralDesignPatterns.VisitorPattern;

public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}