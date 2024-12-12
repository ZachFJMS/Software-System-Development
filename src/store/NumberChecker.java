package store;

public class NumberChecker {

	int findMax(Integer [] numbers) {
		int max = 0;
		int counter = 1;
		for(int i : numbers) {
			try {
			if(i > numbers[counter]) {
				max = i;
				counter++;
				
			}
			else {
				counter++;
				
			}
			}
			catch(IndexOutOfBoundsException e) {
				break;
			}
		}
		return max;
		
	}
}
