/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.CommandPattern;
public class ActionOpen implements ActionListenerCommand{
	
	private Document doc;
	/***
	 *  This method open the document
	 * @param doc document
	 */
    public ActionOpen(Document doc) {
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.open();
    }

}
