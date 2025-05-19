public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("My Circle");
        Rectangle rect = new Rectangle("My Rectangle");
        ShapePrinter shapePrinter = new ShapePrinter();
        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(rect);
    }
}
