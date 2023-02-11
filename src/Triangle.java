public class Triangle extends Shape {

    //Properties that a triangle would have
    private double base;
    private double height;

    //Constructor for triangle
    public Triangle(String color, String pattern, double base, double height) {
        super(color, pattern);
        this.base = base;
        this.height = height;
    }

    //Method to getArea of the triangle
    @Override
    public double getArea() {
        return 0.5 * (base * height);
    }

    //String method to print out triangle details

    @Override
    public String toString() {
        return "Triangle details: Base= " + base + ". Height= " + height + ". Color= " + getColor() + ". Pattern= " + getPattern() + ".";
    }
}
