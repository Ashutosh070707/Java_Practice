package module3_multithreading.threads;

public class ExtendsThread extends Thread {
    @Override
    public void run() {
        System.out.println("Code executed by thread (ExtendsThread): " + Thread.currentThread().getName());
    }
}
