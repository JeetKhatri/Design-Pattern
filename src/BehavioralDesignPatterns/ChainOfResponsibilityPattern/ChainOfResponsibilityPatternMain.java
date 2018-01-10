/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.ChainOfResponsibilityPattern;

public class ChainOfResponsibilityPatternMain {

	public static void main(String[] args) {

		//	creting object of NegativeProcessor, ZeroProcessor, PositiveProcessor
		Chain c1 = new NegativeProcessor();
		Chain c2 = new ZeroProcessor();
		Chain c3 = new PositiveProcessor();
		
		//	setting flow
		c1.setNext(c2);
		c2.setNext(c3);

		// calling a methods
		c1.process(new Number(90));
		c1.process(new Number(-50));
		c1.process(new Number(0));
		c1.process(new Number(91));
	}

}