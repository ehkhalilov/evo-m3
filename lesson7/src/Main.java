import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 29;

        Account account = new Account("12345", 100);

        Customer customer = new Customer("Elnur", age);
        customer.test(account);

        System.out.println(account.balance);
//
//        System.out.println(customer.sum(3));
//        System.out.println(customer.sum(5));

//        Customer customer2 = new Customer();
//
//        customer1.name = "Elnur";
//        customer2.name = "Ali";
//
//        customer1 = customer2;
//        customer2.name = "Famil";
//
//        System.out.println(customer1);
//        System.out.println(customer2);


//        Account account = new Account();
//        account.accountNumber = "123456";
//        account.balance = 100;
//
//        Customer customer = new Customer();
//        customer.setAccount(account);


//        customer.m1();
//        int a = customer.m2();
    }

}
