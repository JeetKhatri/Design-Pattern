/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package CreationalDesignPatterns.BuilderDesignPattern;

public class CDBuilder {
	/***
	 * This method will call when we want to add sony cd
	 * @param cds 
	 * @return object of CDType
	 */
	public CDType buildSonyCD(CDType cds) {
		// add new item
		cds.addItem(new Sony());
		return cds;
	}
	
	/***
	 * This method will call when we want to add samsung cd
	 * @return object of CDType
	 */
	public CDType buildSamsungCD(CDType cds) {
		// add new item
		cds.addItem(new Samsung());
		return cds;
	}
}