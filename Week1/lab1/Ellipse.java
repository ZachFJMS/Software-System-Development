public class Ellipse extends Rectangle {

    public int getArea(){
        double A = 3.14 * width * height;
        return (int)A;
    }

    Ellipse(int width, int height) {
        super(2, 4);
    }

    public String toString() {
        return ("AxisA- "+ width+ ", AxisB- "
                + height+ ", area- "+ getArea()
                + ", sides- "+ getSides());
    }
}
