/***
 * 
 * @author JeetKhatri
 * @since Jan,2018
 *
 */

package BehavioralDesignPatterns.CommandPattern;
public class MenuOptions {

	private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;
 
    public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
        this.openCommand = open;
        this.saveCommand = save;
    }
    /***
     * open document command execute here
     */
    public void clickOpen(){
       openCommand.execute();
    }
    
    /***
     * save document command execute here
     */
    public void clickSave(){
      saveCommand.execute();
    }

	
}
