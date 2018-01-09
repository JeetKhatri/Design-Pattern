/***
 * 
 * @author JeetKhatri
 * @since Jan,18
 * 
 */
package CreationalDesignPatterns.SingletonDesignPattern;
public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
	}

}
