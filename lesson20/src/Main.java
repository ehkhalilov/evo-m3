
public class Main {
    public static void main(String[] args) {
//        Currency[] currencies = ;

//        for (Currency currency : Currency.values()) {
//            System.out.println(currency);
//        }

//        System.out.println(Currency.EUR.ordinal());

//        Currency currency = Currency.valueOf("TL");
//        System.out.println(currency.ordinal());

        double amount = Currency.USD.convert(200, Currency.EUR);
        System.out.println(amount);


//        Currency currency = null;
//
//        if (currency.equals(Currency.USD)) {
//
//        }
    }
}
