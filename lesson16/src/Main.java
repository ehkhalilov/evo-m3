import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        System.out.println(num);


//        String message = "Hello World!";
//
//        try {
//            FileOutputStream fos = new FileOutputStream("test.txt");
//            fos.write(message.getBytes());
//            fos.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        try (FileInputStream fileInputStream = new FileInputStream("test.txt")) {
//            String message = "";
//            byte[] array = fileInputStream.readAllBytes();
//            for (int i = 0; i < array.length; i++) {
//                message += (char) array[i];
//            }
//            System.out.println(message);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try (
                FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
