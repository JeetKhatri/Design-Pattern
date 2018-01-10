/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.BridgeDesignPattern;

public class BridgePatternMain {
	public static void main(String[] args) {
		// It will create the object of QuestionFormat class
		QuestionFormat questions = new QuestionFormat(
				"Java Programming Language");

		// It will assign to the q variable of QuestionManager class
		questions.q = new JavaQuestions();
		System.out.println();
		
		// QuestionManager class's method are called
		questions.delete("what is class?");
		System.out.println();
		
		// display current question
		questions.display();
		System.out.println();
		questions.previous();
		questions.previous();
		System.out.println();
		questions.display();
		questions.previous();
		System.out.println();
		questions.display();
		System.out.println();
		questions.newOne("What is inheritance? ");
		questions.newOne("How many types of inheritance are there in java?");

		// display all question
		questions.displayAll();
	}
}
