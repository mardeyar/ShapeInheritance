public class Rectangle extends Shape {

    //What properties might a rectangle have for this project?
    private double height;
    private double width;

    //Rectangle constructor
    public Rectangle(String color, String pattern, double height, double width) {
        super(color, pattern);
        this.height = height;
        this.width = width;
    }

    //Method to getArea of rectangle
    @Override
    public double getArea() {
        return height * width;
    }

    //String method to print rectangle details
    @Override
    public String toString() {
        return "Rectangle details: Height= " + height + ". Width= " + width + ". Color= " + getColor() + ". Pattern= " + getPattern() + ".";
    }
}
