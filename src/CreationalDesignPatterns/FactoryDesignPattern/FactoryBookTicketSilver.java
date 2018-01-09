/***
 * 
 * @author JeetKhatri
 * @since Jan,18
 *
 */
package CreationalDesignPatterns.FactoryDesignPattern;
public class FactoryBookTicketSilver extends FactoryBookTicketAbstractClass {
	/***
	 * @return Price of 1 ticket.
	 */
	@Override
	public int getPrice() {
		return 100;
	}
}
