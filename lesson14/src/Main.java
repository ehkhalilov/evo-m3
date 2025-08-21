import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = factorial(5);
        System.out.println(num);
//        printNum(100);
//        Scanner scanner = null;
//        try {
//            scanner.nextInt();
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }


//        int a = 100;
//
//
//        for (int i = 0; i < 100; i++) {
//            try {
//                System.out.println(a / i);
//            } catch (ArithmeticException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println("end");
    }

    public static void printNum(int num) {
        if (num < 0) {
            return;
        }

        printNum(num - 1);

        if (num % 2 == 0) {
            System.out.println(num);
        }
    }

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

//    [print(100)] [print99] [print(98)] [] [] [] [] [] [] [] [] [] [print(0)]
}
