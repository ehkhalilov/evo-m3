import java.text.CharacterIterator;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Customer customer1 = new Customer("Elnur", 30);
        Customer customer2 = new Customer("Elnur", 30);

        System.out.println(customer1.equals(triangle));

//        Circle circle = new Circle();
//
//
//        test(circle);
//        test(triangle);

    }

    static void test(Figure figure) {
        if (figure instanceof Circle) {
            Circle circle = (Circle) figure;
            circle.m();
        } else if (figure instanceof Triangle) {
            Triangle triangle = (Triangle) figure;
        }

//        System.out.println(figure.perimeter());
    }
}
