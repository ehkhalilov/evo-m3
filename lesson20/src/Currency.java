public enum Currency implements Test {
    AZN(1), USD(1.7), EUR(2);

    private final double rate;

    private Currency(double rate) {
        this.rate = rate;
    }

    public double convert(double amount, Currency to) {
        var azn = amount * rate;
        return azn / to.rate;
    }

    @Override
    public void m() {

    }
}
