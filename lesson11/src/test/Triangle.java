package test;

public class Triangle extends Figure {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c, int z) {
        super(z);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        return a * b * c;
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}
