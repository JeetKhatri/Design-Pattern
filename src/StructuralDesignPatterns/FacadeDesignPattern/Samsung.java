/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package StructuralDesignPatterns.FacadeDesignPattern;

public class Samsung  implements MobileShop{

	@Override
	public void modelName() {
		System.out.println("\nName : samsung J7");
	}

	@Override
	public void price() {
		System.out.println("Price : 35000 Rs.");
	}

}
