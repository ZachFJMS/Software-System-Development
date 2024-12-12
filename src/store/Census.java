package store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Census {
	
	private List<Person> people = new ArrayList<Person>();
	
	void addPerson(Person person) {
		people.add(person);
	}
	
	boolean removePerson(Person person) {
		if (people.contains(person)) {
			people.remove(person);
			return true;
		}
		else {
			System.out.println("person is not in list");
			return false;
		}
	}
	
	int countPeople() {
		System.out.println(people.size());
		return people.size();
	}
	int countMales() {
		int count = 0;
		for (Person person : people) {
			boolean Sex = person.gender; 
				if(Sex == true) {
					count++;
					}
				}
		System.out.println(count);
		return count;
			}
		
	int countFemales() {
	int count = 0;
	for (Person person : people) {
		boolean Sex = person.gender; 
			if(Sex == false) {
				count++;
				}
			}
	System.out.println(count);
	return count;
		}
	
	void sortOnAge() {
		    Collections.sort(people, new Comparator<Person>() {
		        @Override
		        public int compare(Person p1, Person p2) {
		            // Compare ages directly (assuming age is an int)
		            return Integer.compare(p1.age, p2.age); // or p1.age - p2.age
		        }
		    });
		}
	
	void sortOnHeight() {
		Collections.sort(people, new Comparator<Person>() {
	        @Override
	        public int compare(Person p1, Person p2) {
	            
	            return Integer.compare(p1.height, p2.height); 
	        }
	    });
	}
	void sortOnGender() {
		Collections.sort(people, new Comparator<Person>() {
	        @Override
	        public int compare(Person p1, Person p2) {
	        
	            return Boolean.compare(p1.gender, p2.gender); 
	        }
	    });
	}
	
	
	
		
	
	
	
	
	
	@Override
	public String toString() {
		System.out.println(people);
		return null;
	}

}

