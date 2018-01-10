/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package StructuralDesignPatterns.FacadeDesignPattern;

public class FacadePatternMain {
	public static void main(String[] args) {
		
		//creating object of the shopkeeper
		ShopKeeper sk = new ShopKeeper();
		
		//calls method of iphone, samsung, google
		sk.iphoneSale();
		sk.samsungSale();
		sk.googleSale();
	}
}
