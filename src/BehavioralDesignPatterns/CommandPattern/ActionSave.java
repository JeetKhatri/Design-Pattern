/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.CommandPattern;
public class ActionSave implements ActionListenerCommand{
	
	private Document doc;
	 
	/***
	 *  This method save the document
	 * @param doc document
	 */
    public ActionSave(Document doc) {
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.save();
    }

}
