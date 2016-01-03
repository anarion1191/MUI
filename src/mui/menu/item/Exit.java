package mui.menu.item;

import mui.exception.ExitMenuException;
import mui.exception.MenuException;

public class Exit extends Item {
	
    public Exit() {
        
    	name = "Exit";
    
    }
    
    public void action() throws MenuException {
        
    	throw new ExitMenuException();
    
    }
    
}
