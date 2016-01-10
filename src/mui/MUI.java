package mui;

import java.util.Vector;
import java.util.Scanner;
import mui.menu.item.Item;
import mui.exception.BadMenuChoiceException;

/**
 * Represents a Menu User Interface that is to be
 * extended to create new menus.
 * In order to create a new menu, just extend {@code MUI}
 * and override the constructor. The overridden
 * constructor must call {@code super()} first and then add
 * the necessary menu entries.
 * 
 * @author Kian Nejadfard
 *
 */
public class MUI {
    
    /**
     * A {@code Vector} containing subclasses of {@code Item}
     */
    private Vector<Item> items;

    /**
     * Constructor that initializes the member {@code Vector} object.
     */
    public MUI() {
    	
        items = new Vector<Item>();

    }

    /**
     * Adds a new menu entry to the {@code Vector} that holds
     * all the items.
     * 
     * @param item An object of type {@code Item} or a subclass.
     */
    final public void addItem(Item item) {
        
    	items.add(item);
    
    }

    /**
     * Prints the menu items to {@code System.out}.
     */
    public void show() {
    	
    	System.out.println("Choose an item from the menu:");
        for(int i=0; i<items.size(); ++i) {
            System.out.println( (i+1) + " " + items.elementAt(i).getName() );
        }
    
    }
    
    /**
     * Prints the menu items and gets the user's input
     * in a loop. After each selection, the item's
     * {@code action()} member function is called.
     * 
     * @throws ExitMenuException If the Exit item is selected.
     */
    final public void run() {
    	
    	boolean continueLoop = true;
    	Scanner input = null;
    	
    	while(continueLoop) {
    		
    		show();
    		
    		try {
    			
    			input = new Scanner(System.in);
    			int choice = input.nextInt();
    			if(choice < 1 || choice > items.size()) {
    				throw new BadMenuChoiceException(choice, items.size());
    			}
    			continueLoop = items.elementAt(choice-1).action();
    			
    		} catch(BadMenuChoiceException e) {
    			
    			System.err.println(e);
    			return;
    			
    		} finally {
    			
    			input.close();
    			
    		}
    		
    	}
    	
    }

}
