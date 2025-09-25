package test;

public class MyThread extends Thread {

    private Thread thread;

    public MyThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println(currentThread().getName() + " " + i);
        }
    }
}
