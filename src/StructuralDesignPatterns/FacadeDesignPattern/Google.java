/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package StructuralDesignPatterns.FacadeDesignPattern;

public class Google implements MobileShop{

	@Override
	public void modelName() {
		System.out.println("\nName : Google Pixel 2");
	}

	@Override
	public void price() {
		System.out.println("Price : 60000 Rs.");
	}
}
