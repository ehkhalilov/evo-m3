import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String name = scanner.next();

        Customer customer = new Customer(name, age);
        validateCustomer(customer);
    }

    public static void validateCustomer(Object customer) throws IllegalAccessException {
        Field[] fields = customer.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Size.class)) {
                field.setAccessible(true);
                String value = (String) field.get(customer);
                Size size = field.getAnnotation(Size.class);
                int length = value.length();
                if (length < size.min() || length > size.max()) {
                    throw new ValidationException("Size of " + field.getName() + " invalid. Current length: " + length);
                }
                field.setAccessible(false);
            }
        }
    }
}
