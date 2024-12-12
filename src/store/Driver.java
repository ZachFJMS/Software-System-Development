package store;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "JJ. Jognson", 38));
		students.add(new Student(2, "P. Tibbs", 48));
		students.add(new Student(3, "W. Major", 28));
		students.add(new Student(4, "P. Turner", 60));
		students.add(new Student(5, "A. Ball", 20));
		students.add(new Student(6, "B. Smithy", 90));
		students.add(new Student(7, "R. Jules", 71));
		students.add(new Student(8, "T. Verne", 97));
		
		
		

		
		// create your Stream solutions here
		students.stream().forEach(System.out::println);
		
		System.out.println(" ");
		System.out.println("70 or above Grade: ");
		
		students.stream().filter(s -> s.getGrade() >= 70)
			.forEach(System.out::println);
		
		System.out.println(" ");
		System.out.println("Student List: ");
	  //___________________________________________________//
		
		
		Object studentArray = students.stream()
				.map(s -> s.getName().toUpperCase())
				.sorted()
				.collect(Collectors.toList());
				System.out.println(studentArray);
				
		System.out.println(" ");		
		System.out.print("Average Grade: ");
	  //___________________________________________________//
				
		double avegrade =  students.stream()
				.mapToDouble(s -> s.getGrade())
				.average()
				.getAsDouble();
				System.out.print(avegrade);
					
		System.out.println(" ");		
		System.out.println("Int Range: ");		
	  //___________________________________________________//
				
				IntStream.range(90, 100)
				.map(s -> s * s * s)
				.forEach(intRange -> System.out.println(intRange));
				
		System.out.println(" ");
		
		List<Integer> numList = Stream.generate(new Random() ::nextInt)
				.distinct()
				.limit(10)
				.collect(Collectors.toList());
		
		
		for(int next : numList)
			System.out.println("Next value is : " + next);
				
			
		
		
		
	}
}
