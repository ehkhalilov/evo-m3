public class Customer {
    String name;
    int age;
    static double PI;

//    {
//        System.out.println("Default block");
//    }
//
//    static {
//        System.out.println("Static block");
//    }

    Customer() {
        System.out.println("Default constructor");
    }

    Customer(int age) {
        this.age = age;
    }

    Customer(String name) {
        this.name = name;
    }

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Customer(double a) {

    }

    int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(double a, int b, int c) {
        if (b == 0) {
            return b;
        }
        System.out.println(Test.age);
        return (int) (a + b + c);
    }

    class Test {
        static int age;
    }

    class Test2 {
        static int age;
    }

}
