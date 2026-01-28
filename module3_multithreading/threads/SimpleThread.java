package module3_multithreading.threads;

public class SimpleThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Code executed by thread: " + Thread.currentThread().getName());
    }
}
