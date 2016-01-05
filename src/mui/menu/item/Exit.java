package mui.menu.item;

/**
 * Class representing the Exit menu item.
 * The returning value of the {@code action()}
 * method is used to determine if the program
 * must be terminated.
 * 
 * @author Kian Nejadfard
 *
 */
public class Exit extends Item {
	
	/**
	 * Only need to set the {@code name} field.
	 */
    public Exit() {
        
    	name = "Exit";
    
    }
    
    /**
     * No special action needs to be done.
     * 
     * @return false To indicate that the program
     * must terminate.
     */
    public boolean action() {
        
    	return false;
    
    }
    
}
