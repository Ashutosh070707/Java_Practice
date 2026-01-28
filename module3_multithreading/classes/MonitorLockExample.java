package module3_multithreading.classes;

public class MonitorLockExample {
    public synchronized void task1(){
        try{
            System.out.println("inside task1 method");
            Thread.sleep(5000);
        }catch(Exception e){

        }
    }

    public void task2(){
        System.out.println("inside task2 method: before synchronized");
        synchronized (this){
            System.out.println("inside task2 method: after synchronized");
        }
    }

    public void task3(){
        System.out.println("inside task3 method");
    }
}
