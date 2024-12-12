package store;

public class Person {
	
	int height = 0;  // height in cm
	int age = 0;  // age in years
	boolean gender = false;  // fermale is false, male is true
	
	public Person(int height, int age, boolean gender) {
		super();
		this.height = height;
		this.age = age;
		this.gender = gender;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [height=" + height + ", age=" + age + ", gender=" + gender + "]";
	}

}
