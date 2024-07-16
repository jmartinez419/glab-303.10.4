public  abstract class Shape {
    protected String color;
    protected double height;  // To hold height.
    protected double width;  //To hold width
    protected double base;  //To  hold base

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

// The getArea method is abstract.
    // It must be overridden in a subclass.
    /** All shapes must provide a method called getArea() */
    public abstract double getArea();
    /** Returns a self-descriptive string */

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayshapName()
    {
        System.out.println("I am a Shape.");
    }
    public interface Movable {// An interface defines a list of public abstract methods to be implemented by the subclasses

        void moveUp();    // "public" and "abstract" by default
        void moveDown();
        void moveLeft();
        void moveRight();
        String getCoordinate();
    }


}
