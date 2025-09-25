import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 3 method olacaq
        // 1 yeni customer elave olunmasi file-a
        // movcud customer-i adi uzre silmek file-an(tapilmasa customer NotFoundException atmaq)
        // customer-in siyahisini console-a cap etmek

//        Customer customer = new Customer("Ali", 22);
//        addCustomer(customer);

        Customer customer = readCustomer();
        System.out.println(customer);


//        try (
//                FileReader fileReader = new FileReader("test.txt");
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//        ) {
//            System.out.println(bufferedReader.readLine());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static void addCustomer(Customer customer) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(customer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Customer readCustomer() {
        try (FileInputStream fis = new FileInputStream("test.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Customer) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
