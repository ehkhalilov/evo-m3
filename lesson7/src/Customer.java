import javax.accessibility.AccessibleComponent;

public class Customer {
    String name;
    int age;

    Customer() {

    }

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void test(Account account) {
        account.balance = 200;
        // code write data to file
    }

    int sum(int a) {
        return a + 53;
    }
}
