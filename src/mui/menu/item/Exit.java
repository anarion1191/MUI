package mui.menu.item;

import mui.exception.MenuException;

public class Exit extends Item {
	
    public Exit() {
        
    	name = "Exit";
    
    }
    
    public boolean action() throws MenuException {
        
    	return false;
    
    }
    
}
