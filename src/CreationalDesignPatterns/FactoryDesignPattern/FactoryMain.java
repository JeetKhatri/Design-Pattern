/***
 * 
 * @author JeetKhatri
 * @since Jan,18
 * 
 */
package CreationalDesignPatterns.FactoryDesignPattern;
public class FactoryMain {

	public static void main(String[] args) {
		
		// Creating object of FactoryBookTicketSelection
		FactoryBookTicketSelection obj = new FactoryBookTicketSelection();
		
		//Assigning the child object to FactoryBookTicketAbstractClass
		FactoryBookTicketAbstractClass ticketObj = obj.getPlan("PlatinumTicket");
		
		//If ticketObj is not null then it will display the price of the ticket. 
		if(ticketObj!=null)
			System.out.println("Total ticket price : "+ticketObj.totalPrice(5));
		else
			System.out.println("Invalid plan,\nPlease give valid ticket plan.");
	}
}
