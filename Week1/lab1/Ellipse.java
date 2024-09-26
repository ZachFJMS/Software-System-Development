public class Ellipse extends Rectangle {

    public int getArea(){
        double A = 3.14 * getWidth() * getHeight();
        return (int)A;
    }

    Ellipse(int width, int height) {
        super(2, 4);
    }

    public String toString() {
        return ("AxisA- "+ getWidth()+ ", AxisB- "
                + getHeight()+ ", area- "+ getArea()
                + ", sides- "+ getSides());
    }
}
