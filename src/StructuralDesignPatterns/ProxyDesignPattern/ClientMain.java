/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 * 
 */

package StructuralDesignPatterns.ProxyDesignPattern;

public class ClientMain {
	public static void main(String[] args) {
		// Creating object of the ProxyInternet and assign it to Internet
		Internet internet = new ProxyInternet();

		System.out.println(internet.connectTo("abc.com"));
		System.out.println(internet.connectTo("geeksforgeeks.org"));
	}
}
