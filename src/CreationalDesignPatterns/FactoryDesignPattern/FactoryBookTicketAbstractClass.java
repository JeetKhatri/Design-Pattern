/***
 * 
 * @author JeetKhatri
 * @since Jan,18
 *
 */
package CreationalDesignPatterns.FactoryDesignPattern;
public abstract class FactoryBookTicketAbstractClass {

	protected int price;

	public abstract int getPrice();
	
	/***
	 * This method calculate the total cost of the tickets.
	 * @param totalTicket - number of ticket you want to buy
	 * @return total price of the tickets.
	 */
	public int totalPrice(int totalTicket){
		return getPrice() * totalTicket;
	}
}
