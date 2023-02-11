public class Shape {

    //What properties would all shapes have?
    private String color;
    private String pattern;

    //Shape constructor
    public Shape(String color, String pattern) {
        this.color = color;
        this.pattern = pattern;
    }

    //Getters for color and pattern
    public String getColor() {
        return color;
    }

    public String getPattern() {
        return pattern;
    }

    //Superclass getArea method
    public double getArea() {
        return 0.0;
    }

    //String method to print details about the shape
    @Override
    public String toString() {
        return "Shape details: " + "color='" + color + ", pattern='" + pattern + '.';
    }
}
