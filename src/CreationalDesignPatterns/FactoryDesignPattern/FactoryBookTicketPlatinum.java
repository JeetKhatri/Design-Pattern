/***
 * 
 * @author JeetKhatri
 * @since Jan,18
 *
 */
package CreationalDesignPatterns.FactoryDesignPattern;
public class FactoryBookTicketPlatinum extends FactoryBookTicketAbstractClass {
	/***
	 * @return Price of 1 ticket.
	 */
	@Override
	public int getPrice() {
		return 200;
	}

}
