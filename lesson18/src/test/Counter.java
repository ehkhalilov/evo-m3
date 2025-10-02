package test;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static volatile AtomicInteger count = new AtomicInteger(0);

    public static void increment() {
        count.incrementAndGet();
    }

    //    public void increment1() {
//        ++count;
//    }
//
    public static AtomicInteger getCount() {
        return count;
    }
//
//    public void test() {
//        Counter counter = new Counter();
//        synchronized (counter) {
//            counter.increment1();
//        }
//    }


}
