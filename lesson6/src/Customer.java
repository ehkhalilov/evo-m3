public class Customer {
    String name;
    int age;

    public Customer() {

    }

    void m1() {
        int a = 5;
        int b = 10;

        int c = a + b;
        return;
    }

    String m2() {
        int a = 5;
        int b = 10;
        if (a == 5) {
            return "a == 5";
        }
        int c = a + b;

        return "";
    }

    int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    int max(int a, int b) {
        return a > b ? a : b;
    }
}
