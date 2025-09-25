package test;

import static java.lang.Thread.currentThread;

public class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            Counter.increment();
        }
    }


//    @Override
//    public void run() {
//
//        for (int i = 0; i < 1000; i++) {
//            try {
//                currentThread().sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(currentThread().getName() + " " + i);
//        }
//    }
}
