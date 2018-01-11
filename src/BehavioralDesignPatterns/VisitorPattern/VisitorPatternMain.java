/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *  
 */

package BehavioralDesignPatterns.VisitorPattern;

public class VisitorPatternMain {

	public static void main(String[] args) {
		
		  // object created (Array of object)
	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	   }
}
