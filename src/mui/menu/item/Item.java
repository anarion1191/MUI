package mui.menu.item;

/**
 * Abstract class representing a menu item.
 * Menu items should extend the {@code Item}
 * class and override it's {@code action()}
 * method.
 * 
 * @author Kian Nejadfard
 *
 */
public abstract class Item {
    
	/**
	 * A {@code String} representing the menu item's
	 * name that is to be printed in the menu list for
	 * users to see.
	 */
    protected String name;

    /**
     * Abstract function that must be overridden by
     * subclasses to perform necessary actions for
     * a certain menu item.
     * 
     * @return True if the menu loop must continue after
     * the function has finished execution. False if
     * the menu loop must end.
     */
    public abstract boolean action();

    /**
     * Get the name field of a menu item.
     * 
     * @return {@code String} The name of the menu item
     */
    final public String getName() {
    	
        return name;
        
    }
    
    /**
     * Set the name field of a menu item.
     * 
     * @param newName A {@code String} object containing the name 
     */
    final public void setName(String newName) {
    	
    	name = newName;
    	
    }

}
