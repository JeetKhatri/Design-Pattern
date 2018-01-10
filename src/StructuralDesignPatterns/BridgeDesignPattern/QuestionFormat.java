/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.BridgeDesignPattern;

public class QuestionFormat extends QuestionManager {  
	
	/***
	 * control goes to QuestionManager using super, So QuestionManager's constructor are called
	 * @param catalog 's value are assign to the catalog variable of QuestionManager class
	 */
    public QuestionFormat(String catalog){  
        super(catalog);  
    }  
    /***
	 * displayAllQuestions method of QuestionInterface class will be called 
	 */
    public void displayAll() {  
        System.out.println("\n---------------------------------------------------------");  
        super.displayAll();  
        System.out.println("-----------------------------------------------------------");  
    }  
}