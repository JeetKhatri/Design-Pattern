/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.BridgeDesignPattern;

import java.util.ArrayList;

public class JavaQuestions implements QuestionInterface {
	private ArrayList<String> questions = new ArrayList<String>();
	private int current = 0;

	/***
	 * It will add default questions list using default constructor
	 */
	public JavaQuestions() {
		questions.add("what is class?");
		questions.add("What is interface?");
		questions.add("What is abstraction?");
		questions.add("How multiple polymorphism is achieved in java?");
		questions
				.add("How many types of exception  handling are there in java?");
		questions
				.add("Define the keyword final for  variable, method, and class in java?");
		questions.add("What is abstract class?");
		questions.add("What is multi-threading?");
		current = questions.size();
		System.out.println("Default current : " + current);
	}

	/***
	 * This method is used for process for next Question
	 */
	public void nextQuestion() {
		if (current <= questions.size() - 1){
			System.out.println("current : "+(++current));
		}else
			System.out.println("You can't go next.");
	}

	/***
	 * This method is used for process for previous Question
	 */
	public void previousQuestion() {
		if (current > 1)
			System.out.println("current : " + (--current));
		else
			System.out.println("You can't go prev.");
	}

	/***
	 * @param q
	 *            q question will add into the list This method is used for
	 *            adding new Question
	 */
	public void newQuestion(String quest) {
		questions.add(quest);
		current++;
		System.out.println("Question added : " + quest);
		System.out.println("current : " + current);
	}

	/***
	 * @param q
	 *            question which you want to delete. This method is used for
	 *            deleting Question q
	 */
	public void deleteQuestion(String quest) {
		questions.remove(quest);
		current--;
		System.out.println("Question deleted : " + quest);
		System.out.println("current : " + current);
	}

	/***
	 * Display current question
	 */
	public void displayQuestion() {
		System.out.println("Display Question : " + questions.get(current - 1)
				+ "\nCurrent : " + current);
	}

	/***
	 * Display all question
	 */
	public void displayAllQuestions() {
		int i = 1;
		for (String quest : questions) {
			System.out.println("Q" + i++ + ".  " + quest);
		}
	}
}