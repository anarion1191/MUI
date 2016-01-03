package mui.menu.item;

import mui.exception.MenuException;

public abstract class Item {
    
    protected String name;

    /**
     * 
     * @return True if the menu loop must continue after
     * the function has finished execution. False if
     * the menu loop must end.
     * @throws MenuException If a bad menu item has been selected
     */
    public abstract boolean action() throws MenuException;

    public String getName() {
    	
        return name;
        
    }

}
