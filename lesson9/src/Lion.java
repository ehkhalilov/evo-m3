public class Lion extends Cat {
    String test;

    Lion(String name, int age, String test, String test1) {
        super(name, age, test);
        this.test = test1;
    }

    void meow() {
        System.out.println("Lion is meowing...");
    }

    void test() {
        System.out.println(this.test);
        System.out.println(super.test);
    }
}
