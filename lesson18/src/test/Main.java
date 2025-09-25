package test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
//        MyThread myThread1 = new MyThread(Thread.currentThread());
//        MyThread myThread2 = new MyThread(myThread1);
//        MyThread myThread3 = new MyThread(myThread2);
//        myThread1.start();
//        myThread2.start();
//        myThread3.start();
        Thread thread1 = new Thread(new MyThread1());
        Thread thread2 = new Thread(new MyThread1());
        Thread thread3 = new Thread(new MyThread1());
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(Counter.getCount() / 2);
        System.out.println("Hello World!");
    }
}
