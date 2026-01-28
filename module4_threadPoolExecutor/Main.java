package module4_threadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new CustomRejectHandler());

        // executor.allowCoreThreadTimeOut(true);
        
        for(int i=1; i<=7; i++){
            executor.submit(()->{
                try{
                    Thread.sleep(5000);
                } catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("Thread got executed: " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }

}

class CustomRejectHandler implements RejectedExecutionHandler{
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task " + r.toString() + " rejected from " + executor.toString());
    }
} 