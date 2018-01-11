/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.InterpreterPattern;

public class InterpreterPatternMain {
	
	 public static void main(String[] args)
	    {
	        String infix = "a+b*c";
	        
	        Pattern ip=new InfixToPostfixPattern();
	        
	        String postfix = ip.conversion(infix);
	        System.out.println("Infix:   " + infix);
	        System.out.println("Postfix: " + postfix);
	        
	        
	   
	   }


}
