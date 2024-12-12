package store;

public class Menu {

	void displayMenuOption(int opt) throws InvalidOptionException {
		if(opt > 3 || opt < 1) {
			System.out.println("Not a valid option");
			throw new InvalidOptionException();
			
		}
		switch(opt) {
		
		case 1:
			System.out.println("option 1 selected");
			break;
		case 2:
			System.out.println("option 2 selected");
			break;
		case 3:
			System.out.println("option 3 selected");
			break;
		}
	}
}
