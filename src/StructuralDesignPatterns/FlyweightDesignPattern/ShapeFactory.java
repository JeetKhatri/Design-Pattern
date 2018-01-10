/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package StructuralDesignPatterns.FlyweightDesignPattern;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap();

	/***
	 * if color is available in hashmap then return that object otherwise create the object.
	 * @param color String
	 * @return circle object
	 */
	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("\nCreating circle of color : " + color);
		}
		return circle;
	}
}