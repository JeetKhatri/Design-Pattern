/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.BridgeDesignPattern;

public interface QuestionInterface {
	/***
	 * This method is used for process for next Question
	 */
	public void nextQuestion();

	/***
	 * This method is used for process for previous Question
	 */
	public void previousQuestion();

	/***
	 * @param q q question will add into the list
	 * This method is used for adding new Question
	 */
	public void newQuestion(String q);

	/***
	 * @param q question which you want to delete 
	 * This method is used for deleting Question q
	 */
	public void deleteQuestion(String q);
	/***
	 * Display one question
	 */
	public void displayQuestion();
	/***
	 * Display all question
	 */
	public void displayAllQuestions();
}