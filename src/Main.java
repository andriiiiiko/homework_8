public class Main {
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();

        Shape circle = new Circle();
        Shape hexagon = new Hexagon();
        Shape octagon = new Octagon();
        Shape pentagon = new Pentagon();
        Shape rectangle = new Rectangle();
        Shape rhombus = new Rhombus();
        Shape square = new Square();
        Shape trapezoid = new Trapezoid();
        Shape triangle = new Triangle();

        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(hexagon);
        shapePrinter.printShapeName(octagon);
        shapePrinter.printShapeName(pentagon);
        shapePrinter.printShapeName(rectangle);
        shapePrinter.printShapeName(rhombus);
        shapePrinter.printShapeName(square);
        shapePrinter.printShapeName(trapezoid);
        shapePrinter.printShapeName(triangle);
    }
}