package mui;

import java.util.Vector;
import mui.exception.MenuException;
import mui.menu.item.Item;
import mui.exception.ExitMenuException;
import mui.exception.BadMenuChoiceException;
import java.util.Scanner;

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
	 * A {@code Vector} containing objects of type {@code Item}
	 * or the subclasses of {@code Item} that construct the
	 * menu.
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
    public void addItem(Item item) {
        
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
