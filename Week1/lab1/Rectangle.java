public class Rectangle extends Shape{

    public int width;
    public int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(){
        return  width * height;
    }

    Rectangle(int width, int height) {
        super(4);
        this.width = width;
        this.height = height;

    }

    public String toString() {
        return ("width- "+ width+ ", height- "
                + height+ ", area- "+ getArea()
                + ", sides- "+ getSides());
    }
}
