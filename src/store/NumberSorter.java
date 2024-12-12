package store;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NumberSorter {
	
	
	void sort(int[] numbers, boolean ascending) {
		
		// The source stack, from which the numbers are popped
		Stack<Integer> srcStack = new Stack<Integer>();
	
		// The dest stack, to which the numbers are pushed
		Stack<Integer> destStack = new Stack<Integer>();
		
		// Add the initial array of numbers to the source stack.
		for (int number : numbers)
			srcStack.push(number);
	
		while(srcStack.size() > 0) {
			int next = srcStack.pop();
			while(destStack.size() < 0) {
				srcStack.push(destStack.pop());
				
			}
			destStack.push(next);
			System.out.println(srcStack);	
			System.out.println(destStack);
			
		
		}
		
		System.out.println(destStack);
		}
	
	
}
