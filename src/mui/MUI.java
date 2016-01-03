package mui;

import java.util.Vector;
import mui.exception.MenuException;
import mui.menu.item.Item;
import mui.exception.ExitMenuException;
import mui.exception.BadMenuChoiceException;
import java.util.Scanner;

public class MUI {
    
    private Vector<Item> items;

    public MUI() {
    	
        items = new Vector<Item>();
    
    }

    public void addItem(Item item) {
        
    	items.add(item);
    
    }

    public void show() {
    	
    	System.out.println("Choose an item from the menu:");
        for(int i=0; i<items.size(); ++i) {
            System.out.println( (i+1) + " " + items.elementAt(i).getName() );
        }
    
    }
    
    public void run() throws ExitMenuException {
    	
    	while(true) {
    		
    		show();
    		Scanner input = null;
    		
    		try {
    			
    			input = new Scanner(System.in);
    			int choice = input.nextInt();
    			if(choice < 1 || choice > items.size()) {
    				throw new BadMenuChoiceException(choice, items.size());
    			}
    			items.elementAt(choice-1).action();
    			
    		} catch(ExitMenuException e) {
    			
    			return; //break out of the loop
    			
    		} catch(BadMenuChoiceException e) {
    			
    			System.err.println(e);
    			return;
    			
    		} catch(MenuException e) {
    			
    			System.err.println("A menu exception has occured.");
    			return;
    			
    		} finally {
    			
    			input.close();
    			
    		}
    		
    	}
    	
    }

}
