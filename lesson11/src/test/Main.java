package test;

public class Main {
    public static void main(String[] args) {
//        test.OrderService orderService = new test.OrderServiceImpl();
//        System.out.println(orderService.m());

        Circle circle = new Circle(5, 1);
        Triangle triangle = new Triangle(3, 4, 5, 6);

        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
    }
}
