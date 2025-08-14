public class Animal {
    String name;
    int age;
    final static String test = "Hello";

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Animal() {

    }

    void eat() {
        System.out.println(name + " is eating...");
    }
}
