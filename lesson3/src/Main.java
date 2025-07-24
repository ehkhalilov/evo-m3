import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String season;

        switch (a) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3, 4, 5:
                season = "Spring";
                break;
            case 6, 7, 8:
                season = "Summer";
                break;
            case 9, 10, 11:
                season = "Autumn";
                break;
            default:
                season = "undefined";
        }

        System.out.println(season);

//        & | ^

//        System.out.println(5 & 3);
//        101
//        011
//        110
//        int a = 5;
//
//        int b = a++;
//        a += 10;// a = a + 10;

//        && ||
//        int a = 5;
//        int b = 10;
//
//        System.out.println(a == 10 && b > 0);
//        System.out.println(true && false);


//        System.out.println(-10 >>> 2);

//        00000001011
//        00000010100
//        00000000010

//        int a = 0;
//        String txt = "Hello";
//
//        String result = txt == "Hello" ? "Positive" : "Negative";
//        System.out.println(result);
//        {
//            int y = 10;
//        }
//        int y = 5;
//        int a = -5;
//
//        if (a == 5) {
//            int b = 10;
//            if (b != 10) {
//                int c = a + b;
//                System.out.println(c);
//            }
//            System.out.println("a == 5");
//        } else if (a > 0) {
//            System.out.println("a > 0");
//        } else {
//            System.out.println("else");
//        }

//        int a = 10;
//        switch (a) {
//            case 1, 10:
//                System.out.println("a == 1");
////            case 10:
////                System.out.println("a == 10");
////                break;
//            case 3:
//                System.out.println("a == 3");
//                break;
//            default:
//                System.out.println("default");
//        }

//        System.out.println(b);

//        if (a > 0) {
//            System.out.println("a > 0");
//        }
    }
}
