/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * This class is shape Decorator class which implements shape
 */

package StructuralDesignPatterns.DecoratorDesignPattern;

public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	/***
	 * runtime decide which method will be call so call to interface then Rectangle or Circle method called
	 */
	public void draw() {
		decoratedShape.draw();
	}
}