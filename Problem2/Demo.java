package Problem2;

public class Demo {
    public static void main(String[] args) {
        // Test Point class
        Point p1 = new Point(3.5f, 2.0f);
        System.out.println("Point: " + p1);

        // Test MovablePoint class
        MovablePoint mp1 = new MovablePoint(3.5f, 2.0f, 1.5f, 1.0f);
        System.out.println("Before move: " + mp1);
        mp1.move();
        System.out.println("After move: " + mp1);
    }
}
