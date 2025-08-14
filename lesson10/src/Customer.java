import java.util.Objects;

public class Customer {
    String name;
    int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "name: " + name + ", age: " + age;
    }

//    public boolean equals(Object obj) {
//        if (!(obj instanceof Customer)) {
//            return false;
//        }
//        Customer customer = (Customer) obj;
//
//        return this.name == customer.name && this.age == customer.age;
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Customer customer)) return false;
//        return age == customer.age && Objects.equals(name, customer.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name);
    }

}
