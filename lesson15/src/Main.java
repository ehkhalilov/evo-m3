import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // yeni Customer class yaratmaq field-er String name, int age, String fin
        // Custom exception yaratmaq unchecked
        // if age less than 18 throw age exception
        // if fin length  not equal 7 symbols fin is invalid exception


        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 20) {
            try {
                throw new ValidationException("Age must be more than 20");
            } catch (ValidationException e) {
                throw new RuntimeException(e);
            }
        }

//        try {
//            FileWriter fileWriter = new FileWriter("test.txt");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//


//        int[] arr = {1, 2, 3};
//        int num = 5;
//
//        try {
//            System.out.println(num / 0);
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            System.out.println(arr[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("end");
    }
}
