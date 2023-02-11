public class Circle extends Shape {

    //Properties that a circle might have
    private double radius;

    //Circle constructor
    public Circle(String color, String pattern, double radius) {
        super(color, pattern);
        this.radius = radius;
    }

    //Formula to get the area of a circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //String method for details about the circle
    @Override
    public String toString() {
        return "Circle details: Radius= " + radius + ". Color= " + getColor() + ". Pattern= " + getPattern() + ".";
    }
}
