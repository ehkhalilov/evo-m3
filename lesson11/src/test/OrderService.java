package test;

public abstract class OrderService {
    int count;

    OrderService() {

    }

    OrderService(int count) {
        this.count = count;
    }

    void test() {
        System.out.println("Test");
    }

    abstract int m();
}
