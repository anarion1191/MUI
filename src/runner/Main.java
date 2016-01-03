package runner;

import mui.exception.MenuException;

public class Main {

	public static void main(String[] args) {
		
		try {	
			
			MyMenu menu = new MyMenu();
			menu.run();
			
		} catch(MenuException e) {
			
			System.err.println(e);
			
		}
		
	}

}
