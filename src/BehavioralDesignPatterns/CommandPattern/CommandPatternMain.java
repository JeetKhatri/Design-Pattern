/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.CommandPattern;
public class CommandPatternMain {
	
	public static void main(String[] args) {
		
		// creating object of Document 
        Document doc = new Document();
        
        // Object created
        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);
        
        //object pass in the constructor of MenuOptions
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);
        
        // command 
        menu.clickOpen();
        menu.clickSave();
       
        
    }

}
