public enum Currency implements Test {
    AZN(1), USD(1.7), EUR(2);

    private final double rate;

    private Currency(double rate) {
        this.rate = rate;
    }

    public double convert(double amount, Currency to) {
        return amount / rate;
    }

    @Override
    public void m() {

    }
}
