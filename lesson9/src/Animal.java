public class Animal {
    String name;
    int age;

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
