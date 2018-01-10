/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.DecoratorDesignPattern;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle Shape");
	}
}