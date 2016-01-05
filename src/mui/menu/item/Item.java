package mui.menu.item;

/**
 * Abstract class representing a menu item.
 * Menu items should extend the {@code Item}
 * class and override it's {@code action()}
 * method.
 * 
 * @author anarion1191
 *
 */
public abstract class Item {
    
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
