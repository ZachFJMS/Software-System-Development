package store;

public class ArrayProcessor {
	int count = 0;
	
	int getArrayLength(Object [] a) {
		try {
			while (true) {
			Object t = a[count];
			count++;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return count; 
			
		}
	}

}
