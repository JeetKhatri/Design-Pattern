/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package StructuralDesignPatterns.FlyweightDesignPattern;

public class FlyweightPatternDemo {
	private static final String colors[] = { "Red", "Green", "Blue", "White","Black" };

	public static void main(String[] args) {

		for (int i = 0; i < 20; ++i) {
			
			// creating object (randomly)
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX((int)(Math.random() * 100));
			circle.setY((int)(Math.random() * 100));
			circle.setRadius(100);
			circle.draw();
		}
	}
	
	/***
	 * 
	 * @return random color's String
	 */
	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

}