package Problem3;

public class Ellipse extends Shape {
    private double a, b;

    public Ellipse(double a, double b) {
        super("Ellipse");
        if (b > a) { 
            double temp = a;
            a = b;
            b = temp;
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - (a - b) * (a - b) / 2);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}

