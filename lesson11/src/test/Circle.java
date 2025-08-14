package test;

public class Circle extends Figure {
    static final double PI = 3.14;
    double r;

    public Circle(double r, int z) {
        super(z);
        this.r = r;
    }

    @Override
    double area() {
        return PI * r * r;
    }

    @Override
    double perimeter() {
        return 2 * PI * r;
    }
}
