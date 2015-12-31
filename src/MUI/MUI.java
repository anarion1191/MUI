package MUI;

import java.util.Vector;
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
            System.out.println(items.elementAt(i).getName());
        }
    
    }
    
    public void run() {
    	
    	boolean exit = false;
    	
    	while(!exit) {
    		
    		show();
    		Scanner input = null;
    		
    		try {
    			
    			input = new Scanner(System.in);
    			int choice = input.nextInt();
    			if(choice < 1 || choice > 1) {
    				
    				throw new BadMenuChoiceException();
    				
    			}
    			
    		} catch(BadMenuChoiceException e) {
    			
    			System.out.println("Bad menu choice selected!");
    			
    		}
    		//user input
    		//if input is "exit", quit the loop
    	}
    	
    }

}
