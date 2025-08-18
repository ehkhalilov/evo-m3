public class CardServiceImpl extends BankProduct implements ProductService {
    @Override
    public void createProduct(Product product) {

    }

    @Override
    public void deleteProduct(String name) {

    }

    @Override
    public Product[] getProducts() {
        Product product1 = new Product("Apple watch", 700);
        Product product2 = new Product("Apple watch", 700);

        Product[] products = {product1, product2};

        return products;
    }

    @Override
    public Product getProduct(String name) {
        return null;
    }

    @Override
    public void m() {

    }
}
