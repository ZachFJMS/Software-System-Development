package store;

public class PersonDriver {

	public static void main(String[] args) {
		
		Census person = new Census();
		
		Person Zach = new Person(185,20,true);
		Person Jo = new Person(160,67,false);
		Person Lewis = new Person(185,42,true);
		Person Harry = new Person(175,19,true);
		
		person.addPerson(Zach);
		person.addPerson(Jo);
		person.addPerson(Lewis);
		person.addPerson(Harry);
		person.countMales();
		person.countFemales();
		person.sortOnHeight();
		person.toString();
		

	}

}
