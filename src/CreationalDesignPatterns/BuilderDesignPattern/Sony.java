/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */
package CreationalDesignPatterns.BuilderDesignPattern;

public class Sony extends Company {
	@Override
	public int price() {
		return 20;
	}

	@Override
	public String pack() {
		return "Sony CD";
	}
}
