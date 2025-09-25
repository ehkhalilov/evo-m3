package test;

public class Counter {
    private static int count;

    public synchronized static void increment() {
        ++count;
    }

    public void increment1() {
        ++count;
    }

    public static int getCount() {
        return count;
    }

    public void test() {
        Counter counter = new Counter();
        synchronized (counter) {
            counter.increment1();
        }
    }
}
