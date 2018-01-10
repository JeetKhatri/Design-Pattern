/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package StructuralDesignPatterns.FacadeDesignPattern;

public class Iphone implements MobileShop{

	@Override
	public void modelName() {
		System.out.println("Name : Iphone 7");
	}

	@Override
	public void price() {
		System.out.println("Price : 65000 Rs.");
	}

}
