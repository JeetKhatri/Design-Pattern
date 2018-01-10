/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package StructuralDesignPatterns.FacadeDesignPattern;

public class ShopKeeper {
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop google;

	/***
	 *  This method create the object of the iphone,samsung,google
	 */
	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		google = new Google();
	}

	/***
	 * this method calls iphone's method
	 */
	public void iphoneSale() {
		iphone.modelName();
		iphone.price();
	}

	/***
	 * this method calls samsung's method
	 */
	public void samsungSale() {
		samsung.modelName();
		samsung.price();
	}

	/***
	 * this method calls google's method
	 */
	public void googleSale() {
		google.modelName();
		google.price();
	}
}
