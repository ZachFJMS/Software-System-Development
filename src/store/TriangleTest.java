package store;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void isIsoscelesTest() {
		Triangle triangle = new Triangle(60,40,60);
		assertTrue(triangle.isIsosceles());
		assertFalse(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
	}
	
	@Test
	void isEquilateralTest() {
		Triangle triangle = new Triangle(60,60,60);
		assertFalse(triangle.isIsosceles());
		assertTrue(triangle.isEquilateral());
		assertFalse(triangle.isScalene());
	}
	
	@Test
	void isScaleneTest() {
		Triangle triangle = new Triangle(60,40,20);
		assertFalse(triangle.isIsosceles());
		assertFalse(triangle.isEquilateral());
		assertTrue(triangle.isScalene());
	}
	
	

}
