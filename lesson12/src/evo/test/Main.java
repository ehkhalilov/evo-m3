package evo.test;

import evo.demo.Customer;
import test.Circle;
import test.Figure;

import static evo.demo.Customer.TEST;
import static evo.demo.Customer.test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Elnur");

        System.out.println(TEST);

        test();
//        customer.setName("Elnur");
        Figure figure = new Circle(2, 5);
    }
}

// public protected default private
