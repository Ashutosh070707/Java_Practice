package module3_multithreading;

import module3_multithreading.classes.ConsumeItem;
import module3_multithreading.classes.MonitorLockExample;
import module3_multithreading.classes.ProduceItem;
import module3_multithreading.classes.SharedResource;
import module3_multithreading.threads.ExtendsThread;
import module3_multithreading.threads.SimpleThread;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Thread Name: " + Thread.currentThread().getName());

        // ## Different ways to create a thread in Java

        // 1. Using Runnable interface (recommended way)

        // SimpleThread simpleThread1 = new SimpleThread();
        // Thread thread1 = new Thread(simpleThread1);
        // thread1.start();
        

        // 2. Extending Thread class

        // ExtendsThread extendsThread = new ExtendsThread();
        // extendsThread.start();

        // ## Thread Lifecycle Methods
        // MONITOR LOCK - It helps to make sure that only 1 thread goes inside the particular section of code (a synchronized block)

        // MonitorLockExample obj = new MonitorLockExample();
        // Thread t1 = new Thread(()-> {obj.task1();});   // Lambda expression for Runnable interface
        // Thread t2 = new Thread(()-> {obj.task2();});
        // Thread t3 = new Thread(()-> {obj.task3();});

        // t1.start();
        // t2.start();
        // t3.start();


        SharedResource sharedResource = new SharedResource();
        Thread produceThread = new Thread(new ProduceItem(sharedResource));
        Thread consumeThread = new Thread(new ConsumeItem(sharedResource));

        
        produceThread.start();
        consumeThread.start();
        // System.out.println("Execution of main thread completed.");
    }
}
