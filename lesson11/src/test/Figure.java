package test;

public abstract class Figure {
    int z;

    public Figure(int z) {
        this.z = z;
    }

    abstract double area();

    abstract double perimeter();
}
