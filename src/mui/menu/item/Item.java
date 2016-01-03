package mui.menu.item;

import mui.exception.MenuException;

public abstract class Item {
    
    protected String name;

    public abstract void action() throws MenuException;

    public String getName() {
    	
        return name;
        
    }

}
