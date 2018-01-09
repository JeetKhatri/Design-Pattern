/***
 * 
 * @author JeetKhatri
 * @since Jan,18
 * 
 */
package CreationalDesignPatterns.SingletonDesignPattern;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Singleton {
	private static Singleton obj;

	/***
	 * We make the constructor as private because we want that no class can able to create the object of this class
	 */
	private Singleton() {}

	/***
	 * If the object are already created then return that object otherwise it will create new object
	 * @return Object of the Singleton class
	 */
	public static Singleton getInstance() {
		if (obj == null) {
			obj = new Singleton();
			System.out.println("Null, New object created -> " + obj);
		} else
			System.out.println("Not Null, old object -> " + obj);
		return obj;
	}
	
}
