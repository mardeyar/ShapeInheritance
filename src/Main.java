public class Main {
    public static void main(String[] args) {

        //Instantiate some objects of each shape class
        Circle myCircle = new Circle("Red", "Gradient", 12.6);
        Rectangle myRectangle = new Rectangle("Blue", "Striped", 10.71, 20);
        Triangle myTriangle = new Triangle("Yellow", "Solid", 20.85, 20);

        //Get the area of each shape
        System.out.println("\nCircle area: " + myCircle.getArea());
        System.out.println("Rectangle area: " + myRectangle.getArea());
        System.out.println("Triangle area: " + myTriangle.getArea());

        //Print details about each shape
        System.out.println("\n" + myCircle.toString());
        System.out.println(myRectangle.toString());
        System.out.println(myTriangle.toString());
    }
}