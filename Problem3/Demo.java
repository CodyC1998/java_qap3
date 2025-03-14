package Problem3;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Ellipse(6, 4),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(5)
        };

        System.out.println("Shapes before scaling:");
        printShapes(shapes);

        scaleShapes(shapes, 2);

        System.out.println("\nShapes after scaling:");
        printShapes(shapes);
    }

    public static void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape); 
        }
    }

    public static void scaleShapes(Scalable[] scalableShapes, double factor) {
        System.out.println("\nScaling all shapes by factor of " + factor + "...");
        for (Scalable shape : scalableShapes) {
            shape.scale(factor);
        }
    }
}

