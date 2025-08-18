public interface ProductService extends Test {
    String TEXT = "Text";

    void createProduct(Product product);

    void deleteProduct(String name);

    Product[] getProducts();

    Product getProduct(String name);

    public default int getInfo() {
        return 0;
    }

    static void test() {

    }
}
