package mui.exception;

public class BadMenuChoiceException extends MenuException {

	private int choice;
	private int max;
	/**
	 * 
	 */
	private static final long serialVersionUID = 538329593135303863L;
	
	public BadMenuChoiceException(int i, int max) {
		
		choice = i;
		this.max = max;
		
	}
	
	@Override
	public String toString() {
		
		return "Menu choice " + choice + " is not valid. It must be between 1 and " + max + ".";
		
	}

}
