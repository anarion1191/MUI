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
     * 
     * @return True if the menu loop must continue after
     * the function has finished execution. False if
     * the menu loop must end.
     * @throws MenuException If a bad menu item has been selected
     */
    public abstract boolean action();

    final public String getName() {
    	
        return name;
        
    }

}
