/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package StructuralDesignPatterns.DecoratorDesignPattern;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle Shape");
	}
}