package module5_future_Callable_CompletableFuture;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
     public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        
        Future<?> futureObj =  executor.submit(()->{            
                System.out.println("Thread got executed: " + Thread.currentThread().getName());
        });

        // Many functions available in future object
        System.out.println(futureObj.isDone());

        try{
            Object object = futureObj.get(); // blocking call
            System.out.println("Object returned from future: " + object);
            System.out.println(object==null);
        }catch(Exception e){
            e.printStackTrace();
        } 
        

        // Callable example
        Future<Integer> futureObj1 =  executor.submit(()->{            
                System.out.println("do something");
                return 45;
        });

        
    }

}
