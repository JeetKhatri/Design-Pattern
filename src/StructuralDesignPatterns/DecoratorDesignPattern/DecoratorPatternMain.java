/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.DecoratorDesignPattern;

public class DecoratorPatternMain {
	public static void main(String[] args) {

		// creating object of circle (used for creating normal circle)
		Shape circle = new Circle();

		// Creating object of redCircle and redRectangle
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
