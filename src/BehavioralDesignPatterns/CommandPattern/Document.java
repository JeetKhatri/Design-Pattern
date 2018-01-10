/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.CommandPattern;

public class Document {

	/***
	 * This method open the document
	 */
	public void open() {
		System.out.println("Document Opened");
	}

	/***
	 * This method save the document
	 */
	public void save() {
		System.out.println("Document Saved");
	}

}
