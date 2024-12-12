package shapes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Implements the {@link ShapeCollection} interface using an underlying map allowing the number of occurrences of each added shape to be counted.
 * 
 * If the same shape is added more than once, then it is not re-added, but its occurrence count is increased.
 * 
 * @author mdixon
 */
public class ShapeMap implements ShapeCollection {

	/**
	 * A collection which maps contained shapes to an occurrence count.
	 */
	private Map<Shape, Integer> shapes; // TODO PART5 : create a suitable map instance

	///////////////////////////////////////////////////////////////////////

	@Override
	public int addShape(Shape shape) {

		// TODO PART5 : add the shape to the map setting the correct associated occurrence count
		// if the shape was not already in the map, set the associated count to 1
		// otherwise increase the existing occurrence count.
		// finally, return the total number of key/value pairs in the map

		return 0;
	}

	@Override
	public boolean removeShape(Shape shape) {

		// TODO PART5 : remove the shape if it exists and return true. Return false if it does not exist.
		return false;
	}

	@Override
	public boolean containsShape(Shape shape) {

		// TODO PART5 : check if the map contains the given shape as a key
		return false;
	}

	@Override
	public int shapeCount() {

		// TODO PART5 : return the number of key/value pairs in the map
		return -1;
	}

	@Override
	public void clearAllShapes() {

		// TODO PART5 : remove all shapes form the map
	}

	@Override
	public int indexOfShape(Shape shape) {

		// TODO PART5 : throw correct exception which indicates this is an unsupported operation
		return 0;
	}

	@Override
	public Shape getLargestShape() {
		
		// TODO PART5 : iterate the map, and find the shape with the largest area

		return null;
	}

	@Override
	public Shape getSmallestShape() {
		
		// TODO PART5 : iterate the map, and find the shape with the smallest area
		return null;
	}

	@Override
	public int countShapeOfName(String name) {

		// TODO PART5 : iterate the map and count the shapes which have the given name (ignoring case).
		return 0;
	}
	
	/**
	 * Gets the shape which has the highest occurrence count (i.e. has been added to the collection the most number of times).
	 * 
	 * @return the shape which has been added to the collection the most number of times, null if no shapes exist within the collection.
	 */
	public Shape getMostCommonShape() {
		
		Shape shape = null;
		int max = 0;

		// TODO PART5 : iterate the map and find the shape with the highest occurrence count
		
		return shape;
	}
	
	/**
	 * Gets the occurrence count of the most common shape.
	 * 
	 * @return the occurrence count of the most common shape, 0 if no shapes exist within the collection.
	 */
	public int getMostCommonShapeCount() {

		Shape shape = getMostCommonShape();

		// TODO PART5 : if the shape is not null, then get the associated occurrence count from the map

		return 0;
	}
	
	///////////////////////////////////////////////////////////////////////

}
