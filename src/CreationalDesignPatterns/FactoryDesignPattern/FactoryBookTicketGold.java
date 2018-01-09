/***
 * 
 * @author JeetKhatri
 * @since Jan,18
 *
 */
package CreationalDesignPatterns.FactoryDesignPattern;
public class FactoryBookTicketGold extends FactoryBookTicketAbstractClass {
	
	/***
	 * @return Price of 1 ticket.
	 */
	@Override
	public int getPrice() {
		return 150;
	}
}
