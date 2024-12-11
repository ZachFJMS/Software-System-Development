package store;


import java.util.HashSet;
import java.util.Set;

public class Emailstore {

	Set<String> emailAddresses = new HashSet<String>();
	
	Boolean addEmail(String email) {
		try {
			if(emailAddresses.contains(email)) {
				System.out.println("Email is a duplicate");
				}
			else
				emailAddresses.add(email);
				return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	Boolean hasEmail(String email) {
		if(emailAddresses.contains(email)) 
			return true;
		else
			System.out.println("email is not in database");
			return false;
		}
		
	
	
	void displayEmails() {
		for(String email : emailAddresses) {
			System.out.println(email);
		}
	}
	
}
