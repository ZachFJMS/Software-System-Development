package store;

public class DriverArray {

	public static void main(String[] args) {
		
		ArrayProcessor ap = new ArrayProcessor();
		int len = ap.getArrayLength(new String[] {"one", "two", "three", "four"});
		System.out.println("Array length is " +len);

		Menu A = new Menu();
		try {
			A.displayMenuOption(1);
			A.displayMenuOption(2);
			A.displayMenuOption(3);
			A.displayMenuOption(4);
		} catch (InvalidOptionException e) {
			
			e.printStackTrace();
		}
	}

}
