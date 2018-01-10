/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.DecoratorDesignPattern;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	/***
	 * called parents draw() method -> draw simple circle or rectangle
	 * then call setRedBorder method -> set border
	 */
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	/***
	 * 
	 * @param decoratedShape set border color 
	 */
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}
}