/***
 * 
 * @author JeetKhatri
 * @since Jan,18
 *
 */

public class FactoryBookTicketSelection {

	/****
	 * This method get the ticket plan as string and return the object of the particular plan
	 * @param type - send the name of ticket like SilverTicket, GoldTicket etc.
	 * @return return of the object of the particular ticket type
	 * 
	 */
	public FactoryBookTicketAbstractClass getPlan(String type){

		if(type.equalsIgnoreCase("GoldTicket")){
			return new FactoryBookTicketGold();
		}else if(type.equalsIgnoreCase("SilverTicket")){
			return new FactoryBookTicketSilver();
		}else if(type.equalsIgnoreCase("PlatinumTicket")){
			return new FactoryBookTicketPlatinum();
		}
		return null;
	}
}
