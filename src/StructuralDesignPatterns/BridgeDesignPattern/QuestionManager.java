/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.BridgeDesignPattern;

public class QuestionManager {
	/***
	 * creating object of the QuestionInterface
	 */
	protected QuestionInterface q;
	public String catalog;

	/***
	 * @param catalog value assign
	 */
	public QuestionManager(String catalog) {
		this.catalog = catalog;
	}

	/***
	 * nextQuestion method of QuestionInterface class will be called 
	 */
	public void next() {
		q.nextQuestion();
	}

	/***
	 * previousQuestion method of QuestionInterface class will be called 
	 */
	public void previous() {
		q.previousQuestion();
	}

	/***
	 * newQuestion method of QuestionInterface class will be called 
	 */
	public void newOne(String quest) {
		q.newQuestion(quest);
	}

	/***
	 * deleteQuestion method of QuestionInterface class will be called 
	 */
	public void delete(String quest) {
		q.deleteQuestion(quest);
	}

	/***
	 * displayQuestion method of QuestionInterface class will be called 
	 */
	public void display() {
		q.displayQuestion();
	}

	/***
	 * displayAllQuestions method of QuestionInterface class will be called 
	 */
	public void displayAll() {
		System.out.println("Question Paper: " + catalog);
		q.displayAllQuestions();
	}
}