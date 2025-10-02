//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String text = "Hello World!";
//        text = text + "!";
//
//        System.out.println(text);
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" world!");
        stringBuilder.append(6);

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuilder.append(" world!");

        System.out.println(stringBuilder);


    }
}
