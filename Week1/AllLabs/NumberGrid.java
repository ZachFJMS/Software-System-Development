package store;

public class NumberGrid {

	void output(int range) {
		for(int row =1;row <= range; row++) {
			for(int column = 1; column <= range; column++) {
				System.out.print(row + " ");			
				}
			System.out.println();
		}
		
	}
}
