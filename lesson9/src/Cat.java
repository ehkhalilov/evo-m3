public class Cat extends Animal {
    String test;

    Cat(String name, int age, String test) {
        super(name, age);
        this.test = test;
    }

    void meow() {
        System.out.println("Cat is meowing...");
    }
}
