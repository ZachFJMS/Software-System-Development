public class Circle extends Shape{

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getArea() {
        double area = (3.14 * radius * radius);
        return (int)area;
    }

    Circle(int radius) {
        super(1);
        this.radius = radius;
    }

    public String toString() {
        return ("radius- "+ radius+ ", area- "+ getArea()
                + ", sides- "+ getSides());
    }
}
